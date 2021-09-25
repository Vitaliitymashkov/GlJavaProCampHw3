package edu.gl.dddsampleduck.interfaces.booking.facade.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * DTO for registering and displaying a duck.
 */
public final class DuckDTO implements Serializable {

  private final String duckId;
  private final String name;

  /**
   * Constructor.
   *
   * @param duckId
   * @param name
   */
  public DuckDTO(String duckId, String name) {
    this.duckId = duckId;
    this.name = name;
  }

  public String getDuckId() {
    return duckId;
  }

  public String getName() {
    return name;
  }
}
