package oops_practice.gcr_codebase.inheritance;

public class OrderManagement {

    public static void main(String[] args) {

        Order order =
                new Order(101, "24-06-2026");

        ShippedOrder shippedOrder =
                new ShippedOrder(
                        102,
                        "25-06-2026",
                        "TRK123");

        DeliveredOrder deliveredOrder =
                new DeliveredOrder(
                        103,
                        "26-06-2026",
                        "TRK456",
                        "27-06-2026");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
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
}