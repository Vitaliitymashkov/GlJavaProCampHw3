package edu.gl.dddsampleduck.interfaces.booking.facade;

import java.rmi.RemoteException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.interfaces.booking.facade.dto.DuckDTO;

/**
 * This facade shields the domain layer - model, services, repositories -
 * from concerns about such things as the user interface.
 */
public interface DuckServiceFacade {

  String bookNewDuck(String name) throws RemoteException;

  DuckDTO loadDuck(AtomicInteger duckId);

  List<DuckDTO> listAllDucks() throws RemoteException;
}
