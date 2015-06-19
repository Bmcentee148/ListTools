import java.util.ArrayList;
import java.util.List;

public class ListToolsDemo {

	public static void main(String[] args) {
		List<String> ints = new ArrayList<String>();
		ints.add("0");
		ints.add("1");
		ints.add("3");
		for(int i = 0; i < 4; i++) {
			ints.add("0");
		}
		ints.add("4");
		ints.add("5");
		ints.add("7");

		printList(ints);

		ListTools_V2.removeAllOccurrences(ints,"0");

		printList(ints);
	}

	private static void printList(List<String> items) {
		for(String item : items) {
			System.out.print(item + ",");
		}
		System.out.print("\n");
	}
}