package ar.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private List<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre, String apellido, String[] cursos) {

        var check = new NotNullNotEmpty("nombre", nombre, "apellido", apellido, "cursos", cursos);
        check.throwOnError();

        this.nombre = nombre;
        this.apellido = apellido;

        this.cursos.addAll(List.of(cursos).stream().map((c) -> {
            return new Curso(c);
        }).collect(Collectors.toList()));

        long leftLimit = 1L;
        long rightLimit = 1000L;
        this.id = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    }

    public void addCurso(String curso) {
        this.cursos.add(new Curso (curso));
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", curso=" + cursos + "]";
    }

    public boolean containsApellido(String apellido) {
        return this.apellido.contains(apellido);
    }

    public Map<String, Object> toMap() {
        var map = new HashMap<String, Object>(
                Map.of("nombre", nombre, "apellido", apellido));

        if (this.cursos != null && this.cursos.size() > 0) {
            map.put("cursos", cursos.stream().map((e) -> e.toMap())
                    .collect(Collectors.toList()));
        }
        return map;
    }
}
