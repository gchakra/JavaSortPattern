import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

class SortClass {

	public void mysortList(List<Integer> lis) {
		System.out.println("The original list is: ");

		for (int num : lis) {
			System.out.print(num + " ");
		}

		Comparator c = Collections.reverseOrder();
		Collections.sort(lis, c);
		// Collections.sort(lis, null);

		System.out.println("\nThe reverse order sorted list is: ");
		for (int num : lis) {
			System.out.print(num + " ");

		}

	}

	public void mysortArr(Integer[] arr) {
		System.out.println("\nThe original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");

		}
	}

	
}