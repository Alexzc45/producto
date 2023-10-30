package productos;
public class productoEstandar extends producto {
    private String seccion;
    public productoEstandar(String nombre, double precio, String seccion) {
        super(nombre, precio);
        this.seccion = seccion;
    }
    @Override
    public double obtenerPrecioPedido(int unidades) {  
        if (unidades >= 5) {
            return super.getPrecio() * unidades * 0.9;
        } else {
            return super.getPrecio() * unidades;
        }
    }
    public String getSeccion() {
        return seccion;
    } 
}
