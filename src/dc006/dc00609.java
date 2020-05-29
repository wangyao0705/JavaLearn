package dc006;

import java.util.Arrays;

/**
 * 1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
 * @author user
 *
 */
public class dc00609 {
	/**
	 * 質問６-１を⽤い、２つ配列をマージします。
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[] megerArray(int[] a, int[] b) {
		//配列をマージ
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[b.length + j] = b[j];
		}
		return c;
	}

	public static void main(String[] args) {
		//代入配列
		int[] a = new int[] { 2, 4, 6, 9, 3, 6, 5 };
		int[] b = new int[] { 5, 5, 2, 7, 3, 7, 9 };
		//メソッドを呼び出す
		int[] c = megerArray(a, b);
		int[] d= bubbleSort(c);


		//新たな配列
		System.out.println(Arrays.toString(d));
	}

	/**
	 * 質問８を⽤い、ステップ１のマージした配列をソートする。
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array) {
		int a = 0;
		int[] array1 = new int[array.length];
		//位置交換
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
			//新たな配列要素
			array1[i] = array[i];
		}
		return array1;
	}
	//配列をソート

}
