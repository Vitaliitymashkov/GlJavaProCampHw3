package edu.gl.dddsampleduck.application.impl;

import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.BookingService;
import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;

public class BookingServiceImpl implements BookingService {

    private final DuckRepository duckRepository;
    private final Log logger = LogFactory.getLog(getClass());

    public BookingServiceImpl(final DuckRepository duckRepository) {
        this.duckRepository = duckRepository;
    }

    @Override
    @Transactional
    public AtomicInteger bookNewDuck(String name) {
        final AtomicInteger duckId = duckRepository.nextDuckId();

        final Duck duck = new Duck();

        duckRepository.store(duck);
        logger.info("Booked new duck with tracking id " + duck.getDuckId());

        return duck.getDuckId();
    }
}
