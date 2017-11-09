package smell;

class LineItem {
    
	private int _productId;
    private int _imageID;
    private int _qty;
    private int _unitprice;
 
    public LineItem(int prodID, int ImageID, int inQty) {
        _productId = prodID;
        _imageID = ImageID;
        _qty = inQty;
    }
 
    int getProductID() {
        return _productId;
    }
 
    int getImageID() {
        return _imageID;
    }
 
    int getQuantity() {
        return _qty;
    }
 
    int getUnitPrice() {
        return _unitprice;
    }
 
    public void setProductID(int id) {
        _productId = id;
    }
 
    public void setImageID(int ID) {
        _imageID = ID;
    }
 
    public void setQty(int qty) {
        _qty = qty;
    }
 
    public void setUnitPrice(int i) {
        _unitprice = i;
    }
    
    public int getLineItemTotal(){
    	
    	return _unitprice*_qty;
    }
}
