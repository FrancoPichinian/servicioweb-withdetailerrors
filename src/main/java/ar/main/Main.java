package ar.main;

import ar.web.WebAPI;
import ar.jdbc.JdbcLocalidades;
import ar.jdbc.JdbcPersonas;
import ar.jdbc.JdbcCursos;
import ar.jdbc.JdbcEstudiantes;

public class Main {

 public static void main(String[] args) {
  WebAPI servicio = new WebAPI(new JdbcLocalidades(), new JdbcPersonas(), new JdbcCursos()
          , new JdbcEstudiantes(), 1234);
  servicio.start();
 }
}
