import java.util.ArrayList;
import java.util.List;

public class ListToolsDemo {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(0);
		ints.add(1);
		ints.add(3);
		for(int i = 0; i < 4; i++) {
			ints.add(0);
		}
		ints.add(4);
		ints.add(5);
		ints.add(7);

		printList(ints);

		ListTools.removeAllOccurrences(ints,0);

		printList(ints);
	}

	private static void printList(List<Integer> items) {
		for(Integer item : items) {
			System.out.print(item + ",");
		}
		System.out.print("\n");
	}
}