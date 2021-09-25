package edu.gl.dddsampleduck.domain.model.duck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.exception.ExceptionResponse;

public class Duck implements Cloneable, Bird {
    private static final String EMPTY_STRING = "";
    private final AtomicInteger duckId;
    private int age;
    private String color;
    private String name;
    private double weight;
    private double wingsLength;
    private State state = new StandingState();

    private Map<String, String> innerProperties = new HashMap<>();

    public AtomicInteger getDuckId() {
        return duckId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    public Duck() {
        this.duckId = new DuckRepositoryInMemory().nextDuckId();
    }

    public void setProperty(String name, String value) {
        if (Objects.isNull(name)) {
            return;
        }
        innerProperties.put(name, value);
    }

    public String getProperty(String name) {
        if (null == name || !innerProperties.containsKey(name)) {
            return EMPTY_STRING;
        }
        return innerProperties.get(name);
    }

    public void removeProperty(String name) {
        if (null == name || !innerProperties.containsKey(name)) {
            return;
        }
        innerProperties.remove(name);
    }

    public void removeProperties() {
        innerProperties.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Duck duck = (Duck) o;

        return duckId.equals(duck.duckId);
    }

    @Override
    public int hashCode() {
        return duckId.get() ^ (duckId.get() >>> 32);
    }

    private Duck(AtomicInteger duckId) {
        this.duckId = duckId;
    }

    public Duck(Duck sourceDuck) {
        this.duckId = sourceDuck.duckId;
        this.age = sourceDuck.age;
        this.color = sourceDuck.color;
        this.name = sourceDuck.name;
        this.weight = sourceDuck.weight;
        this.wingsLength = sourceDuck.wingsLength;
        this.state = sourceDuck.state;
        this.innerProperties = sourceDuck.innerProperties;
    }

    @Override
    public Duck clone() throws CloneNotSupportedException {
        return (Duck) super.clone();
    }

    @Override
    public String toString() {
        return "Duck " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", wingsLength=" + wingsLength +
                ", state=" + state.toString() +
                ", {" +
                "innerProperties=" + innerProperties +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Krya-Krya");
    }

    public static class DuckRepositoryInMemory implements DuckRepository {
        private static final AtomicInteger duckIdIncrement = new AtomicInteger(0);
        private final Map<AtomicInteger, Duck> duckDb;

        /**
         * Constructor.
         */
        public DuckRepositoryInMemory() {
            duckDb = new HashMap<>();
        }

        public void init() throws Exception {
        }

        @Override
        public Duck find(AtomicInteger duckId) {
            return duckDb.get(duckId);
        }

        @Override
        public List<Duck> findAll() {
            return new ArrayList<Duck>(duckDb.values());
        }

        @Override
        public void store(final Duck duck) {
            duckDb.put(duck.getDuckId(), duck);
        }

        @Override
        public Duck update(AtomicInteger duckId, Duck duck) throws ExceptionResponse {
            if (duckDb.containsKey(duckId)) {
                duckDb.put(duckId, duck);
                return duck;
            } else {
                throw new ExceptionResponse(duckId.toString(), "Not Found in DB. Cannot update!");
            }
        }

        @Override
        public Duck deleteDuck(AtomicInteger duckId) throws ExceptionResponse {
            if (duckDb.containsKey(duckId)) {
                return duckDb.remove(duckId);
            } else {
                throw new ExceptionResponse(duckId.toString(), "Not Found in DB. Cannot delete!");
            }
        }

        @Override
        public AtomicInteger nextDuckId() {
            return new AtomicInteger(duckIdIncrement.getAndIncrement());
        }
    }
}
