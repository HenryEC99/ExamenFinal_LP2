package ModeloDAO;

import Config.bd.ConectaBd;
import Modelo.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_M;

public class MatriculaDAO implements CRUD_M {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Matricula e = new Matricula();

    public List listarmatricula() {
        ArrayList<Matricula> matriculas = new ArrayList<>();
        String consulta = " select * "
                + " from matricula ";

        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Matricula matricula = new Matricula();

                matricula.setIdmatricula(rs.getInt("idmatricula"));
                matricula.setSemestre(rs.getString("semestre"));
                matricula.setCiclo(rs.getInt("ciclo"));
                matricula.setEstado(rs.getString("estado"));
                matricula.setIdcurso(rs.getInt("idcurso"));
                matricula.setIdestudiante(rs.getInt("idestudiante"));
                matricula.setIdcarrera(rs.getInt("idcarrera"));
                matriculas.add(matricula);
            }
        } catch (Exception e) {

        }
        return matriculas;
    }

    @Override
    public Matricula buscarmatricula(int idmatricula) {
        String consulta = " select *  "
                + " from matricula  "
                + " where idmatricula = " + idmatricula + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {

                e.setIdmatricula(rs.getInt("idmatricula"));
                e.setSemestre(rs.getString("semestre"));
                e.setCiclo(rs.getInt("ciclo"));
                e.setEstado(rs.getString("estado"));
                e.setIdcurso(rs.getInt("idcurso"));
                e.setIdestudiante(rs.getInt("idestudiante"));
                e.setIdcarrera(rs.getInt("idcarrera"));
            }
        } catch (Exception e) {
        }

        return e;
    }

    @Override
    public boolean agregarmatricula(Matricula matricula) {
        String consulta = " insert into matricula(semestre, ciclo, estado, idcurso, idestudiante, idcarrera) "
                + " values( "
                + "'" + matricula.getSemestre() + "', "
                + "'" + matricula.getCiclo() + "', "
                + "'" + matricula.getEstado() + "', "
                + "'" + matricula.getIdcurso() + "', "
                + "'" + matricula.getIdestudiante() + "', "
                + "'" + matricula.getIdcarrera() + "') ";

        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean editarmatricula(Matricula matricula) {
        String consulta = " update matricula "
                + " set "
                + " semestre = '" + matricula.getSemestre() + "', "
                + " ciclo = '" + matricula.getCiclo() + "', "
                + " estado = '" + matricula.getEstado() + "', "
                + " idcurso = '" + matricula.getIdcurso() + "', "
                + " idestudiante = '" + matricula.getIdestudiante() + "', "
                + " idcarrera = '" + matricula.getIdcarrera() + "' "
                + " where "
                + " idmatricula = " + matricula.getIdmatricula() + "; ";

        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public boolean eliminarmatricula(int idmatricula) {
        String consulta = " delete from matricula "
                + " where "
                + " idmatricula = " + idmatricula + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
