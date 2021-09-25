package edu.gl.dddsampleduck.interfaces.duck.web;

import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.application.exception.ExceptionResponse;
import edu.gl.dddsampleduck.domain.model.duck.Duck;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DuckRestController {

    private static final Logger logger = LoggerFactory.getLogger(DuckRestController.class);

    @Autowired
    DuckRepository duckRepository;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @RequestMapping(value = "/duck", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<Object> create(@RequestBody Duck duck) {
        duckRepository.store(duck);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Object>("{\"id\": " + "\"" + duck.getDuckId() + "\"}", headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/duck/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public ResponseEntity<Object> read(@PathVariable("id") int id) {
        Duck duck = duckRepository.find(new AtomicInteger(id));
        HttpHeaders headers = new HttpHeaders();
        if (duck == null) {
            ExceptionResponse response = new ExceptionResponse("id", "Not Found");
            return new ResponseEntity<>(response, headers, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(duck, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/duck/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<Object> update(@PathVariable("id") int id, @RequestBody Duck duck) throws ExceptionResponse {
        Duck duckUpdated = duckRepository.update(new AtomicInteger(id), duck);
        HttpHeaders headers = new HttpHeaders();
        if (duckUpdated == null) {
            ExceptionResponse response = new ExceptionResponse("id", "Not Found");
            return new ResponseEntity<>(response, headers, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(duckUpdated, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/duck/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ExceptionResponse {
        Duck duck = duckRepository.deleteDuck(new AtomicInteger(id));
        HttpHeaders headers = new HttpHeaders();
        if (duck == null) {
            ExceptionResponse response = new ExceptionResponse("id", "Not Found");
            return new ResponseEntity<>(response, headers, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("{\"deleted \":" + "\"" + duck + "\"}", headers, HttpStatus.OK);
    }
}
