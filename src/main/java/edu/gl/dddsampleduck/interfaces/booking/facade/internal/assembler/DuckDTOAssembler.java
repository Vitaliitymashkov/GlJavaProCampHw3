package edu.gl.dddsampleduck.interfaces.booking.facade.internal.assembler;

import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.interfaces.booking.facade.dto.DuckDTO;

/**
 * Assembler class for the CargoRoutingDTO.
 */
public class DuckDTOAssembler {

    /**
     * @param duck duck
     * @return A duck DTO
     */
    public DuckDTO toDTO(final Duck duck) {
        final DuckDTO dto = new DuckDTO(
                duck.getDuckId().toString(),
                duck.getName());
        return dto;
    }

}
