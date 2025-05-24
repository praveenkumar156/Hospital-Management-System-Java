package roms;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainMethodROMS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MenuItem[] menu = new MenuItem[100];  
		int menuCount = 0;

		OrderItem[] orders = new OrderItem[100];
		int orderCount = 0;

		boolean exit = false;

		while (!exit) {
		    System.out.println("==== Restaurant Order Management ====");
		    System.out.println("1. Add Item");
		    System.out.println("2. View Menu");
		    System.out.println("3. Order");
		    System.out.println("4. Bill");
		    System.out.println("5. Exit");
		    System.out.print("Enter your choice: ");

		    int choice = 0;
		    try {
		        choice = sc.nextInt();
		        sc.nextLine(); 
		    } catch (InputMismatchException e) {
		        System.out.println("Invalid input! Please enter a number.");
		        sc.nextLine(); 
		        continue;
		    }

		    switch (choice) {
		        case 1:
		            if (menuCount >= menu.length) {
		                System.out.println("Menu is full, cannot add more items.");
		                break;
		            }
		            System.out.print("Enter Item ID: ");
		            int id = sc.nextInt();
		            sc.nextLine(); 
		            System.out.print("Enter Item Name: ");
		            String name = sc.nextLine();
		            System.out.print("Enter Item Price: ");
		            double price = sc.nextDouble();
		            sc.nextLine(); 

		            menu[menuCount++] = new MenuItem(id, name, price);
		            System.out.println("Item added successfully!");
		            break;

		        case 2:
		            System.out.println("--- MENU ---");
		            for (int i = 0; i < menuCount; i++) {
		                menu[i].displayItem();
		            }
		            break;

		        case 3:
		            if (menuCount == 0) {
		                System.out.println("No items in the menu to order.");
		                break;
		            }
		            System.out.print("Enter Item ID to order: ");
		            int orderId = sc.nextInt();
		            sc.nextLine();
		            MenuItem selectedItem = null;
		            System.out.println("Order ID input: " + orderId);
		            for (int i = 0; i < menuCount; i++) {
		                System.out.println("Menu ID: " + menu[i].getId());
		                if (menu[i].getId() == orderId) {
		                    selectedItem = menu[i];
		                    break;
		                }
		            }
		            if (selectedItem == null) {
		                System.out.println("Invalid Item ID!");
		                break;
		            }
		            System.out.print("Enter Quantity: ");
		            int qty = sc.nextInt();
		            sc.nextLine();
		            if (qty <= 0) {
		                System.out.println("Quantity must be greater than zero.");
		                break;
		            }
		            orders[orderCount++] = new OrderItem(selectedItem, qty);
		            System.out.println("Added to order!");
		            break;

		        case 4:
		            if (orderCount == 0) {
		                System.out.println("No orders yet.");
		                break;
		            }
		            Bill.printBill(orders, orderCount);
		            break;

		        case 5:
		            System.out.println("Exiting... Thank you!");
		            exit = true;
		            break;

		        default:
		            System.out.println("Invalid choice! Please try again.");
		    }
		}
        int orderIndex = 0;
		Bill.printBill(orders, orderIndex);
		
	}
}
            
        

	

	


