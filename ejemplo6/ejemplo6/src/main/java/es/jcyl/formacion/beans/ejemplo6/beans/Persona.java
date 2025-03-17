package es.jcyl.formacion.beans.ejemplo6.beans;

import org.springframework.stereotype.Component;

@Component
public class Persona {
    private String nombre = "Maria";

    private final Vehiculo vehiculo;


    public Persona(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

}
