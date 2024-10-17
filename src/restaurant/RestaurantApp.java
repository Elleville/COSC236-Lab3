package restaurant;
// Main class to demonstrate collaboration
public class RestaurantApp {
    public static void main(String[] args) {
        // Creating customer
        Customer customer = new Customer("Bob"); //changed customer name
        
        // Creating menu items
        MenuItem pizza = new MenuItem("Pizza", 9.99);
        MenuItem burger = new MenuItem("Burger", 6.49); //added one dollar to each item
        MenuItem soda = new MenuItem("Soda", 5.99);
        
        // Customer adds items to their order
        //changed the method call to add to order
        customer.addToOrder(pizza);  // Collaborating with MenuItem and Order
        customer.addToOrder(burger);
        customer.addToOrder(soda);
        
        // Customer places the order
        customer.placeOrder();  // Collaborating with Order to show order summary
    }
}
