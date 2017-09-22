package kenming.casestudy.turtlestore.model;

import java.util.List;

public class Shopper {
 
    private List<烏龜商品> shoppingList;
    private int totalPrice;			// 總價
 
    public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<烏龜商品> getShoppingList() {
        return shoppingList;
    }
 
    public void setShoppingList(List<烏龜商品> shoppingList) {
        this.shoppingList = shoppingList;
    }
}
