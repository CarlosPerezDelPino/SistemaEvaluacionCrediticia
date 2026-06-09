/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaevaluacioncrediticia.model.dao;

import com.mycompany.sistemaevaluacioncrediticia.model.entity.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author carlos.perez
 */
public interface IUsuarioDao {
    void guardar(Usuario usuario);

    void actualizar(Usuario usuario);

    void eliminar(Integer idUsuario);

    Optional<Usuario> buscarPorId(
            Integer idUsuario);

    Optional<Usuario> buscarPorCorreo(
            String correoElectronico);

    List<Usuario> listarTodos(); 
}
