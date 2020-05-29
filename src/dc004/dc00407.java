package dc004;

public class dc00407 {
	public static void main (String[]args) {
		int [] [] array= new int [] [] {
			{1,2,3,4},
			{21,22,23,24}
		};
		int sum = 0;
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				sum=sum+array[i][j];
			}
		}
		System.out.println(sum);
	}
}
