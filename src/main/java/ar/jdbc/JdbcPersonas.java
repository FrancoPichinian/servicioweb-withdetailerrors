package ar.jdbc;

import java.util.List;
import java.util.stream.Collectors;

import ar.model.Persona;
import ar.servicios.Personas;

public class JdbcPersonas implements Personas {

 //constructor con dependencias

 @Override
 public List<Persona> personas(String apellido) {
  Persona p1 = new Persona("Joaquin", "Garcia", "San Martin 123",
          new String[] { "1234", "5667" });
  Persona p2 = new Persona("Emilio", "Peroz", "Belgrano 34",
          new String[] { "1111" });
  Persona p3 = new Persona("Ernesto", "Perez", "Bs As 908",
          new String[] { "2222" });

  var personas = List.of(p1, p2, p3);

  if (apellido == null || apellido.isEmpty())
   return personas;

  return personas.stream().filter((p) -> {
   return p.containsApellido(apellido);
  }).collect(Collectors.toList());
 }

 @Override
 public void crearPersona(String nombre, String apellido, String direccion,
                          String[] telefonos, String localidadId) {

  Persona p = new Persona(nombre, apellido, direccion, telefonos);
  // p.addDireccion(direccion);
  //p.addTelefonos(telefonos);

  System.out.println(p.toString());
  System.out.println(localidadId);
 }
}
