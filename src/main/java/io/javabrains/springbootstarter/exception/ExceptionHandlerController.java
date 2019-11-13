package io.javabrains.springbootstarter.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@RestController

public class ExceptionHandlerController  extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Object> handleConstraintViolation(Exception ex, WebRequest webRequest){
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        CustomException error = new CustomException("Invalid model");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TransactionSystemException.class)
    public ResponseEntity<Object> handleConstraintViolationTest(Exception ex, WebRequest webRequest){
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        CustomException error = new CustomException("Invalid model");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundError.class)
    public ResponseEntity<Object> Notfound(Exception ex, WebRequest webRequest){
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        CustomException error = new CustomException("Invalid model");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
    }
}
