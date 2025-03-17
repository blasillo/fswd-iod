package es.jcyl.formacion.beans.ejemplo2;

import es.jcyl.formacion.beans.ejemplo2.beans.Vehiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ejemplo2Application {

    public static void main(String[] args) {

        //SpringApplication.run(Ejemplo2Application.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(Ejemplo2Application.class, args);


        Vehiculo veh = context.getBean(  Vehiculo.class);
        System.out.println("Vehiculo creado en el contexto: "  + veh.toString() );




    }

}
