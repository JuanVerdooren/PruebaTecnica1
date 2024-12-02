package com.ejemplo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public ResponseEntity<Object> obtenerCliente(@RequestParam String tipoDocumento, @RequestParam String numeroDocumento) {

        // Validar tipo de documento
        if (!tipoDocumento.equals("C") && !tipoDocumento.equals("P")) {
            return new ResponseEntity<>("Tipo de documento inválido. Solo 'C' para cédula de ciudadanía o 'P' para pasaporte.", HttpStatus.BAD_REQUEST);
        }

        // Validar que el número de documento no esté vacío
        if (numeroDocumento == null || numeroDocumento.isEmpty()) {
            return new ResponseEntity<>("El número de documento es obligatorio.", HttpStatus.BAD_REQUEST);
        }

        // Simulación de cliente basado en los parámetros
        if (numeroDocumento.equals("123456789") && tipoDocumento.equals("C")) {
            // Datos del cliente para cédula
            return new ResponseEntity<>(new Cliente("Juan", "Carlos", "Pérez", "Rodríguez", "3001234567", "Calle 123, Apto 101", "Bogotá"), HttpStatus.OK);
        } else if (numeroDocumento.equals("987654321") && tipoDocumento.equals("P")) {
            // Datos del cliente para pasaporte
            return new ResponseEntity<>(new Cliente("Ana", "Maria", "Gomez", "Lopez", "3012345678", "Carrera 45, Casa 25", "Medellín"), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cliente no encontrado.", HttpStatus.NOT_FOUND);
        }
    }

    // Clase interna que representa los datos de un cliente
    static class Cliente {
        private String primerNombre;
        private String segundoNombre;
        private String primerApellido;
        private String segundoApellido;
        private String telefono;
        private String direccion;
        private String ciudadResidencia;

        public Cliente(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion, String ciudadResidencia) {
            this.primerNombre = primerNombre;
            this.segundoNombre = segundoNombre;
            this.primerApellido = primerApellido;
            this.segundoApellido = segundoApellido;
            this.telefono = telefono;
            this.direccion = direccion;
            this.ciudadResidencia = ciudadResidencia;
        }

        // Getters y setters
        public String getPrimerNombre() {
            return primerNombre;
        }

        public void setPrimerNombre(String primerNombre) {
            this.primerNombre = primerNombre;
        }

        public String getSegundoNombre() {
            return segundoNombre;
        }

        public void setSegundoNombre(String segundoNombre) {
            this.segundoNombre = segundoNombre;
        }

        public String getPrimerApellido() {
            return primerApellido;
        }

        public void setPrimerApellido(String primerApellido) {
            this.primerApellido = primerApellido;
        }

        public String getSegundoApellido() {
            return segundoApellido;
        }

        public void setSegundoApellido(String segundoApellido) {
            this.segundoApellido = segundoApellido;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getCiudadResidencia() {
            return ciudadResidencia;
        }

        public void setCiudadResidencia(String ciudadResidencia) {
            this.ciudadResidencia = ciudadResidencia;
        }
    }
}
