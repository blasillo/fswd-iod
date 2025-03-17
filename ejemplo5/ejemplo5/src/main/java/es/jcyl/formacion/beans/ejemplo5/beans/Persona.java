package es.jcyl.formacion.beans.ejemplo5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persona {
    private String nombre = "Antonio";
    //@Autowired
    private Vehiculo vehiculo;

    //@Autowired
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

    //@Autowired
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


}
