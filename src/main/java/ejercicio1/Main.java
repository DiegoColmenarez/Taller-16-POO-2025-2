package ejercicio1;

public class Main {
    public static void main(String[] args) {
        double precio = 1000;
        var descuento1 = new Descuentos(12.2);
        var descuentofijo = new DescuentoFijo(200);

        System.out.printf("""
                Descuento de: %.2f%%
                Total: %.2f
                """, descuento1.getPorcentaje(), descuento1.aplicarDescuento(precio));
        System.out.printf("""
                Descuento Fijo: %.2f$
                Total: %.2f
                """, descuentofijo.getMontoFijo(), descuentofijo.aplicarDescuento(precio));
    }
}
