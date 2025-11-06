package ejercicio1;

public class DescuentoFijo extends Descuentos{
    private double montoFijo;
    DescuentoFijo(double montoFijo){
        super(0);
        if (montoFijo < 0) {
            throw new IllegalArgumentException("El monto fijo no puede ser negativo.");
        }
        this.montoFijo = montoFijo;
    }
    public double getMontoFijo() {
        return montoFijo;
    }
    public void setMontoFijo(double montoFijo) {
        if (montoFijo < 0) {
            throw new IllegalArgumentException("El monto fijo no puede ser negativo.");
        }
        this.montoFijo = montoFijo;
    }
    @Override
    public double aplicarDescuento(double precioOriginal) {
        double nuevoPrecio = precioOriginal - montoFijo;
        if (nuevoPrecio < 0){
            throw new RuntimeException("No se pueden tener precios negativos, revise el monto fijo seleccionado.");
        }
        return nuevoPrecio;
    }
}