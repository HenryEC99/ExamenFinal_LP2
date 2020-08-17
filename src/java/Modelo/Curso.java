
package Modelo;

public class Curso {
    private int idcurso;
    private String nombre;
    private String horas;
    private String creditos;
    private String estado;
  
    public Curso() {
    }
    
    public Curso(int idcurso, String nombre, String horas, String creditos, String estado) {
        this.idcurso = idcurso;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.estado = estado;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    

    
}
