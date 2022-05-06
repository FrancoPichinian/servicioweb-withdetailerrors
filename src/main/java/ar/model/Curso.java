package ar.model;

import java.util.Map;

public class Curso {
    private String nombre;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }

    public Map<String, Object> toMap() {
        return Map.of("nombre", nombre);
    }

    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + "]";
    }
}
