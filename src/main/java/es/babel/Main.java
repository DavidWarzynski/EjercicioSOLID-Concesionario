package es.babel;

import es.babel.almacen.IGestorAlmacen;
import es.babel.almacen.coches.AlmacenCoches;
import es.babel.almacen.coches.GestorAlmacenCoches;
import es.babel.almacen.piezas.AlmacenPiezas;
import es.babel.almacen.piezas.GestorAlmacenPiezas;
import es.babel.cliente.Cliente;
import es.babel.concesionario.Concesionario;
import es.babel.concesionario.coche.Coche;
import es.babel.concesionario.probador.ProbadorCoche;
import es.babel.factura.Factura;
import es.babel.taller.Taller;
import es.babel.taller.piezas.Freno;
import es.babel.taller.piezas.Neumatico;
import es.babel.taller.piezas.Pieza;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final String SEPARADOR = "\n |---------------------------------------------| \n";
    private static final String SEPARADOR_TALLER = "\n |--------------------TALLER--------------------| \n";
    private static final String SEPARADOR_CONCESIONARIO = "\n |------------------CONCESIONARIO-----------------| \n";
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Focus", 1000);
        Freno freno = new Freno("Freno", 1000, "123");
        Neumatico neumatico = new Neumatico("Neumatico", 1000, "123");
        Cliente cliente = new Cliente("Juan");

        Map<Pieza, Integer> piezasCantidad = new HashMap<>();
        piezasCantidad.put(freno, 1);
        piezasCantidad.put(neumatico, 2);

        AlmacenCoches almacenCoches = new AlmacenCoches();
        IGestorAlmacen<Coche> gestorAlmacenCoches = new GestorAlmacenCoches(almacenCoches);
        gestorAlmacenCoches.agregar(coche,1);


        AlmacenPiezas almacenPiezas = new AlmacenPiezas();
        IGestorAlmacen<Pieza> gestorAlmacenPiezas = new GestorAlmacenPiezas(almacenPiezas);
        gestorAlmacenPiezas.agregar(freno,15);
        gestorAlmacenPiezas.agregar(neumatico,8);

        System.out.println(SEPARADOR_CONCESIONARIO);

        Concesionario concesionario = new Concesionario(gestorAlmacenCoches,new ProbadorCoche());
        System.out.println(concesionario.mostrarStock());
        System.out.println(SEPARADOR);
        concesionario.probarCoche(coche,cliente);
        concesionario.venderCoche(coche,cliente);
        System.out.println(SEPARADOR);
        System.out.println(concesionario.mostrarStock());

        System.out.println(SEPARADOR_TALLER);

        Taller taller = new Taller(gestorAlmacenPiezas);
        System.out.println(taller.mostrarStockPiezas());
        System.out.println(SEPARADOR);
        Factura factura = taller.repararVehiculo(coche,piezasCantidad);
        Double cantidad = factura.calcularPrecioTotalFactura();
        System.out.println(SEPARADOR);
        System.out.println(factura.mostrarFactura());
        System.out.println("Precio Total Factura: "+ cantidad);
        System.out.println(SEPARADOR);
        System.out.println(taller.mostrarStockPiezas());
        System.out.println(SEPARADOR);

    }
}
