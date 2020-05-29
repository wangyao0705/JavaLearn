package dc006;

public class dc0060601 {
	public static void printArray(Object[]objs) {
		if(objs==null) {
			System.out.println("null");
			return;
		}
		String prefix="";
		StringBuilder sb =new StringBuilder();
		sb.append("[");
		for(Object obj:objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix=", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
