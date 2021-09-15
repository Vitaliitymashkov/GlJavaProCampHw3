package hw2_patterns_Tymashkov.com.globallogic.training.duck.model;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class RunningState implements State {

    private final String TEXT_STATE = "Running";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new WalkingState())
                || duck.getState().equals(new FlyingState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Run previous state should be Walking or Flying");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RunningState that = (RunningState) o;

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
