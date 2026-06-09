/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaevaluacioncrediticia;

import com.mycompany.sistemaevaluacioncrediticia.model.dao.IUsuarioDao;
import factory.DaoFactory;

/**
 *
 * @author carlos.perez
 */
public class SistemaEvaluacionCrediticia {

    public static void main(String[] args) {
      IUsuarioDao usuarioDao =
                DaoFactory.obtenerUsuarioDao();

        System.out.println(
                "Sistema iniciado correctamente");
    }
}
