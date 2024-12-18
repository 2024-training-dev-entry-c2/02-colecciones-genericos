package data;

public class Producto<T extends Postre> {
    private T producto;
    private Float precio;
    private Integer cantidad;

    public Producto(T producto, Float precio, Integer cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public T obtenerProducto() {
        return this.producto;
    }

    public void mostrarDetalles() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Mostrando detalles de la compra");
        System.out.println("El cliente ha pedido: " + cantidad + " unidades de " + producto.devolverTipo() );
        System.out.println("El valor a pagar es de: " +calcularPrecioTotal(precio, cantidad));
    }

    public Float calcularPrecioTotal(Float precio, Integer cantidad) {
        Float x = precio * (float)cantidad;
        return x;
    }

    public T getProducto() {
        return this.producto;
    }

    public void setProducto(T producto) {
        this.producto = producto;
    }

    public Float getPrecio() {
        return this.precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
