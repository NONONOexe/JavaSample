package jp.ac.aitech.maslab.ando.javasample.designpattern.bridge;

public class BubbleSortImple extends SortImple {

	@Override
	public void sort(int[] a) {
		bubblesort(a);
	}

	private void bubblesort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; i < j; j--) {
				if (a[j] < a[j - 1]) {
					swap(a, j, j - 1);
				}
			}
		}
	}

	private void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

}
