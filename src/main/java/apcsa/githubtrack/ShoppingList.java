package apcsa.githubtrack;

// Implement the ShoppingList class here
/* This class represents a shopping list, uses a custom implementation of ArrayList, 
and stores ShoppingList objects. */ 

public class ShoppingList implements MyList 
{
    // Create instance variables
    private int capacity; // maximum number of items the shopping list can contain
    private int size; // current number of items in the shopping list
    private ShoppingItem[] storage; // the actual list of shopping items

    // Constructor that initializes the values
    public ShoppingList()
    {
        this.capacity = 8;
        this.size = 0;
        this.storage = new ShoppingItem[8];
    }

    // Accessor methods
    public int getCapacity()
    {
        return this.capacity;
    }

    public int getSize()
    {
        return this.size;
    }

    public ShoppingItem[] getShoppingItems()
    {
        return this.storage;
    }

    // Methods
    public void addToEnd(ShoppingItem item)
    {
        /* appends the item to the end of the Shopping List
        If the list is full (at capacity), double the list's capacity using the `makeCapacity` 
        method you will implement later */
        
    }

    public void insertAt(int index, ShoppingItem item)
    {
        /* Shifts items to the right to make space, inserts item at index.
        Print "Invalid index!" if index < 0 or > size. */
        if (index < 0 || index > this.size)
        {
            System.out.println("Invalid index!");
        }
        else
        {
            ShoppingItem[] newShopList = ShoppingItem[this.size + 1]
            for (int i=0; i < this.size; i++)
            {
                if (i < index)
                {
                    newShopList[i] = this.storage[i];
                }
                else if (i = index)
                {
                    newShopList[index] = item;
                }
                else
                {
                    newShopList[i + 1] = this.storage[i]
                }
            }
            this.storage = newShopList;
        }
    }

    public void removeAt(int index)
    {
        /* Removes item at index and shifts the items to the right of it left.
        Prints the same message as insertAt under the same conditions. */
        if (index < 0 || index > this.size)
        {
            System.out.println("Invalid index!");
        }
        else
        {
            for (int i=0; i < this.size; i++)
            {
                if (i < index)
                {
                    newShopList[i] = this.storage[i];
                }
                else if (i == index)
                {
                    i++;
                }
                else
                {
                    newShopList[i-1] = this.storage[i]
                }
            }
            this.storage = newShopList;
        }
    }
        
    public ShoppingItem getAt(int index)
    {
        /* Returns item at the index
        Prints the same "Invalid index!" message if index < 0 or > size. */
        if (index < 0 || index > this.size)
        {
            System.out.println("Invalid index!");
        }
        else
        {
            return this.storage[index];
        }
    }    

    // Capacity managing methods
    public int getSize()
    {
        /* Returns number of stored items. */
        return storage.size;
    }

    public void makeCapacity(int minCapacity)
    {
        // This method doesn't do anything if minCapacity <= size or minCapacity == capacity.
        // If NOT, the capacity of the Shopping List must be changed to either 8 or minCapacity,
        // whichever is greater. 
        // Order of steps to filling out this method:
        // Create a new array, copy the elements from the old array into the new one, replace the old
        // storage with the new array 
        if (minCapacity > this.size && minCapacity != this.capacity)
        {
            if (minCapacity > 8)
            {
                // make a new shopping list of size minCapacity
                ShoppingItem[] newShopList = new ShoppingItem[minCapacity];
                // copy the elements from the old array into the new one
                for (int i=0, i < this.size; i++)
                {
                    newShopList[i] = this.storage[i];
                }
            }
            else
            {
                // if minCapacity is not greater than 8, set the new shopping list to size 8.
                ShoppingItem[] newShopList = new ShoppingItem[8];
            }
        }
    }

    public void trimExcess()
    {
        // This method will remove any excess capacity by simply calling the `makeCapacity` 
        // method with an argument value that is equal to the current size of this list.

    }

    // Shopping-Specific methods
    public void goShopping()
    {
        // loop through all items, use the buy method

    }

    public void goShopping(ShoppingList other)
    {
        // Only buys items that are common to both lists
        // Loop through all items, then use a conditional

    }

    public double totalPrice()
    {
        // Returns the sum of all the prices of the items in the list

    }

    public boolean isIdentical(ShoppingList other)
    {
        /* Returns `true` only if:
        This list is the same size as other
        This list contains the same items as other (order does NOT matter) */

    }
}