package edu.gl.dddsampleduck.application.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.DuckService;
import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;
import edu.gl.dddsampleduck.domain.model.duck.State;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DuckServiceImpl implements DuckService {
    private final Log logger = LogFactory.getLog(getClass());

    @Override
    public AtomicInteger bookNewDuck(String name) {
        final Duck duck = new Duck();
        duck.setName(name);

        DuckRepository duckRepository = new Duck.DuckRepositoryInMemory();
        duckRepository.store(duck);
        logger.info("Booked new duck with id " + duck.getDuckId());

        return duck.getDuckId();
    }

    @Override
    public List<State> requestPossibleStatesForDuck(AtomicInteger duckId) {
        return null;
    }
}
