package myproject4;
import java.util.ArrayList;

public class SaladMenuIterator implements Iterator {
	
	ArrayList<MenuItem> items;
	int position = 0;
 
	public SaladMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}


}
