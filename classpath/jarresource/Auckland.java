package jarresource;

public class Auckland {
	public static void main(String[] args) {
		//System.out.println(Auckland.class.getClassLoader().getResource("").toString());
		System.out.println(System.getProperty("java.class.path"));
		System.out.println("---------------------------------");
		System.out.println(Auckland.class.getResource("a.txt"));
		System.out.println(Auckland.class.getClassLoader().getResource("a.txt"));
	}
}
