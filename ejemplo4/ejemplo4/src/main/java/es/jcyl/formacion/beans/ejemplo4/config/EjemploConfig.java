package es.jcyl.formacion.beans.ejemplo4.config;


import es.jcyl.formacion.beans.ejemplo4.beans.Persona;
import es.jcyl.formacion.beans.ejemplo4.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EjemploConfig {

    @Bean
    public Vehiculo vehiculo () {
        var veh = new Vehiculo();
        veh.setNombre("Audi");
        return veh;
    }

    @Bean
    public Persona persona () {
        Persona pers = new Persona ();
        pers.setNombre("Lucia");
        pers.setVehiculo( vehiculo() );
        return pers;
    }

}
