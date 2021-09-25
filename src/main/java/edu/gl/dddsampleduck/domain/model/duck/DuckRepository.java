package edu.gl.dddsampleduck.domain.model.duck;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.exception.ExceptionResponse;

public interface DuckRepository {

    /**
     * Finds a duck using given id.
     *
     * @param duckId Id
     * @return Duck if found, else {@code null}
     */
    Duck find(AtomicInteger duckId);

    /**
     * Finds all ducks.
     *
     * @return All ducks.
     */
    List<Duck> findAll();

    /**
     * Saves given duck.
     *
     * @param duck - duck to save
     */
    void store(Duck duck);

    /**
     * Updates given duck.
     *  @param duckId - duckId to update
     * @param duck - duck to update
     * @return duck updated
     */
    Duck update(AtomicInteger duckId, Duck duck) throws ExceptionResponse;

    /**
     * Deletes given duck.
     * @param duckId - duckId to delete
     * @return duck deleted
     */
    Duck deleteDuck(AtomicInteger duckId) throws ExceptionResponse;

    /**
     * @return A unique, generated duck Id.
     */
    AtomicInteger nextDuckId();
}