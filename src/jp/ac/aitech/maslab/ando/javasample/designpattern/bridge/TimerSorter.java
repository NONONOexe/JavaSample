package jp.ac.aitech.maslab.ando.javasample.designpattern.bridge;

public class TimerSorter extends Sorter {

	public TimerSorter(SortImple sortImple) {
		super(sortImple);
	}

	public void timerSort(int[] a) {
		long start = System.nanoTime();
		sort(a);
		long end = System.nanoTime();
		System.out.println("time:" + (end - start));
	}

	public long nanoSortTime(int[] a) {
		long start = System.nanoTime();
		sort(a);
		long end = System.nanoTime();
		return end - start;
	}

}
