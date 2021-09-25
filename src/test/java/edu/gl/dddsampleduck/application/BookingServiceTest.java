package edu.gl.dddsampleduck.application;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.impl.BookingServiceImpl;
import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookingServiceTest {

    BookingServiceImpl bookingService;
    DuckRepository duckRepository;

    @Before
    public void setUp() {
        duckRepository = mock(DuckRepository.class);
        bookingService = new BookingServiceImpl(duckRepository);
    }

    @Test
    public void testRegisterNew() {
        AtomicInteger expectedDuckId = new AtomicInteger(0);

        when(duckRepository.nextDuckId()).thenReturn(expectedDuckId);

        AtomicInteger duckId = bookingService.bookNewDuck("Duck");
        assertThat(duckId.get()).isEqualTo(expectedDuckId.get());
    }

    @After
    public void tearDown() {
        verify(duckRepository, times(1)).store(isA(Duck.class));
    }
}
