package myproject4;
import java.util.Calendar;

public class AlternativeAppetizerMenuIterator implements Iterator{
	
	MenuItem[] list;
	int position;

	public AlternativeAppetizerMenuIterator(MenuItem[] list) {
		this.list = list;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternative Appetizer Menu Iterator";
	}


}
