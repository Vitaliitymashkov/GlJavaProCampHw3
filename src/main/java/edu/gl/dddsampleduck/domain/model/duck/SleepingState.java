package edu.gl.dddsampleduck.domain.model.duck;

public class SleepingState implements State {

    private final String TEXT_STATE = "Sleeping";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new StandingState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Sleep previous state should be Standing");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SleepingState that = (SleepingState) o;

        return TEXT_STATE != null ? TEXT_STATE.equals(that.TEXT_STATE) : that.TEXT_STATE == null;
    }

    @Override
    public int hashCode() {
        return TEXT_STATE != null ? TEXT_STATE.hashCode() : 0;
    }

    @Override
    public String toString(){
        return this.TEXT_STATE;
    }
}
