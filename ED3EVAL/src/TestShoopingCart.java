import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestShoopingCart {

	@Test
	void test() {
		ArrayList<Product> productos = new ArrayList<>();
		productos.add(new Product("C3","Fuet","Mu rico",2));
		productos.add(new Product("C5","Croqueta","Mu ricas",3));
		productos.add(new Product("C7","Brocoli","Mu malo",1));
		
		ShoopingCart carrito = new ShoopingCart(productos);
		
		assertEquals(3, carrito.getItemCount());
		assertEquals(6, carrito.getBalance(productos));
	}

}
