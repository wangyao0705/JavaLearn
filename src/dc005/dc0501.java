package dc005;

/**
 * 1から100までの偶数の和を求める(for + if)。
 * @author ｗｙ
 *
 */
public class dc0501 {
	public static void main(String[] args) {
		//結果
		int sum = 0;

		//偶数の和を求める
		for (int i = 1; i <= 100; i++) {
			//偶数判断
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		//結果出力
		System.out.println(sum);
	}
}
