package com.bin;

import java.lang.reflect.Method;

public class DemoAnnotation {

	@ShopDi(value="sssss",abc="sss")
	public void aaaa() {
	}
	public static void main(String[] args) {

		Method[] ms = DemoAnnotation.class.getDeclaredMethods();
		for (Method m : ms) {
			String mn = m.getName();
			System.out.println(mn + "ssssssss----" + m.isAnnotationPresent(ShopDi.class));

			if (m.isAnnotationPresent(ShopDi.class)) {
				System.out.println(mn + "------shop di ");
			}
		}

	}

}
