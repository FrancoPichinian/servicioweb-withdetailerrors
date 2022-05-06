package ar.model;

import java.util.HashMap;
import java.util.Map;

public class NotNullNotEmpty {

 private static final String MSG = "Envíe un valor distinto de nulo o vacío";
 private Map<String, String> errors = new HashMap<>();

 private boolean nullOrEmpty(String value) {
  return value == null || value.isEmpty() || value.isBlank();
 }

 public NotNullNotEmpty(String k1, String v1) {
  if (nullOrEmpty(v1)) {
   this.errors.put(k1, MSG);
  }
 }

 public NotNullNotEmpty(String k1, String v1, String k2,
                        String v2, String k3, String[] v3) {
  if (nullOrEmpty(v1)) {
   this.errors.put(k1, MSG);
  }

  if (nullOrEmpty(v2)) {
   this.errors.put(k2, MSG);
  }

  if (nullOrEmpty(v3)) {
   this.errors.put(k3, MSG);
  }
 }

 public NotNullNotEmpty(String k1, String v1, String k2,
                        String v2, String k3, String v3, String k4,
                        String[] v4) {
  if (nullOrEmpty(v1)) {
   this.errors.put(k1, MSG);
  }

  if (nullOrEmpty(v2)) {
   this.errors.put(k2, MSG);
  }

  if (nullOrEmpty(v3)) {
   this.errors.put(k3, MSG);
  }

  if (nullOrEmpty(v4)) {
   this.errors.put(k4, MSG);
  }
 }

 public void throwOnError() {
  if (this.hasErrors()) {
   throw new PersonaException(this.toMap());
  }
 }

 private boolean nullOrEmpty(String[] numeros) {
  return numeros == null || numeros.length == 0 || numeros[0] == null
          || numeros[0].isBlank() || numeros[0].isEmpty();
 }

 private boolean hasErrors() {
  return !this.errors.isEmpty();
 }

 private Map<String, String> toMap() {
  return Map.copyOf(this.errors);
 }
}