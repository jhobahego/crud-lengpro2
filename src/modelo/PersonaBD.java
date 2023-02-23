package modelo;

import javax.swing.*;

public class PersonaBD extends Persona implements OperacionesBD{
    @Override
    public boolean create() {
        return false;
    }

    @Override
    public Object read(int id) {
        return null;
    }

    @Override
    public boolean update(int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public void llenarTabla() {

    }

    @Override
    public void llenarListaDesplegable(JComboBox lista) {

    }
}
