package ar.web;

public class EstudianteDto {

    private String nombre;
    private String apellido;
    private String[] cursos;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String[] getCursos() {
        return cursos;
    }
}
