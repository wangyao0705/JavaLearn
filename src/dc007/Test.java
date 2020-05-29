package dc007;

public class Test {
	public static void main(String[]args) {
		Pet pet=new Pet("cat",2);
		System.out.println(pet.name+ ":"+pet.age);
		Pet pet1=new Pet("dog",5);
		System.out.println(pet1.name+":"+pet.age);
	}
}
