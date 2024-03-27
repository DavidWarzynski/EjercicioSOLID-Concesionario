package es.babel.concesionario.probador;

import es.babel.concesionario.coche.Coche;
import es.babel.concesionario.coche.ManejadorCoche;

public class ProbadorCoche implements IProbadorCoche{
    @Override
    public void probarCoche(Coche coche) {
        System.out.println("Probando coche:");
        ManejadorCoche manejador = new ManejadorCoche(coche);
        manejador.acelerar();
        manejador.frenar();
        manejador.girarDerecha();
        manejador.girarIzquierda();
        System.out.println("Prueba finalizada.");
    }
}
