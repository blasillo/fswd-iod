package es.jcyl.formacion.beans.ejemplo3;

import es.jcyl.formacion.beans.ejemplo3.beans.Vehiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ejemplo3Application {

    public static void main(String[] args) {

        //SpringApplication.run(Ejemplo3Application.class, args);
        var context =  new ClassPathXmlApplicationContext("beans.xml");

        Vehiculo veh = context.getBean(Vehiculo.class);
        System.out.println("Vehiculo creado en el contexto con xml : "  + veh.getNombre());

    }

}
