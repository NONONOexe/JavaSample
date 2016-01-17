package jp.ac.aitech.maslab.ando.javasample.algorithm;

import java.util.Random;

public class QuickSortSample {

	public static void main(String[] args) {
		int[] a = new int[10];
		init(a);
		System.out.print(arrayToString(a));
		System.out.println("    (start)");
		quicksort(a, 0, a.length - 1);
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

	// 配列をクイックソートでソートする
	private static void quicksort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		while (true) {
			// 中央値よりa[pl]が小さければplを右に進める
			while (a[pl] < x) {
				pl++;
			}
			// 中央値よりa[pr]が大きければprを左に進める
			while (x < a[pr]) {
				pr--;
			}
			String msg = String.format("pl=%d, pr=%d, x=%3d", pl, pr, x);
			// このとき、a[pl]はa[pr]以上になっている
			// plがprに対して同じ位置または左であれば、小さい値が右に来るようにa[pl]とa[pr]を交換
			if (pl <= pr) {
				msg += String.format(", swap %3d and %3d", a[pl], a[pr]);
				swap(a, pl++, pr--);
			}
			System.out.print(arrayToString(a));
			System.out.printf("    (%s)\n", msg);
			// 左右から来たポインタが交わったところでソート終了
			if (pr < pl) {
				break;
			}
		}
		// a[left]からa[pr]までに対してquicksortを行う
		if (left < pr) {
			quicksort(a, left, pr);
		}
		// a[pr]からa[right]までに対してquicksortを行う
		if (pl < right) {
			quicksort(a, pl, right);
		}
	}

	// 要素を交換する
	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
