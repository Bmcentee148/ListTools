import java.util.List;

/** General utility class for performing frequently needed operations
	on any class implementing the List interface. This implementation
	uses generics to maximize reusability. **/ 
public class ListTools_V2 {

	public static <E> void removeAllOccurrences(List<E> items, E o) {
		while(items.contains(o)) {
			items.remove(o);
		}
	}

	public static <E> int getFrequencyOf(List<E> items,E o) {
		int frequency = 0;
		for(E item : items) {
			if(item.equals(o)) {
				frequency++;
			}
		}
		return frequency;
	}

}