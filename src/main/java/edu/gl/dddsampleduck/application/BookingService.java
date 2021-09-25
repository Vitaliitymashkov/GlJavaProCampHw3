package edu.gl.dddsampleduck.application;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Duck booking service.
 */
public interface BookingService {

    /**
     * Registers a new duck.
     *
     * @param name - name
     * @return Duck id
     */
    AtomicInteger bookNewDuck(String name);
}
