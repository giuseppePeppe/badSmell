package smell;

import java.util.Iterator;
import java.util.Vector;
 
public class Order {
 

	private  Vector<LineItem>  _lineItemList;
 
    public Order(Vector<LineItem> lis) {
        _lineItemList = lis;
    }
    
    public Vector<LineItem> getLineItemList() {
		return _lineItemList;
	}
    
    public void setLineItems(Vector<LineItem> lineItems) {
    	_lineItemList = lineItems;
    }
     
    public String writeOrder() {
    	
    	StringBuffer sf = new StringBuffer();
        for (LineItem lineItem : _lineItemList) {
			
        	sf.append("Begin Line Item");
        	sf.append("Product = " + lineItem.getProductID());
        	sf.append("Image = " + lineItem.getImageID());
        	sf.append("Quantity = " + lineItem.getQuantity());
        	sf.append("Total = " + lineItem.getLineItemTotal());
        	
		}
        
        sf.append("Order total = " + getTotalOrder(_lineItemList.iterator()));
        
        return sf.toString();
             
    }
 

	public int getTotalOrder(Iterator iter) {
		
		int totale = 0;
		while (iter.hasNext()) {
			LineItem item = (LineItem) iter.next();
			totale += item.getLineItemTotal();
		}

		return totale;
		
        
    }
	
}
