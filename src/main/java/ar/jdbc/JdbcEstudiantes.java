package ar.jdbc;

import java.util.List;
import java.util.stream.Collectors;

import ar.model.Estudiante;
import ar.servicios.Estudiantes;

public class JdbcEstudiantes implements Estudiantes {

    @Override
    public void crearEstudiante(String nombre, String apellido, String[] cursos) {
        Estudiante e = new Estudiante(nombre, apellido, cursos);
        System.out.println(e.toString());
    }

    @Override
    public List<Estudiante> estudiantes(String apellido) {
        Estudiante e1 = new Estudiante("Agustin", "Martinez", new String[] {"Angular","Python"});
        Estudiante e2 = new Estudiante("Francisco", "Garcia", new String[] {"Java"});
        Estudiante e3 = new Estudiante("Juan", "Perez", new String[] {"Docker"});

        var estudiantes = List.of(e1, e2, e3);

        if (apellido == null || apellido.isEmpty())
            return estudiantes;

        return estudiantes.stream().filter((e) -> {
            return e.containsApellido(apellido);
        }).collect(Collectors.toList());
    }
}
