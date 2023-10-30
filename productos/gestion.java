package productos;
public class gestion {
    public static void main(String[] args) {
   
        productoEstandar estandar1 = new productoEstandar("ProductoEstandar1", 10.0, "SecciónA");
        productoEstandar estandar2 = new productoEstandar("ProductoEstandar2", 15.0, "SecciónB");
        productoOfertado ofertado1 = new productoOfertado("ProductoOfertado1", 20.0, 2);
        productoOfertado ofertado2 = new productoOfertado("ProductoOfertado2", 25.0, 2);
        productoOfertado ofertado3 = new productoOfertado("ProductoOfertado3", 30.0, 2);
        int unidadesCompradas = 5;
        double totalPedido = (estandar1.obtenerPrecioPedido(unidadesCompradas)
                + estandar2.obtenerPrecioPedido(unidadesCompradas)
                + ofertado1.obtenerPrecioPedido(unidadesCompradas)
                + ofertado2.obtenerPrecioPedido(unidadesCompradas)
                + ofertado3.obtenerPrecioPedido(unidadesCompradas));
        System.out.println("Total del pedido: " + totalPedido);
    }
}
