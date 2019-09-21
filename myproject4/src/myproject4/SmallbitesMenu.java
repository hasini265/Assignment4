package myproject4;

public class SmallbitesMenu implements Menu {
	
	static final int MAX_ITEMS = 4;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	 
	public SmallbitesMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
    
		addItem("Mac'n Cheese", 
			"Mac and Cheese with toast", 
			true,
			3.49);
 
		addItem("Mason Jar Dessert", 
			"Desert in a jar filled with pecan pie and crunchy toppings", 
			false,
			2.99);
 
		addItem("Carrot cake",
			"Carrotcake layered with cream cheese",
			true,
			4.42);
 
		addItem("Sundae",
			"2 scoops of vanilla icecream, with your choice of toppings",
			true,
			5.50);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new SmallbitesMenuIterator(menuItems); 
	}
 
}
