interface PaymentMethod {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class PayPal implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to PayPal");
    }
}

class Order {
    private PaymentMethod payment;

    Order(PaymentMethod payment) {
        this.payment = payment;
    }

    void processOrder(double amount) {
        payment.pay(amount);
    }
}

public class abs2 {
    public static void main(String[] args) {
        PaymentMethod method = new PayPal();
        Order order = new Order(method);
        order.processOrder(1500);
    }
}