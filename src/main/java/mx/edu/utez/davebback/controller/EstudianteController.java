package mx.edu.utez.davebback.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.davebback.entity.Estudiante;
import mx.edu.utez.davebback.entity.Response;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {    

    private Response response ;

    @PostMapping("/registrar")
    @ResponseBody
    public Response registrar (@Valid @RequestBody Estudiante estudiante, BindingResult result) {
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
