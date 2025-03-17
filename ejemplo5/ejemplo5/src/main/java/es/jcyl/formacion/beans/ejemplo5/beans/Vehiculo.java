package es.jcyl.formacion.beans.ejemplo5.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehiculo {

    private String nombre = "Toyota";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
