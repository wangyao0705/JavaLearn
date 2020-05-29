package dc006;

public class dc0060603 {
	/**
	 *1. メソッド名: subArray
	2. 引数１︓intの配列 array
	3. 引数２︓開始のstartIndex
	4. 引数３︓⻑さlength
	5. 戻り値︓intの配列
	6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得す
	 * @param array
	 * @param startIndex
	 * @param length
	 * @return
	 */
	public static int[] subArray(int[] array, int startIndex, int length) {
		//新た配列を定義
		int result[] = new int[length];
		//startIndexからstartIndex + lengthまでサブ配列を取得
		for (int i = startIndex; i < startIndex + length; i++) {
			//新たな配列要素
			result[i - startIndex] = array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		//代入配列
		int[] array = new int[] { 1, 2, 3, 4 };
		int length = 2;
		int startIndex = 1;
		//メソッドを呼び出す
		int[] result = subArray(array, startIndex, length);
		printArray(result);
		//		System.out.println(Arrays.toString(result));
	}

	/**
	 *
	 * @param objs
	 */
	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
