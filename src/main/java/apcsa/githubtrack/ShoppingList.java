package apcsa.githubtrack;

// Implement the ShoppingList class here
/* This class represents a shopping list, uses a custom implementation of ArrayList, 
and stores ShoppingList objects. */ 

public class ShoppingList implements MyList 
{
    // Create instance variables
    private int capacity;
    private int size;
    private ShoppingItem[] storage;

    // Constructor
    public ShoppingList()
    {
        this.capacity = 8;
        this.size = 0;
        this.ShoppingItem = new ShoppingItem[8];
    }
}
