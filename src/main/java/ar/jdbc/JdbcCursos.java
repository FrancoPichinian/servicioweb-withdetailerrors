package ar.jdbc;

import java.util.List;

import ar.model.Curso;
import ar.servicios.Cursos;

public class JdbcCursos implements Cursos {

    @Override
    public List<Curso> cursos() {
        return List.of(new Curso("Angular"), new Curso("Java"),
                new Curso("Docker"), new Curso("Python"));
    }
}
