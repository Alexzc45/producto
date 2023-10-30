package productos;
public class productoOfertado extends producto {
    private int diasRestantes;
    public productoOfertado(String nombre, double precio, int diasRestantes) {
        super(nombre, precio);
        this.diasRestantes = diasRestantes;
    }
    @Override
    public double obtenerPrecioPedido(int unidades) {
        if (diasRestantes == 1) {
            return super.getPrecio() * unidades * 0.8;
        } else if (diasRestantes >= 2 && diasRestantes <= 3) {
            return super.getPrecio() * unidades * 0.85;
        } else {
            return super.getPrecio() * unidades * 0.9;
        }
    }
}
