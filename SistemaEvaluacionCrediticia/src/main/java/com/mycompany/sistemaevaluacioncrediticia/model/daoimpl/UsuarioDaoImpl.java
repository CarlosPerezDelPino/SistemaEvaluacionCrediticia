/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaevaluacioncrediticia.model.daoimpl;

import com.mycompany.sistemaevaluacioncrediticia.model.dao.IUsuarioDao;
import com.mycompany.sistemaevaluacioncrediticia.model.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import persistence.ConexionSqlServer;

/**
 *
 * @author carlos.perez
 */
public class UsuarioDaoImpl implements IUsuarioDao {

    private final Connection connection;

    public UsuarioDaoImpl() {

        connection
                = ConexionSqlServer
                        .getInstancia()
                        .getConnection();
    }

    @Override
    public void guardar(Usuario usuario) {
        String sql = """
        INSERT INTO Usuario
        (
            Nombre,
            CorreoElectronico,
            PasswordHash
        )
        VALUES
        (
            ?, ?, ?
        )
        """;

        try (
                PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombre());

            ps.setString(2, usuario.getCorreoElectronico());

            ps.setString(3, usuario.getPasswordHash());

            ps.executeUpdate();

        } catch (SQLException ex) {

            throw new RuntimeException(ex);
        }
    }

    @Override
    public void actualizar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Integer idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Usuario> buscarPorId(Integer idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Usuario> buscarPorCorreo(String correoElectronico) {
        String sql = """
        SELECT *
        FROM Usuario
        WHERE CorreoElectronico = ?
        """;

        try (
                PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, correoElectronico);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("IdUsuario"));

                usuario.setNombre(rs.getString("Nombre"));

                usuario.setCorreoElectronico(rs.getString("CorreoElectronico"));

                usuario.setPasswordHash(rs.getString("PasswordHash"));

                return Optional.of(usuario);
            }

            return Optional.empty();

        } catch (SQLException ex) {

            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Usuario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
