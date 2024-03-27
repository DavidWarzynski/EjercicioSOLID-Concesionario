package es.babel.almacen;

public interface IGestorAlmacen <T> {
    void agregar(T elemento, int cantidad);
    void eliminar(T elemento);
    boolean verificarDisponibilidad(T elemento, int cantidad);
    int obtenerCantidad(T elemento);
    String mostrarStock();

    T obtener(int indice);
    T obtener(T elemento);

    void decrementarCantidad(T elemento,int cantidad);
}
