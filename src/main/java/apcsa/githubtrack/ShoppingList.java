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

    public void setCapacity(int newCapacity)
    {
        this.capacity = newCapacity;
    }

    // Methods
    public void addToEnd(ShoppingItem item)
    {
        /* appends the item to the end of the Shopping List
        If the list is full (at capacity), double the list's capacity using the `makeCapacity` 
        method you will implement later */
        if (this.size == this.capacity)
        {
            ShoppingList.makeCapacity(this.capacity * 2)
        }
        else
        {
            storage[storage.size() - 1] = item;
        }
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
            // make a new ShoppingItem array of size one bigger than this.size
            ShoppingItem[] newShopList = ShoppingItem[this.size + 1];
            // loop through the current shopping list and access each item
            for (int i=0; i < this.size; i++)
            {
                // before the index I want to insert a new value into, copy the items into the new array
                if (i < index)
                {
                    newShopList[i] = this.storage[i];
                }
                // at the given index, insert the new item into the new array.
                else if (i = index)
                {
                    newShopList[index] = item;
                }
                // after the given index, copy the remaining items from the original array into the new one. 
                else
                {
                    newShopList[i + 1] = this.storage[i];
                }
            }
            // Update this storage array to have the values of the new one
            this.storage = newShopList;
        }
    }

    public void removeAt(int index)
    {
        // make a new ShoppingItem array of size one smaller than this.size
        ShoppingItem[] newShopList = ShoppingItem[this.size - 1];
        /* Removes item at index and shifts the items to the right of it left.
        Prints the same message as insertAt under the same conditions. */
        if (index < 0 || index > this.size)
        {
            System.out.println("Invalid index!");
        }
        else
        {
            // Loop through the original storage array
            for (int i=0; i < this.size; i++)
            {
                // For each index i before the given index, copy each item into the new array.
                if (i < index)
                {
                    newShopList[i] = this.storage[i];
                }
                // When i reaches the given index, move on to the next item in the original array.
                else if (i == index)
                {
                    i++;
                }
                // For each index i after the given index, copy each item into the new array. 
                else
                {
                    newShopList[i-1] = this.storage[i];
                }
            }
            // Update this storage array to have the values of the newShopList. 
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
            // Return the shopping list item at index.
            return this.storage[index];
        }
    }    

    // Capacity managing methods
    public int getSize()
    {
        // Returns number of stored items.
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
                // if minCapacity is greater than 8, then change this.capacity to minCapacity.
                storage.setCapacity(minCapacity);
            }
            else
            {
                // if minCapacity is not greater than 8, set this.capacity to size 8.
                storage.setCapacity(8);
            }
        }
        // make a new temporary shopping list of size capacity (updated from the previous conditional)
        ShoppingItem[] newShopList = new ShoppingItem[this.capacity];
        // copy the elements from the old array into the new one
        for (int i=0, i < this.size; i++)
        {
            newShopList[i] = this.storage[i];
        }
        // update storage to get the values of the temporary list
        this.storage = newShopList;
    }

    public void trimExcess()
    {
        // This method will remove any excess capacity by simply calling the `makeCapacity` 
        // method with an argument value that is equal to the current size of this list.
        ShoppingList.makeCapacity(this.size);
    }

    // Shopping-Specific methods
    public void goShopping()
    {
        // loop through all items, use the buy method to mark all the items in the list as bought.
        for (ShoppingItem item: this.storage)
        {
            item.buy();
        }
    }

    public void goShopping(ShoppingList other)
    {
        // Only buys items that are common to both lists
        // Loop through all items of both lists, then use a conditional.
        for (int i=0; i<this.storage.size(); i++)
        {
            for(int j=i; j<other.size(); j++)
            {
                if (this.storage[i] == other[j])
                {
                    this.storage[i].buy();
                    other[j].buy();
                }
            }
        }
    }

    public double totalPrice()
    {
        // Returns the sum of all the prices of the items in the list
        double sum = 0.0;
        // Loop through storage and add every item's price to the sum.
        for (double item: this.storage)
        {
            sum += item.getPrice();
        }
        return sum;
    }

    public boolean isIdentical(ShoppingList other)
    {
        /* Returns `true` only if:
        This list is the same size as other
        This list contains the same items as other (order does NOT matter) */
        if (this.size == other.getSize() && 
        for (int i=0; i<this.storage.size(); i++) // for every item in storage
        {
            for(int j=i; j<other.size(); j++) // compare it to the items in other
            {
                // as soon as you encounter two items that are not the same, return false.
                if (this.storage[i] != other[j]) 
                {
                    return false;
                }
                return true;
            }
        }
        )
        {
            return true;
        }
        return false;
    }
}