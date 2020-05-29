package dc005;

/**
 * 5の階乗を求める(for)
 * @author wy
 * @since 2020-05-25
 * @version 2.0
 */
public class dc00502 {
	public static void main(String[] args) {

		//結果
		int mul = 1;
		// 5の階乗
		for (int i = 5; i>=1; i--) {
			mul = mul * i;
		}
		//結果出力
		System.out.println(mul);
	}

}
