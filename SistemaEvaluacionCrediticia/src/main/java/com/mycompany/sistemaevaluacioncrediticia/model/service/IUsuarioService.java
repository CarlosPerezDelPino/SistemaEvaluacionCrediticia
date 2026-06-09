/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaevaluacioncrediticia.model.service;

import com.mycompany.sistemaevaluacioncrediticia.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author carlos.perez
 */
public interface IUsuarioService {
    void registrarUsuario(
            Usuario usuario);

    Usuario autenticarUsuario(
            String correoElectronico,
            String passwordPlano);

    Usuario obtenerUsuarioPorId(
            Integer idUsuario);

    List<Usuario> listarUsuarios();
}
