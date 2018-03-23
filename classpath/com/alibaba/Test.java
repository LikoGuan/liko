package com.alibaba;

//import net.cheng.Add;
import com.guan.Hello;
import cn.beijing.Sub;

public class Test {

	private Integer id;

	private String code;

	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "id:" + id + ", code:" + code;
	}

	public String getClassPath() {
		Class clazz = this.getClass();
		ClassLoader classLoader = clazz.getClassLoader();
		if (classLoader != null) {
			return classLoader.getResource("").toString();
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println("what " + System.getProperty("java.class.path"));

		if (args != null) {
			for (String arg : args) {
				System.out.println(arg);
			}
		}

		Sub sub = new Sub();
		Integer result = sub.func(10, 2);
		System.out.println("sub 10, 2 = " + result);

		Test test = new Test();
		System.out.println(test.getClassPath());
		
		/*
		Add addObj = new Add();
		Integer op1 = 1;
		Integer op2 = 2;
		Integer result = addObj.func(op1, op2);
		System.out.println(op1 + " + " + op2 + " = " + result);
		*/
		Hello hello = new Hello();
		hello.show();
	}
}
