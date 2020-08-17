package Interfaces;

import Modelo.Matricula;
import java.util.List;

/**
 *
 * @author TuNombre
 */
public interface CRUD_M {

    public List listarmatricula(); // listar

    public Matricula buscarmatricula(int idmatricula); // buscar

    public boolean agregarmatricula(Matricula matricula); // agregar

    public boolean editarmatricula(Matricula matricula); // editar

    public boolean eliminarmatricula(int idmatricula); // eliminar
}
