package myproject4;
import java.util.ArrayList;

public class SaladMenu implements Menu {
	
	ArrayList<MenuItem> menuItems;
	 
	public SaladMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("Caesar Salad", 
			"Crisp lettuce, toasted garlic croutons & shaved asiago cheese served with"
			 + "a classic caesar dressing", 
			true,
			2.99);
 
		addItem("Greek Salad", 
			"Finely chopped lettuce,spinach leaves,feta cheese,green peppers,olives"
			+ "grape tomatoes,served with a greek vinaigrette", 
			false,
			2.99);
 
		addItem("Harvest Salad",
			"Iceberg lettuce,spinach leaves,sliced pear,craisins,walnuts and"
			+ "bleu cheese crumbles with apple cider vinaigrette dressing",
			true,
			3.49);
 
		addItem("Side Salad",
			"Iceberg lettuce, spinach leaves,grape tomato , red onion, and shaved"
			+ "asiago cheese served with choice of dressing",
			true,
			3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new SaladMenuIterator(menuItems);
	}
  
	public String toString() {
		return "chicago Salad Menu";
	}

}
