/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.sistemaevaluacioncrediticia.model.entity.Usuario;
import com.mycompany.sistemaevaluacioncrediticia.model.service.IUsuarioService;

/**
 *
 * @author carlos.perez
 */
public class UsuarioController {

    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {

        this.usuarioService = usuarioService;
    }

    public void registrarUsuario(Usuario usuario) {

        usuarioService.registrarUsuario(usuario);
    }

    public Usuario login(
            String correo,
            String password) {

        return usuarioService.autenticarUsuario(correo, password);
    }
}
