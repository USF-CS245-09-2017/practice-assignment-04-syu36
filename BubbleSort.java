/**
 *
 * Implements SortingAlgorithm interface and contains a sort method using bubble sort.
 *
 */
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}

	}

	/**
	 * Helper method that swaps the positions of two elements in the array
	 * @param a the array
	 * @param i the index of an element
	 * @param j the index of the other element
	 */
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
