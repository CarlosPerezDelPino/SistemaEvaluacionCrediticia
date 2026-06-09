/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author carlos.perez
 */
public class PasswordEncoderTest {
    @Test
    void deberiaGenerarHashCorrectamente() {

        PasswordEncoder encoder =
                new PasswordEncoder();

        String hash = encoder.generarHash("123456");

        assertNotNull(hash);
    }

    @Test
    void deberiaValidarPasswordCorrectamente() {

        PasswordEncoder encoder =
                new PasswordEncoder();

        String hash =
                encoder.generarHash("123456");

        boolean resultado = encoder.verificarPassword(
                        "123456",
                        hash);

        assertTrue(resultado);
    } 
}
