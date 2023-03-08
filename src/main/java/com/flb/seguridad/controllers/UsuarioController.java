package com.flb.seguridad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flb.seguridad.models.Usuario;
import com.flb.seguridad.services.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService uService;

    @RequestMapping("/usuario/buscar")
    Usuario findByusername(@RequestParam String username, @RequestParam String password) {
        return uService.findByusername(username, password);
    }
}
