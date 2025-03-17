package es.jcyl.formacion.beans.ejemplo5;

import es.jcyl.formacion.beans.ejemplo5.beans.Persona;
import es.jcyl.formacion.beans.ejemplo5.beans.Vehiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejemplo5Application {

	public static void main(String[] args) {

		var context = SpringApplication.run(Ejemplo5Application.class, args);



		Persona persona = context.getBean( Persona.class);
		Vehiculo vehiculo = context.getBean( Vehiculo.class);
		System.out.println("Persona creada en el contexto: "  + persona.getNombre());
		System.out.println("Vehiculo creado en el contexto: "  + vehiculo.getNombre());

		System.out.println("Vehiculo que pertenece a la persona: "  + persona.getVehiculo());
	}

}
