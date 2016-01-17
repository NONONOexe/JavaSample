package jp.ac.aitech.maslab.ando.javasample.designpattern.bridge;

public class Sorter {
	private SortImple sortImple;

	public Sorter(SortImple sortImple) {
		this.sortImple = sortImple;
	}

	public void sort(int[] a) {
		sortImple.sort(a);
	}
}
