package mx.edu.utez.davebback.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import mx.edu.utez.davebback.entity.ErrorCode;
import mx.edu.utez.davebback.entity.Response;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {

        System.out.println("Estoy en la excepcion de handleMethodArgumentNotValid");
        
        List<Response> errorList = ErrorCode.mapResponseErrorsFields(ex.getBindingResult().getFieldErrors());
            
        return new ResponseEntity<>(errorList, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
        System.out.println("Estoy en la excepcion de handleHttpMessageNotReadable");

        List<Response> errorList = new ArrayList<>();
        errorList.add(new Response( 2005, "Error en el envío", "Favor de verificar los datos." ));
            
        return new ResponseEntity<>(errorList, HttpStatus.BAD_REQUEST);
    }
}
