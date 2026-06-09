/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carlos.perez
 */
public class ConexionSqlServer {

    private static ConexionSqlServer instancia;

    private Connection connection;

    private static final String URL
            = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=CreditScoreDb;"
            + "encrypt=false";

    private static final String USER = "sa";

    private static final String PASSWORD = "123456";

    private ConexionSqlServer() {

        try {

            connection
                    = DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD);

        } catch (SQLException ex) {

            throw new RuntimeException(ex);
        }
    }

    public static synchronized ConexionSqlServer getInstancia() {

        if (instancia == null) {

            instancia = new ConexionSqlServer();
        }

        return instancia;
    }

    public Connection getConnection() {

        return connection;
    }
}
