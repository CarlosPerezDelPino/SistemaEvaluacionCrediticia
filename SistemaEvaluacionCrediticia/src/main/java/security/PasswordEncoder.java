/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author carlos.perez
 */
public class PasswordEncoder {
   public String generarHash(
            String passwordPlano) {

        return BCrypt.hashpw(
                passwordPlano,
                BCrypt.gensalt());
    }

    public boolean verificarPassword(
            String passwordPlano,
            String passwordHash) {

        return BCrypt.checkpw(
                passwordPlano,
                passwordHash);
    }  
}
