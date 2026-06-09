/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import com.mycompany.sistemaevaluacioncrediticia.model.dao.IUsuarioDao;
import com.mycompany.sistemaevaluacioncrediticia.model.daoimpl.UsuarioDaoImpl;

/**
 *
 * @author carlos.perez
 */
public class DaoFactory {

    private DaoFactory() {
    }

    public static IUsuarioDao obtenerUsuarioDao() {

        return new UsuarioDaoImpl();
    }
}
