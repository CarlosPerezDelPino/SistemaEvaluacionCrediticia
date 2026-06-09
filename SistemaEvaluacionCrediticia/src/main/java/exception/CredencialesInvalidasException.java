/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author carlos.perez
 */
public class CredencialesInvalidasException extends RuntimeException {

    public CredencialesInvalidasException(
            String mensaje) {

        super(mensaje);
    }
}
