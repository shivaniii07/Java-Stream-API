package realWorldExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PizzaOrder {
    String customerName;
    Double totalPrice;
    int orderNumber;

    public PizzaOrder(String customerName, Double totalPrice, int orderNumber) {
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.orderNumber = orderNumber;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    //constructor,getter,setter

    static List<PizzaOrder> pizzaOrders= Arrays.asList(
         new PizzaOrder("Rahul",370.5,5),
         new PizzaOrder("Shivani",450.4,8),
         new PizzaOrder("Pearl",750.7,10)
    );

    //given list of orders,filter the customer having order prize less than 500
    //sort the order by order number and return the names of the customer

    public static void main(String[] args) {
        List<String> customers=pizzaOrders.stream().filter(PizzaOrder->PizzaOrder.getTotalPrice()<500)
                .sorted((o1,o2) ->Integer.compare(o1.getOrderNumber(),o2.getOrderNumber()))
                .map(PizzaOrder::getCustomerName).collect(Collectors.toList());
        for(String customer:customers){
            System.out.println(customer);
        }
    }
}
