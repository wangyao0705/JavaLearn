package dc006;

import java.util.Arrays;

/**
 * バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
 * @author user
 *
 */
public class dc00608 {
	/**
	 * bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソート
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

	public static void main(String[] args) {
		//代入配列
		int[] a = new int[] { 2, 6, 4, 3, 4, 7, 8 };
		//メソッドを呼び出す
		int[] array1 = bubbleSort(a);
		System.out.println(Arrays.toString(array1));
	}

}
