package roms;

public class OrderItem {
	MenuItem item;
	int quantity;
	
	public OrderItem(MenuItem item , int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	public MenuItem getItem() {
        return item;
    }
    public int getQuantity() {
        return quantity;
    }
	public double getTotalPrice() {
		return item.price * quantity;
	}
		public void displayOrderItem() {
			System.out.printf("%s x%d = $%.2f%n", item.getName(), quantity, getTotalPrice());
		}


	}


