package smell;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Vector;

import org.junit.Test;

public class OrderTest {

	
		LineItem item1 = new LineItem(1, 2, 3);
		
		Order order = new Order(new Vector<LineItem>(Arrays.asList(item1)));
		
	@Test
	public void getTotalOrdertest() {
		
		item1.setUnitPrice(12);
		assertEquals(order.getTotalOrder(order.getLineItemList().iterator()), 36);
	}
	
	@Test
	public void writeOrderTest() throws FileNotFoundException {
		
		item1.setUnitPrice(12);
		StringBuffer resExp = new StringBuffer();
		               resExp.append("Begin Line Item");
		               resExp.append("Product = 1");
		               resExp.append("Image = 2");
		               resExp.append("Quantity = 3");
		               resExp.append("Total = 36");
		               resExp.append("Order total = 36"); 
		
		assertEquals(order.writeOrder(), resExp.toString());
		
	}

}
