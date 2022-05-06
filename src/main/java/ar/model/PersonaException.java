package ar.model;

import java.util.Map;

public class PersonaException extends RuntimeException {

  private Map<String, String> errors;

  public PersonaException(Map<String, String> errors) {
   this.errors = errors;
  }

  public Map<String, String> toMap() {
   return Map.copyOf(errors);
  }
 }
