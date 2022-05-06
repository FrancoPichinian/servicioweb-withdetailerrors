package ar.servicios;

import java.util.List;

import ar.model.Persona;

public interface Personas {

 List<Persona> personas(String apellido);
  
 void crearPersona(String nombre, String apellido, String direccion, String[] telefonos, String localidadId);

}
