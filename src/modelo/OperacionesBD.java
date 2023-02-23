package modelo;

import javax.swing.*;
import java.sql.Connection;

public interface OperacionesBD {

    Connection cnx = AccesoBD.getInstancia().getConexion();

    public boolean create();

    public Object read(int id);

    public boolean update(int id);

    public boolean delete(int id);

    public boolean deleteAll();

    public void llenarTabla();

    public void llenarListaDesplegable(JComboBox lista);
}
