package dc006;

public class dc00601 {
	public static void main(String[] args) {
		float t = 0.0f;
		float y = gAcceleration(t);
		System.out.println(y);
	}

	public static float gAcceleration(float t) {
		float y = 9.8F * t * t / 2;
		return y;
	}
}
