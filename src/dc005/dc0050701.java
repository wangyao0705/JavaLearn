package dc005;

import java.util.Arrays;
/**
 * 配列を昇順でソートする
 * @author wy
 * @since 2020-05-25
 */
public class dc0050701 {
	public static void main(String[] args) {

		//元配列
		int[] array = new int[] { 2, 5, 4, 76, 8, 8, 0, 4, 1 };
		//中間値
		int num = 0;
		//配列を昇順で
		for (int i = 0; i <= array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				//最小値を探す
				if (array[i] < array[j]) {
					//array[i]とarray[j]の位置交換
					num = array[i];
					array[i] = array[j];
					array[j] = num;
				}
			}
		}
		//結果出力
		System.out.println(Arrays.toString(array));
	}
}
