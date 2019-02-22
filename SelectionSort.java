/**
 *
 * Implements SortingAlgorithm interface and contains a sort method using selection sort.
 *
 */
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int smallest = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}

			a[i] = a[smallest];
		}
	}
}
