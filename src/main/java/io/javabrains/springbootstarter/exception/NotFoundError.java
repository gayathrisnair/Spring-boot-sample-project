package io.javabrains.springbootstarter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.xml.ws.spi.http.HttpHandler;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundError extends  RuntimeException {
    public NotFoundError(String exception) {
        super(exception);
    }
}
