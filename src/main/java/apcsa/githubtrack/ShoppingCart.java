package apcsa.githubtrack;

// Implement your ShoppingCart class here
// The purpose of this class's objects is to represent a shopping cart in real life.  
public class ShoppingCart
{
    private ShoppingList groceriesList;
    private String customerName;
    private boolean shoppingTripDone;
    private int cartsReturned;

    // Constructors
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
        this.groceriesList = new ShoppingList(); // create an empty shopping list of capacity 8 but no items
        this.customerName = customerName;
        this.shoppingTripDone = shoppingTripDone;
        this.cartsReturned = cartsReturned;
    }

    // Accessor methods
    public ShoppingList getGroceriesList()
    {
        return this.groceriesList;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public boolean getIsDone()
    {
        return this.shoppingTripDone;
    }

    public int getCartsReturned()
    {
        return this.cartsReturned;
    }

    // Required behaviors/methods
    
}