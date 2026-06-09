/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author carlos.perez
 */
public class CorreoDuplicadoException extends RuntimeException{
     public CorreoDuplicadoException(
            String mensaje) {

        super(mensaje);
    }
}
