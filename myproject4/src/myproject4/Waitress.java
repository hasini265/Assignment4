package myproject4;

public class Waitress {
	
	Menu saladMenu;
	Menu appetizerMenu;
	Menu smallbitesMenu;
 
	public Waitress(Menu saladMenu, Menu appetizerMenu, Menu smallbitesMenu) {
		this.saladMenu = saladMenu;
		this.appetizerMenu = appetizerMenu;
		this.smallbitesMenu = smallbitesMenu;
	}
 
	public void printMenu() {
		Iterator saladIterator = saladMenu.createIterator();
		Iterator appetizerIterator = appetizerMenu.createIterator();
		Iterator smallbitesIterator = smallbitesMenu.createIterator();

		System.out.println("MENU\n----\nMAIN COURSE");
		printMenu(saladIterator);
		System.out.println("\nAPPETIZERS");
		printMenu(appetizerIterator);
		System.out.println("\nSMALL BITES");
		printMenu(smallbitesIterator);
		

	}
 
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
 
	public void printVegetarianMenu() {
		printVegetarianMenu(saladMenu.createIterator());
		printVegetarianMenu(appetizerMenu.createIterator());
		printVegetarianMenu(smallbitesMenu.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator maincourseIterator = saladMenu.createIterator();
		if (isVegetarian(name, maincourseIterator)) {
			return true;
		}
		Iterator appetizerIterator = appetizerMenu.createIterator();
		if (isVegetarian(name, appetizerIterator)) {
			return true;
		}
		Iterator snacksIterator = smallbitesMenu.createIterator();
		if (isVegetarian(name, snacksIterator)) {
			return true;
		}
		return false;
	}


	private void printVegetarianMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getPrice());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}

}
