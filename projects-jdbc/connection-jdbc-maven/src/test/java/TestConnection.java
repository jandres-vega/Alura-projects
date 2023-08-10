import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root","Andres20");
            System.out.println("Cerrando conexion");
            connect.close();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
