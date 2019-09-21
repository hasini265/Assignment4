package myproject4;

public class AppetizersMenu implements Menu {
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public AppetizersMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Mozzarella Sticks",
			"Mozzarella cheese sticks coated with egg & bread crumbs", true, 2.99);
		addItem("Breaded Mushrooms",
			"Breaded mushrooms served with ranch", false, 2.99);
		addItem("Bruschetta",
			"Grilled bread topped with tomatoes,olive oil & salt", false, 3.29);
		addItem("Jalapeno Poppers",
			"Filled with cheddar cheese and served with a side of ranch",
			false, 3.05);
		addItem("Fried Pickles",
			"Fried pickles served with a side of ranch", true, 3.99);
		addItem("Toasted Ravioli",
			"Served with Marinara Sauce, and sprinkle with parmesan cheese",
			true, 3.89);
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
		return new AppetizersMenuIterator(menuItems); 
	}

}
