package es.babel.concesionario.coche;

public class ManejadorCoche implements Conducible {
    private Coche coche;

    public ManejadorCoche(Coche coche) {
        this.coche = coche;
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }

    @Override
    public void girarDerecha() {
        System.out.println("Girando a la derecha...");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Girando a la izquierda...");
    }
}
