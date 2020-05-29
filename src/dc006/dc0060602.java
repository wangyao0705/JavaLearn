package dc006;

import java.util.Arrays;

/**
 * 1. メソッド名: megerArray
2. 引数１︓intの配列 left
3. 引数２︓intの配列 right
4. 戻り値︓intの配列
5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
 * @author user
 *
 */
public class dc0060602 {
	/**
	 * 引数left と 引数right をマージして、新しい配列を作成して返却する
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] megerArray(int[] left, int[] right) {
		//新たな配列
		int[] result = new int[left.length + right.length];
		//引数left と 引数right をマージして、新しい配列を作成
		for (int i = 0; i < left.length; i++) {
			result[i] = left[i];
		}
		for (int j = 0; j < right.length; j++) {
			result[j + left.length] = right[j];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		//メソッドを呼び出す
		int[] result = megerArray(left, right);
		System.out.println(Arrays.toString(result));
	}

}
