package mx.edu.utez.davebback.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.davebback.entity.Beca;
import mx.edu.utez.davebback.entity.Response;

@RestController
@RequestMapping("/beca")
public class BecaController {
    private Response response;
    

    @PostMapping("/registrar")
    Response registrar(@Valid @RequestBody Beca beca, BindingResult result) {
        response = new Response();

        if (result.hasErrors()) {
            for (FieldError error : result.getFieldErrors() ) {
                System.out.println (error.getObjectName() + " - " + error.getDefaultMessage() + " - " + error.getCode());
            }
            
            response.setEstatus(2000);
            response.setTítulo("Titulo de mensaje");
            response.setMensaje("Hubo un error");

        } else {
            response.setEstatus(2000);
            response.setTítulo("Titulo de mensaje correcto");
            response.setMensaje("Anda GOD");
        }

        return response;
    }
}
