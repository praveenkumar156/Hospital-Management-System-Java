package roms;

public class Bill {
    public static void printBill(OrderItem[] orders, int count) {
        double total = 0;
        System.out.println("======= BILL =======");
        for (int i = 0; i < count; i++) {
            orders[i].displayOrderItem();
            total += orders[i].getTotalPrice();
        }
        System.out.println("Total amount: "+ total);
        System.out.println("====================");
    }
}
