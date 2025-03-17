package es.jcyl.formacion.beans.ejemplo1.config;

import es.jcyl.formacion.beans.ejemplo1.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EjemploConfig {


    @Bean
    Vehiculo vehiculo () {
        var veh = new Vehiculo();
        veh.setNombre("Mercedes");

        return veh;
    }

    @Bean(name = "VolksVeh" )
    @Primary
    Vehiculo vehiculo2 () {
        var veh = new Vehiculo();
        veh.setNombre("Volkswagen");

        return veh;
    }
}
