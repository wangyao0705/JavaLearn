package dc005;
/**
 * 質問３の配列に値「７」のインデックスを求む。
 * @author wy
 * @since 2020-05-25
 *
 */
public class dc00505 {
	public static void main(String[] args) {

		//元配列
		int[] array = new int[] { 1, 2, 6, 7, 8, 6, 2, 1 };
		//値「７」のインデックスを求む。
		for (int i = 0; i < array.length; i++) {
			//値「７」のインデックスを判断
			if (array[i] == 7) {
				//結果出力
				System.out.println(i);
			}
		}
	}
}
