/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaevaluacioncrediticia.model.service;

import com.mycompany.sistemaevaluacioncrediticia.model.dao.IUsuarioDao;
import com.mycompany.sistemaevaluacioncrediticia.model.entity.Usuario;
import exception.CorreoDuplicadoException;
import exception.CredencialesInvalidasException;
import java.util.List;
import security.PasswordEncoder;

/**
 *
 * @author carlos.perez
 */
public class UsuarioServiceImpl implements IUsuarioService {

    private final IUsuarioDao usuarioDao;

    private final PasswordEncoder passwordEncoder;

    public UsuarioServiceImpl(
            IUsuarioDao usuarioDao,
            PasswordEncoder passwordEncoder) {

        this.usuarioDao = usuarioDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        boolean existeCorreo = usuarioDao.buscarPorCorreo(usuario.getCorreoElectronico()).isPresent();

        if (existeCorreo) {

            throw new CorreoDuplicadoException("Correo ya registrado");
        }

        String hash = passwordEncoder.generarHash(usuario.getPasswordHash());

        usuario.setPasswordHash(hash);

        usuarioDao.guardar(usuario);
    }

    @Override
    public Usuario autenticarUsuario(String correoElectronico, String passwordPlano) {
        Usuario usuario = usuarioDao.buscarPorCorreo(correoElectronico)
                .orElseThrow(() -> new CredencialesInvalidasException("Usuario no existe"));

        boolean passwordValido = passwordEncoder.verificarPassword(passwordPlano, usuario.getPasswordHash());

        if (!passwordValido) {

            throw new CredencialesInvalidasException("Password incorrecto");
        }

        return usuario;
    }

    @Override
    public Usuario obtenerUsuarioPorId(Integer idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> listarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
