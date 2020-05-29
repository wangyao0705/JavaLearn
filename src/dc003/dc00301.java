package dc003;

public class dc00301 {

	public static void main(String[] args) {
		int k=56;
		if ( k>=90) {
			System.out.println("A");
		} else if (k>=80&&k<90) {
			System.out.println("B");
		} else if (k>=70&&k<80) {
			System.out.println("C");
		} else if (k>=60&&k<70) {
			System.out.println("D");
		}else {System.out.println("E");
		}


		int array [] = new int [] { 5, 6, 7, 8, };
		for (int x :array) {
			System.out.println(x);
		}


		for (int i=0; i<array.length; i++) {
			int x = array [i];
			System.out.println(x);
		}

		int array1 []= new int [] {1,2,3,0};
		System.out.println(array1.length);
		System.out.println(array1[0]);


		for (int s =0; s<array1.length; s++) {
			System.out.println(array1 [s]);
		}


		int [] [] array2d = new int [] [] {
			{1,2,3,4},
			{21,22,23,24}
		};
		System.out.println(array2d.length);
		System.out.println(array2d[0][2]);

		int [] [] array3 = new int [][] {
			{4,5,6,7,8},
			{8,9,0,7,6}
		};
		for (int[] o:array3) {
			for(int p:o) {
			System.out.println(p);
			}
		}

		System.out.println();




	}

}
