package proyecto.pkgfinal;

public class Producto {
    private String producto;
    private int idProducto;
    private int cantidad;

    public Producto(String producto, int idProducto, int cantidad) {
        this.producto = producto;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public Producto() {
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void mostrarProducto(){
        
    }
}
