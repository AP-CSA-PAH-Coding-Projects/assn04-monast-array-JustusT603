package apcsa.githubtrack;

// Implement your ShoppingItem class here
// One object of this class represents an item from a store

public class ShoppingItem implements MyList
{
    // Initialize instance variables; these are traits every object 
    private String itemName;
    private int penniesPrice; 
    private boolean sold;

    // Constructor
    public ShoppingItem(String itemName, int penniesPrice)
    {
        this.itemName = itemName;
        this.penniesPrice = penniesPrice;
        this.sold = false;
    }

    // Accessor and setter methods for instance variables
    public String getName()
    {
        return this.itemName;
    }

    public double getPrice()
    {=
        // This method has to return the price in dollars when it is accessed outside the class.
        // The amount in dollars is equivalent to the number of pennies divided by 100.
        double dollarsPrice = this.penniesPrice / 100.0;
        return dollarsPrice;
    }

    public boolean getSold()
    {
        return this.sold;
    }

    public void setName(String name)
    {
        this.itemName = name;
    }

    public void setPrice(int price)
    {
        this.penniesPrice = price;
    }

    // Methods for the required behaviors of instances of this class
    public void buy()
    {
        // Sets sold to true, meaning that the item has now been sold and can no longer be bought. 
        // There should be no other code that can change this.sold to false. 
        this.sold = true; 
    }

    public boolean equals(ShoppingItem other)
    {
        // This conditional tests if the item in question has the same name and price as the original one
        if (this.getName().equals(other.getName()) && this.getPrice() == other.getPrice())
        {
            return true;
        }
        return false;
    }

    public int compareTo(ShoppingItem other)
    {
        /* Return a **positive difference** (magnitude equal to the price difference) if this item is more expensive 
        * Return a **negative difference** (magnitude equal to the price difference) if this item is cheaper */
        int difference = 0;
        if (this.getName.equals(other.getName()))
        {
            if (this.getPrice() == other.getPrice())
            {
                return difference; // If names and prices are the same, immediately return 0.
            }
            else if (this.getPrice() > other.getPrice())
            {
                // Sets difference to be a positive value of the difference between the two prices.
                difference = this.getPrice() - other.getPrice();
            }
            else if (this.getPrice() < other.getPrice())
            {
                // Sets difference to be a negative value of the difference between the two prices. 
                difference =  this.getPrice() - other.getPrice();
            }
        }
        else // If the two names are not equal, print this message.
        {
            System.out.println("Error: Different items!");  
        }
        return difference; 
    }
}