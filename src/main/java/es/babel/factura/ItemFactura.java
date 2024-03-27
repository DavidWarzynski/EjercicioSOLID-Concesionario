package es.babel.factura;

public class ItemFactura {

    private String nombreArticulo;
    private double precioUnitario;
    private int cantidad;

    public ItemFactura(String nombreArticulo, double precioUnitario, int cantidad) {
        this.nombreArticulo = nombreArticulo;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getNombreArticulo() {
        return this.nombreArticulo;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double calcularPrecioTotalItem() {
        return this.cantidad * this.precioUnitario;
    }

    public String mostrarItem() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombreArticulo);
        sb.append("\t");
        sb.append(this.cantidad);
        sb.append("\t");
        sb.append(this.precioUnitario);
        sb.append("\t");
        sb.append(this.calcularPrecioTotalItem());
        sb.append("\n");
        return sb.toString();
    }

}
