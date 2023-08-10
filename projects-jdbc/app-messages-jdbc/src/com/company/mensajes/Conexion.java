package com.company.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConexion(){
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_db", "root", "Andres1201*");

        }catch (SQLException e){
            System.out.println(e);
        }

        return conection;
    }
}
