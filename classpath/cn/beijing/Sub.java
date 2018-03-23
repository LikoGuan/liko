package cn.beijing;

import cn.shanghai.Mul;
import abc.Div;

public class Sub {
	public Integer func(Integer a, Integer b) {
		Integer c = a - b;
		System.out.println("in Sub.func " + a + " - " + b + " = " + c);
		return c;
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.getClass().getResource("a.txt"));
		System.out.println(sub.getClass().getResource("conf/b.txt"));
		System.out.println(sub.getClass().getResource("/b.txt"));
		System.out.println(sub.getClass().getResource("/net/cheng/Add.java"));
		System.out.println("----------------");
		Mul mul = new Mul();
		mul.func(1,3);
		System.out.println("----------------");
		System.out.println(sub.getClass().getResource("doc.txt"));
		System.out.println("----------------");
		Div div = new Div();
		div.func(10, 2);
		System.out.println("----------------");
		System.out.println(sub.getClass().getClassLoader().getResource("a.txt"));
		System.out.println(sub.getClass().getClassLoader().getResource("b.txt"));
	}
}
