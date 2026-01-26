package apcsa.githubtrack;

// Implement your ShoppingCart class here
// The purpose of this class's objects is to represent a shopping cart in real life.  
public class ShoppingCart
{
    private ShoppingList groceriesList;
    private String customerName;
    private boolean shoppingTripDone;
    private int cartsReturned;

    public ShoppingCart(ShoppingList groceriesList, String customerName, boolean shoppingTripDone, int cartsReturned)
    {
        this.groceriesList = groceriesList;
        this.customerName = customerName;
        this.shoppingTripDone = shoppingTripDone;
        this.cartsReturned = cartsReturned;
    }

    public ShoppingCart()
    {
        // if no associated ShoppingList is provided, initialize it to be empty
        this.groceriesList = new ShoppingList();
        this.customerName = customerName;
        this.shoppingTripDone = shoppingTripDone;
        this.cartsReturned = cartsReturned;
    }
}