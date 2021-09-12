package hw2_patterns_Tymashkov.com.globallogic.training.duck.model;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class FlyingState implements State {

    private final String textState = "Flying";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new SwimmingState())
                || duck.getState().equals(new RunningState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Fly previous state should be Swimming or Running");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlyingState that = (FlyingState) o;

        return textState != null ? textState.equals(that.textState) : that.textState == null;
    }

    @Override
    public int hashCode() {
        return textState != null ? textState.hashCode() : 0;
    }

    @Override
    public String toString(){
        return this.textState;
    }
}
