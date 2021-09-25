package edu.gl.dddsampleduck.application;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.domain.model.duck.State;

public interface DuckService {

    /**
     * Registers a new cargo in the tracking system, not yet routed.
     *
     * @param name duck name
     * @return Duck id
     */
    AtomicInteger bookNewDuck(String name);

    /**
     * Requests a list of states for this duck.
     *
     * @param duckId - duck id
     * @return A list of possible states for this duck
     */
    List<State> requestPossibleStatesForDuck(AtomicInteger duckId);

}
