package oops_practice.gcr_codebase.inheritance;

public class OrderManagement {

    public static void main(String[] args) {

        Order order = new Order(101, "24-06-2026");

        ShippedOrder shippedOrder = new ShippedOrder(
                102,
                "25-06-2026",
                "TRK123");

        DeliveredOrder deliveredOrder = new DeliveredOrder(
                103,
                "26-06-2026",
                "TRK456",
                "27-06-2026");

        order.displayDetails();
        System.out.println();

        shippedOrder.displayDetails();
        System.out.println();

        deliveredOrder.displayDetails();
    }
}

class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayDetails() {
        System.out.println("Order ID     : " + orderId);
        System.out.println("Order Date   : " + orderDate);
        System.out.println("Status       : " + getOrderStatus());
    }
}

class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId,
                        String orderDate,
                        String trackingNumber) {

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking No. : " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    public DeliveredOrder(int orderId,
                          String orderDate,
                          String trackingNumber,
                          String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}