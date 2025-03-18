package es.jcyl.formacion.aop.aopdemo;


import org.springframework.stereotype.Service;

@Service
public class Servicio {

    public void hacerAlgo() {
        System.out.println("Haciendo algo...");
    }

    public void hacerOtraCosa() {
        System.out.println("Haciendo otra cosa...");
    }
}
