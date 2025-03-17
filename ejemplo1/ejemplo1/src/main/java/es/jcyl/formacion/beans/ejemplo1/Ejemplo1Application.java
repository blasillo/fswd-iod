package es.jcyl.formacion.beans.ejemplo1;

import es.jcyl.formacion.beans.ejemplo1.beans.Vehiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ejemplo1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Ejemplo1Application.class, args);

        Vehiculo veh1 = new Vehiculo();
        veh1.setNombre("Toyota");
        System.out.println("Vehiculo creado fuera del contexto: " + veh1.getNombre());


        Vehiculo veh2 = context.getBean( "vehiculo", Vehiculo.class);
        System.out.println("Vehiculo creado en el contexto: "  + veh2.getNombre());

        Vehiculo veh3 = context.getBean( Vehiculo.class);
        System.out.println("Vehiculo creado en el contexto: "  + veh3.getNombre());

    }

}
