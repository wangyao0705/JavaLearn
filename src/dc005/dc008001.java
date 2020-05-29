package dc005;
/**
 * LV10のパスカルの三⾓形を出⼒
 * @author user
 * @since 2020-05-25
 */
public class dc008001 {
	public static void main(String[] args) {

		//LV10の配列
		int[][] array = new int[10][10];

		//パスカルの三⾓形を出⼒，i=行、ｊ＝列
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {
				//結果＝1の判断
				if (j == 0 || j == i) {
					array[i][j] = 1;
					//１以外の値を判断
				} else {
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
				}
				//結果
				System.out.print(array[i][j]+" ");
			}
			//改行
			System.out.println();
		}
	}
}
