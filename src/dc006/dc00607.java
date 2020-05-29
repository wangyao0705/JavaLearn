package dc006;

import java.util.Arrays;

/**
 * 質問７︓以下静的なメソッドを定義してください。
1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
 * @author user
 */
public class dc00607 {
	/**
	 * 引数１のcharの配列先頭と末尾の空⽩⽂字列を削除
	 * @param input
	 * @param startIndex
	 * @param length
	 * @return
	 */
	public static char[] trim(char[] input, int startIndex, int length) {
		//新たな配列を定義
		char[] output = new char[length - startIndex];
		//先頭と末尾の空⽩⽂字列を削除
		for (int i = startIndex; i < length; i++) {
			output[i - startIndex] = input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		//代入配列
		char[] input = new char[] { ' ', ' ', 'A', 'z', 'z', 'z', 'z', 'z', 'e', ' ', ' ', ' ', ' ', ' ', 'g', ' ', ' ',' ' };
		int startIndex = 0;
		int length = 0;
		for (int j = 0; j < input.length; j++) {
			if (' ' != input[j]) {
				startIndex = j;
				break;
			}

		}
		for (int i = input.length - 1; i < input.length; i--) {
			if (' ' != input[i]) {
				length = i + 1;
				System.out.println(length);
				break;
			}

		}
		char[] output = trim(input, startIndex, length);
		System.out.println(Arrays.toString(output));

	}
}
