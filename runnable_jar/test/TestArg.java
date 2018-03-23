package test;

public class TestArg {
	public static void main(String[] args) {
		if (args != null) {
			for (String arg : args) {
				System.out.println(arg);
			}
		}
	}
}
