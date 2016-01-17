package jp.ac.aitech.maslab.ando.javasample.designpattern.bridge;

import java.util.Random;

public class SortTimeTest {
	public static void main(String[] args) {
		System.out.println("BubbleSort");
		measure(new TimerSorter(new BubbleSortImple()), 10);
		System.out.println();
		System.out.println("QuickSort");
		measure(new TimerSorter(new QuickSortImple()), 10);
	}

	private static void measure(TimerSorter timerSorter, int testCaseCountMax) {
		long sum = 0;
		long ave = 0;
		for (int testCaseNum = 0; testCaseNum < testCaseCountMax; testCaseNum++) {
			int[] a = new int[1000];
			for (int i = 0; i < a.length; i++) {
				a[i] = new Random().nextInt();
			}
			long time = timerSorter.nanoSortTime(a);
			sum += time;
			System.out.printf("TestCase%3d time:%8d\n", testCaseNum + 1, time);
		}
		ave = sum / testCaseCountMax;
		System.out.printf("AverageTime     :%8d\n", ave);
	}
}
