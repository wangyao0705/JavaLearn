package dc006;

public class dc00604 {
	private static void fillArray(String[] array) {
		array[0] = "value2";
	}
	public static void main(String[] args) {
		String[] array = new String[] { "value1" };
		fillArray(array);
		System.out.println(array[0]);
	}
}
