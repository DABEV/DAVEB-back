package mx.edu.utez.davebback.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.davebback.entity.ErrorCode;
import mx.edu.utez.davebback.entity.Estudiante;
import mx.edu.utez.davebback.entity.Response;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {    

    private List<Response> listResponse;

    @PostMapping("/registrar")
    @ResponseBody
    public List<Response> registrar (@Valid @RequestBody Estudiante estudiante, BindingResult result) {
        try {
            listResponse = new ArrayList<>();
            if (result.hasErrors()) {
                listResponse = ErrorCode.mapResponseErrorsFields(result.getFieldErrors());
            } else {
                listResponse.add(new Response(4001, "Éxito", "Se ha realizado la acción correctamente"));
            }
        } catch (Exception e) {
            listResponse = new ArrayList<>();
            listResponse.add(new Response(2005, "Error en el envío", "Favor de verificar los datos."));
        }

        return listResponse;
    }
}
