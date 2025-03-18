package es.jcyl.formacion.aop.aopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopDemoApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(AopDemoApplication.class, args);

        // Obtener el servicio del contexto y ejecutarlo
        Servicio servicio = context.getBean(Servicio.class);
        servicio.hacerAlgo(); // Esto disparará el aspecto
        servicio.hacerOtraCosa(); // Esto también
    }

}
