import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ShoopingCart {
private ArrayList items;

public ShoopingCart() {
	items=new ArrayList<Product>();
}

public ShoopingCart(ArrayList items) {

	this.items = items;
}

public double getBalance(ArrayList<Product> productos)
{
	double balance=0.00;
	for(int i=0; i<productos.size(); i++)
	{
		balance+=productos.get(i).getPrice();
	}
	return balance;
}

public void addItem(Product producto)
{
	items.add(producto);
}
public void removeItem(Product producto)
{
	items.remove(producto);
}
public int getItemCount()
{
	return items.size();
}
public void empty()
{
	items.clear();
}
}
