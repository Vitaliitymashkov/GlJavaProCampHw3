package edu.gl.dddsampleduck.domain.model.duck;

public class StandingState implements State {

    private final String TEXT_STATE = "Standing";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new SwimmingState())
                || duck.getState().equals(new WalkingState())
                || duck.getState().equals(new SleepingState())
                || duck.getState().equals(new EatingState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Stand previous state should be Swimming or Walking or Sleeping or Eating");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StandingState that = (StandingState) o;

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
