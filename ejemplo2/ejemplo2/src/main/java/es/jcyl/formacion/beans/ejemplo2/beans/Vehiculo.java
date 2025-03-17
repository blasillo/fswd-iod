package es.jcyl.formacion.beans.ejemplo2.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehiculo {

    private String nombre;

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


    @PostConstruct
    public void inicializa () {
        System.out.println("Inicializando bean de vehiculo");
        this.nombre = "Audi";
    }


    @PreDestroy
    public void destruye() {
        System.out.println("Destruyendo bean de vehiculo");
    }
}

