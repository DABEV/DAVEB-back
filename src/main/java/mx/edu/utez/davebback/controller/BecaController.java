package mx.edu.utez.davebback.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.davebback.entity.Beca;
import mx.edu.utez.davebback.entity.Response;

@RestController
@RequestMapping("/beca")
public class BecaController {
    @PostMapping("/registrar")
    Response registrar (@RequestBody Beca beca) {
        Response res = new Response();
        return res;
    }
}
