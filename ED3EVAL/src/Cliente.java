import java.util.ArrayList;
public class Cliente {
 private String nombre;
 private String direccion;
 private String telefono;
 private double saldo;
 private ArrayList<Product> productos;
 public Cliente(String nombre, String direccion, String telefono, double saldo) {
 this.nombre = nombre;
 this.direccion = direccion;
 this.telefono = telefono;
 this.saldo = saldo;
 this.productos = new ArrayList<>();
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
 public void aplicarDescuento() {
	 double precioTotalProductos;
	  if (productos.size() > 4) {
	 precioTotalProductos= calcularPrecioTotalProductos();
	  double descuento = precioTotalProductos * 0.05;
	  saldo -= descuento;
	  }
	  }
}
