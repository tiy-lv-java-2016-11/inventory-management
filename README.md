# Manage Some Inventory

![screenshot](screenshot.jpg)

## Description

Create a program to track items in an inventory. It should let the user manipulate the current inventory and loop until the user requests to quit. 

## Requirements

* Create an inventory class which should include
	* name
	* price
	* quantity in stock
* Create a class with a `main` method.
* Create an ArrayList or Hashmap to store the inventory items.
* Print out the inventory items and then list the options.
* If the user enters `1`, let them create a new item by entering its name, price and quantity
* If the user enters `2`, let them choose how many items should be sold. Remove that amount from the inventory and check there are enough left if not throw an exception.
* If the user enters `3`, let them remove an item by its name.
* If the user enters `4`, let them pick an item and update the quantity of that item.
* If the user enters `5`, let them pick and item and update the price of the item
* If the user enters `6`, Quit the program

### Sample Output

```
1. Apples
2. Pears
3. Bananas
Options:
[1] Create a new item
[2] Remove an item
[3] Update an item's quantity
```

## Hard Mode
* Add an id field to the inventory item
* This ID should be unique for each item
* When the items list is displayed add the numbers before the names `[10] Apples`
* Change options 2, 3, 4, 5 so that the user picks by number instead of name 

## Nightmare Mode
* Create a sales option where the sale has a start and end date and a sales price then add appropriate methods to check if the item is on sale.  Also, price getter method should return the sale price if it is on sale.
* Create a login system with a few hard-coded usernames and passwords.
