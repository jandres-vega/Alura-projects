package com.company.mensajes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class mensajesDAO {

    public static void crearMensaje(Mensajes mensaje){
        Conexion dbConnect = new Conexion();
        try {
            Connection cnx = dbConnect.getConexion();
            PreparedStatement ps;
            try {
                String query = "INSERT INTO mensajes ( mensaje, autor_mensaje) VALUES (?,?)";
                ps = cnx.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("El mensaje creado");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void leerMensajes(){
        Conexion conexion = new Conexion();
        try {
            Connection conn = conexion.getConexion();
            PreparedStatement ps;
            ResultSet rs;
            try {
                String query = "SELECT * FROM mensajes";
                ps = conn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()){
                    System.out.println("ID "+ rs.getInt("id_mensaje"));
                    System.out.println("mensaje "+ rs.getString("mensaje"));
                    System.out.println("author "+ rs.getString("autor_mensaje"));
                    System.out.println("fecha "+ rs.getString("fecha_mensaje"));
                    System.out.println();
                }

            }catch (Exception e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void borrarMensaje(int id){
        Conexion conexion = new Conexion();
        try {
            Connection conn = conexion.getConexion();
            PreparedStatement ps;
            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Mensaje eliminado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("no se pudo eliminar el mensaje");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void actualizarMensaje(Mensajes mensaje){
        Conexion conexion = new Conexion();
        try {
            Connection conn = conexion.getConexion();
            PreparedStatement ps;
            try {
                String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps = conn.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getId_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje actualizado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("no se pudo actualizar mensaje");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
