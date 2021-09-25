package edu.gl.dddsampleduck.infrastructure.persistence.inmemory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.exception.ExceptionResponse;
import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;

/**
 * DuckRepositoryInMemory implements the DuckRepository interface but is a test
 * class not intended for usage in real application.
 * <p>
 * It setup a simple local hash with a number of Duck's with duckId as key
 * defined at compile time.
 * <p>
 */
public class DuckRepositoryInMemory implements DuckRepository {
    private static final AtomicInteger duckIdIncrement = new AtomicInteger(0);

    private final Map<AtomicInteger, Duck> duckDb;

    /**
     * Constructor.
     */
    public DuckRepositoryInMemory() {
        duckDb = new HashMap<>();
    }

    @Override
    public Duck find(final AtomicInteger duckId) {
        return duckDb.get(duckId);
    }

    @Override
    public void store(final Duck duck) {
        duckDb.put(duck.getDuckId(), duck);
    }

    @Override
    public List<Duck> findAll() {
        return new ArrayList<>(duckDb.values());
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
