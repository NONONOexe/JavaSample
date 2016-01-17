package jp.ac.aitech.maslab.ando.javasample.algorithm;

import java.util.Random;

public class BubbleSortSample {

	public static void main(String[] args) {
		int[] a = new int[10];
		init(a);
		System.out.print(arrayToString(a));
		System.out.println("    (start)");
		bubblesort(a);
		System.out.print(arrayToString(a));
		System.out.println("    (finish)");
	}

	// 配列の要素全てを0から100までの乱数で初期化する
	private static void init(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int rand = new Random().nextInt(100);
			a[i] = rand;
		}
	}

	// 配列の中身を文字列で返す
	private static String arrayToString(int[] a) {
		String str = "";
		for (int i = 0; i < a.length; i++) {
			str += String.format("%3d", a[i]);
		}
		return str;
	}

	// 配列をバブルソートでソートする
	private static void bubblesort(int[] a) {
		// 最後の要素を除いて、すべての要素を並び替える
		for (int i = 0; i < a.length - 1; i++) {
			// 下から上に順番に比較する
			for (int j = a.length - 1; i < j; j--) {
				String msg = String.format("%3d < %3d is %s", a[j], a[j - 1], (a[j] < a[j - 1]));
				// 上の方が大きいときは互いに入れ替える
				if (a[j] < a[j - 1]) {
					msg += String.format(", swap %3d and %3d", a[j], a[j - 1]);
					swap(a, j, j - 1);
				}
				System.out.print(arrayToString(a));
				System.out.printf("    (%s)\n", msg);
			}
		}
	}

	// 要素を交換する
	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
