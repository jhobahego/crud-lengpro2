import modelo.AccesoBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = AccesoBD.getInstancia().getConexion("bdpropiedades","127.0.0.1", "3306", "root", "");

        try {
            ResultSet resultado = connection.createStatement().executeQuery("SELECT * FROM tblPersonas");
            while (resultado.next() ){
                System.out.println(resultado.getString("nombres"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
