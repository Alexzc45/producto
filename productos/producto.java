package productos;
public abstract class producto {
    private String nombre;
    private double precio;
    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }   
    public abstract double obtenerPrecioPedido(int unidades);
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }     
}
