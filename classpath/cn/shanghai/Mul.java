package cn.shanghai;

public class Mul {
	public Integer func(Integer a, Integer b) {
		System.out.println(Mul.class.getResource("m.txt"));
		Integer c = a * b;
		System.out.println("in Mul.func " + a + " * " + b + " = " + c);
		return c;
	}
}
