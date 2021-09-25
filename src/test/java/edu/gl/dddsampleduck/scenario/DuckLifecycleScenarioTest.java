package edu.gl.dddsampleduck.scenario;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.impl.BookingServiceImpl;
import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;
import edu.gl.dddsampleduck.infrastructure.persistence.inmemory.DuckRepositoryInMemory;
import org.junit.Before;
import org.junit.Test;

public class DuckLifecycleScenarioTest {

    /**
     * Repository implementations are part of the infrastructure layer,
     * which in this test is stubbed out by in-memory replacements.
     */
    DuckRepository duckRepository;

    @Before
    public void setUp() {
        duckRepository = mock(DuckRepositoryInMemory.class);
    }

    @Test
    public void testRepository() {
        Duck duck = new Duck();
        duck.setName("TestDuck");
        duckRepository.store(duck);

        Duck duckFromRepository = duckRepository.find(duck.getDuckId());
        assertThat(duckFromRepository.getDuckId()).isNotNull();
    }

}
