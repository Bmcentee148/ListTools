import java.util.List;

/** General utility class for performing frequently needed operations
	on any class implementing the List interface **/ 
public class ListTools {

	public static void removeAllOccurrences(List items, Object o) {
		while(items.contains(o)) {
			items.remove(o);
		}
	}

	public static int getFrequencyOf(List items, Object o) {
		int frequency = 0;
		for(Object item : items) {
			if(item.equals(o)) {
				frequency++;
			}
		}
		return frequency;
	}

}