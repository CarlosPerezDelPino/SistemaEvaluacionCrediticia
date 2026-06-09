/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaevaluacioncrediticia.model.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 *
 * @author carlos.perez
 */
public class UsuarioDaoTest {

    @Test
    void deberiaCrearMockDao() {

        IUsuarioDao usuarioDao = Mockito.mock(IUsuarioDao.class);

        assertNotNull(usuarioDao);
    }
}
