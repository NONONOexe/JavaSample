package jp.ac.aitech.maslab.ando.javasample.designpattern.bridge;

public class QuickSortImple extends SortImple {

	@Override
	public void sort(int[] a) {
		quicksort(a, 0, a.length - 1);
	}

	private void quicksort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		while (true) {
			while (a[pl] < x) {
				pl++;
			}
			while (x < a[pr]) {
				pr--;
			}
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
			if (pr < pl) {
				break;
			}
		}
		if (left < pr) {
			quicksort(a, left, pr);
		}
		if (pl < right) {
			quicksort(a, pl, right);
		}
	}

	private void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
