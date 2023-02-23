package modelo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoBD {

    private static AccesoBD instancia = null;

    private Connection connection = null;

    private boolean conectado = false;

    private String laBasedeDatos;
    private String laIP;
    private String elPuerto;
    private String elUsuario;
    private String elPass;

    private AccesoBD(){}

    public static AccesoBD getInstancia(){
        if(instancia == null){
            instancia = new AccesoBD();
        }
        return instancia;
    }

    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"ERROR CON EL DRIVER DE CONEXION\n" + e, "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        try {
            //Con Stored Procedures
            String url = "jdbc:mysql://"+ laIP + ":" + elPuerto + "/" + laBasedeDatos + "?useSSL=false";
            connection = DriverManager.getConnection(url,elUsuario,elPass);
            conectado = true;
            System.out.println("Conectado.");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR AL CONCECTAR\n" + e, "Conexión Fallida", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        return true;
    }

    public boolean cerrarConexion(){
        try {
            connection.close();
            connection = null;
            conectado = false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR AL CERRAR LA CONEXION\n" + e.toString(), "Conexión Cerrada", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public Connection getConexion( String base, String dir, String pue, String u, String p ) {
        laBasedeDatos = base;
        laIP = dir;
        elPuerto = pue;
        elUsuario = u;
        elPass = p;

        if (connection == null) {
            crearConexion();
        }
        return connection;
    }

    public Connection getConexion() {

        if (connection == null) {
            crearConexion();
        }
        return connection;
    }
}
