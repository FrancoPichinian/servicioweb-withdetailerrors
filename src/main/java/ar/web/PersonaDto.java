package ar.web;

public class PersonaDto {

 private String nombre;
 private String apellido;
 private String direccion;
 private String[] telefonos;
 private String localidad;

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String getApellido() {
  return apellido;
 }

 public void setApellido(String apellido) {
  this.apellido = apellido;
 }

 public String getDireccion() {
  return direccion;
 }

 public void setDireccion(String direccion) {
  this.direccion = direccion;
 }

 public String[] getTelefonos() {
  return telefonos;
 }

 public void setTelefonos(String[] telefonos) {
  this.telefonos = telefonos;
 }

 public String getLocalidad() {
  return localidad;
 }

 public void setLocalidad(String localidadId) {
  this.localidad = localidadId;
 }

}
