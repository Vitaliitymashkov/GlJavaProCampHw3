package edu.gl.dddsampleduck.interfaces.booking.facade.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.BookingService;
import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;
import edu.gl.dddsampleduck.interfaces.booking.facade.DuckServiceFacade;
import edu.gl.dddsampleduck.interfaces.booking.facade.dto.DuckDTO;
import edu.gl.dddsampleduck.interfaces.booking.facade.internal.assembler.DuckDTOAssembler;

/**
 * This implementation has additional support from the infrastructure, for exposing as an RMI
 * service and for keeping the OR-mapper unit-of-work open during DTO assembly,
 * analogous to the view rendering for web interfaces.
 */
public class DuckServiceFacadeImpl implements DuckServiceFacade {

    private BookingService bookingService;
    private DuckRepository duckRepository;

    @Override
    public String bookNewDuck(String name) {
        AtomicInteger duckId = bookingService.bookNewDuck(name);
        return duckId.toString();
    }

    @Override
    public DuckDTO loadDuck(AtomicInteger duckId) {
        final Duck duck = duckRepository.find(duckId);
        final DuckDTOAssembler assembler = new DuckDTOAssembler();
        return assembler.toDTO(duck);
    }

    @Override
    public List<DuckDTO> listAllDucks() {
        final List<Duck> duckList = duckRepository.findAll();
        final List<DuckDTO> dtoList = new ArrayList<DuckDTO>(duckList.size());
        final DuckDTOAssembler assembler = new DuckDTOAssembler();
        for (Duck duck : duckList) {
            dtoList.add(assembler.toDTO(duck));
        }
        return dtoList;
    }

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void setDuckRepository(DuckRepository duckRepository) {
        this.duckRepository = duckRepository;
    }
}
