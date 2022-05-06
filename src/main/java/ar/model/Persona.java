package ar.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Persona {

 private String nombre;
 private String apellido;
 private List<Telefono> telefonos = new ArrayList<>();
 private Direccion direccion;

 public Persona(String nombre, String apellido, String direccion,
                String[] telefonos) {

  var check = new NotNullNotEmpty("nombre", nombre, "apellido", apellido,
          "direccion", direccion, "telefonos", telefonos);
  check.throwOnError();

  this.nombre = nombre;
  this.apellido = apellido;
  this.direccion = new Direccion(direccion);

  this.telefonos.addAll(List.of(telefonos).stream().map((t) -> {
   return new Telefono(t);
  }).collect(Collectors.toList()));
 }

 @Override
 public String toString() {
  return "Persona [nombre=" + nombre + ", apellido=" + apellido
    + ", telefonos=" + telefonos + ", direccion=" + direccion + "]";
 }

 public Map<String, Object> toMap() {
  var map = new HashMap<String, Object>(
    Map.of("nombre", nombre, "apellido", apellido));

  if (this.direccion != null) {
   map.put("direccion", this.direccion.toMap());
  }

  if (this.telefonos != null && this.telefonos.size() > 0) {
   map.put("telefonos", telefonos.stream().map((e) -> e.toMap())
     .collect(Collectors.toList()));
  }
  return map;
 }

 public boolean containsApellido(String apellido) {
  return this.apellido.contains(apellido);
 }
}
