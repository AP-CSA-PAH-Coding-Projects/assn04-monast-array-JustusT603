package apcsa.githubtrack;

// Implement your Main class (with the main method) here
public static void main (String[] args)
{
    // Build shopping lists
    // Breakfast essentials, which includes
    // eggs: $3.50
    // zucchini: $2.75
    // frozen berries: $5.15
    // smoked salmon: $9.99
    ShoppingItem eggs = new ShoppingItem("eggs", 350);
    ShoppingItem zucchini = new ShoppingItem("zucchini", 265);
    ShoppingItem frozenBerries = new ShoppingItem("frozen berries", 515);
    ShoppingItem smokedSalmon = new ShoppingItem("smoked salmon", 999);
    ShoppingItem tissues = new ShoppingItem("tissues", 100);
    
    ShoppingList breakfastEssentials = new ShoppingList();
    // add the items to the list
    breakfastEssentials.addToEnd(eggs);
    breakfastEssentials.addToEnd(zucchini);
    breakfastEssentials.addToEnd(frozenBerries);
    breakfastEssentials.addToEnd(smokedSalmon);

    ShoppingList dormRun = new ShoppingList();
    // add items to the list
    dormRun.addToEnd(eggs);
    dormRun.addToEnd(zucchini);
    dormRun.addToEnd(frozenBerries);
    dormRun.addToEnd(smokedSalmon);
    dormRun.addToEnd(tissues);

    if (dormRun.isIdentical(breakfastEssentials))
    {
        System.out.println("The two lists are identical!");
    }
    else
    {
        System.out.println("The two lists are not idnetical!");
    }

    // initialize new shopping carts for the trip
    ShoppingCart dormShopTrip = new ShoppingCart(dormRun, "Justus", false, 0);
    ShoppingCart breakfastRun = new ShoppingCart(breakfastEssentials, "Justus", false, 0);
    // removing tissues and smoked salmon from dormRun
    dormRun.removeAt(4);
    dormRun.removeAt(3);
    // buy eggs and smoked salmon
    eggs.buy();
    smokedSalmon.buy();

    if (dormShopTrip.isCompleted())
    {
        System.out.println("Dorm shopping run successfully completed!");
        dormShopTrip.returnCart();
    }
    else
    {
        System.out.println("Dorm shopping run incopmlete!");
    }

    // buy all items for breakfastEssentials!
    breakfastEssentials.goShopping();
    // print the number of carts returned
    System.out.println("The number of carts returned was: "+ dormShopTrip.getCartsReturned() 
    + breakfastEssentials.getCartsReturned());
    
    dormRun.returnCart();
    breakfastRun.returnCart();

    // print out again the number of carts returned
    System.out.println("The number of carts returned was: "+ dormShopTrip.getCartsReturned() 
    + breakfastEssentials.getCartsReturned());

    // compareTo demo
    System.out.println(breakfastEssentials[0].compareTo(dormRun[2]));

    // Print summary
    System.out.println("The DormRun shopping cart contained eggs, zucchini, and frozen berries.
    the total cost was " + dormRun.totalPrice() + ". It was completed! ");
}