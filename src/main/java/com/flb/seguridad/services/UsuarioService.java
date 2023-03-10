package com.flb.seguridad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.seguridad.models.Usuario;
import com.flb.seguridad.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository uRepository;

    public Usuario findByusername(String username, String password) {
        //para comprobar que con la contraseña tmb funciona
        //return uRepository.findByNameAndPassword(username, password);
        return uRepository.findByName(username);
    }
}
