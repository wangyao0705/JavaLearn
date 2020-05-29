package dc005;
/**
 *任意⾏列（２次元配列）の積を求める。
 * @author wy
 * @since 2020-05-25
 */
public class dc00506 {
	public static void main(String[] args) {

		//元配列
		int[][] array = new int[][] {
				{ 2, 4, 5, 6, 7, 8 },
				{ 8, 7, 60, 5, 4, 3 }
		};

		//結果
		long acc = 1;
		//２次元配列の要素を出力
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				//２次元配列の積を求める
				acc = acc * array[i][j];
			}
		}
		//結果出力
		System.out.println(acc);
	}
}
