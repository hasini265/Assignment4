package myproject4;

import java.util.*;

public class MenuTestDrive {
	
	public static void main(String args[]) {
        SaladMenu saladMenu = new SaladMenu();
        AppetizersMenu appetizerMenu = new AppetizersMenu();
        SmallbitesMenu smallbitesMenu = new SmallbitesMenu();
 
		Waitress waitress = new Waitress(saladMenu, appetizerMenu, smallbitesMenu);
		waitress.printMenu();
		
	}
	
	public static void printMenu() {
		SaladMenu saladMenu = new SaladMenu();
		AppetizersMenu appetizerMenu = new AppetizersMenu();
		SmallbitesMenu smallbitesMenu = new SmallbitesMenu();

		ArrayList<MenuItem> maincourseItems = saladMenu.getMenuItems();
		MenuItem[] appetizerItems = appetizerMenu.getMenuItems();
		MenuItem[] snacksItems = smallbitesMenu.getMenuItems();
		
		System.out.println("USING FOR EACH");
		for (MenuItem menuItem : maincourseItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		for (MenuItem menuItem : appetizerItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		for (MenuItem menuItem : snacksItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
 
		System.out.println("USING FOR LOOPS");
		for (int i = 0; i < maincourseItems.size(); i++) {
			MenuItem menuItem = (MenuItem)maincourseItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		for (int i = 0; i < appetizerItems.length; i++) {
			MenuItem menuItem = appetizerItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		
		for (int i = 0; i < snacksItems.length; i++) {
			MenuItem menuItem = snacksItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}

}
