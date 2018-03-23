package com.guan;

import java.util.*;
import java.io.*;
import java.lang.reflect.Method;

public class Hello {
	public void show() {
		List<String> strList = new ArrayList<>();

		try {
			/*
			Class clazz = Class.forName("net.cheng.Add");
			*/
			/*
			Class clazz = this.getClass().getClassLoader().loadClass("net.cheng.Add");
			*/
			System.out.println("start create ClassLoader");
			ClassLoader customClassLoader = new ClassLoader() {
			@Override
            		public Class<?> loadClass(String name) throws ClassNotFoundException {
                		if (name == null || name.length() == 0) {
		    			System.out.println("class name is blank");
                    			return null;
                		}

                		String classPath = System.getProperty("java.class.path");
				System.out.println("java.class.path = " + classPath);
                		if (classPath == null | classPath.length() == 0) {
                    			return null;
                		}

                		String fileName = classPath + "/" + name.replace(".", "/") + ".class";
				System.out.println("fileName = " + fileName);

				Class clazz = null;
                		try {
					FileInputStream fileInputStream = new FileInputStream(fileName);
                			byte[] buffer = new byte[fileInputStream.available()];
                			fileInputStream.read(buffer);
					clazz = defineClass(name, buffer, 0, buffer.length);
                		} catch (Exception ex) {
					return super.loadClass(name);
                		}

                		return clazz;
            		}
        		};			


			Class clazz = customClassLoader.loadClass("net.cheng.Add");
			if (clazz == null) {
				System.out.println("load class fail");
				return;
			} else {
				System.out.println(clazz.getClassLoader().toString());
			}
			Object obj = clazz.newInstance();
			Class[] args = new Class[2];
			args[0] = args[1] = Integer.class;
			System.out.println("before get method");
			Method method = clazz.getMethod("func", args);
			Object[] vals = new Object[2];
			vals[0] = 1;
			vals[1] = 2;
			System.out.println("before invoke method");
			Integer result = (Integer)method.invoke(obj, vals);
			System.out.println("Hello " + result);
		} catch (Exception ex) {
			System.out.println("fuck");
			ex.printStackTrace();
		}
	}
}
