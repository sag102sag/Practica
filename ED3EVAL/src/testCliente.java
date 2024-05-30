import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class testCliente {

	@Test
	void test() {
		ArrayList<Product> productos = new ArrayList<>();
		Cliente cliente = new Cliente("Sergio", "Bétera", "69", 2000, productos);
		productos.add(new Product("F1", "Fuet", "Mu rico rico", 2));
		productos.add(new Product("C1", "Croquetas", "Mu ricas ricas", 3));
		productos.add(new Product("B1", "Brocoli", "Mu malo", 1));
		
		assertEquals(6, cliente.calcularPrecioTotalProductos());
		cliente.restarPrecioProductosAlSaldo();
		assertEquals(1994, cliente.saldo);
		cliente.agregarProducto(new Product("F3", "Fuet 2", "Mu rico rico rico", 2.5));
		assertEquals(4, cliente.productos.size());
	}

}
