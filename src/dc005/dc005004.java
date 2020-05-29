package dc005;
/**
 * 質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * @author wy
 * @since 2020-05-25
 */
public class dc005004 {
	public static void main(String[] args) {

		//元配列
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 24, 10 };

		//重複要素を探す
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				//重複要素判断
				if (array[i] == array[j]) {
					//結果出力
					System.out.println(array[i]);
				}
			}
		}
	}
}
