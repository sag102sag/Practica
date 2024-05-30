import java.util.ArrayList;
public class Cliente {
 private String nombre;
 private String direccion;
 private String telefono;
 double saldo;
 ArrayList<Product> productos;
 public Cliente(String nombre, String direccion, String telefono, double saldo, ArrayList<Product> productos) {
 this.nombre = nombre;
 this.direccion = direccion;
 this.telefono = telefono;
 this.saldo = saldo;
 this.productos = productos;
}
 public void agregarProducto(Product producto) {
 productos.add(producto);
 }
 public double calcularPrecioTotalProductos() {
 double precioTotal = 0;
 for (Product producto : productos) {
 precioTotal += producto.getPrice();
 }
 return precioTotal;
 }
 public void restarPrecioProductosAlSaldo() {
 double precioTotalProductos = calcularPrecioTotalProductos();
 saldo -= precioTotalProductos;
 }
}
