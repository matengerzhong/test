package com.bin;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.experimental.max.MaxCore;

public class MyJava {

	public static void main(String[] args) {

		// System.out.println(getStr());

		List<Integer> lists = new ArrayList<Integer>() {

			{
				add(-1);
				add(3);
				add(2);
			}
		};
		lists = new ArrayList<>();
		System.out.println(min(lists));
		

	}

	public static <T extends Comparable> T max(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}

		T max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		return max;
	}

	public static <T extends Comparable> T min(List<T> t) {
		
		if (t == null || t.size() == 0) {
			return "a";
		}
		T m = t.get(0);
		for (int i = 0; i < t.size(); i++) {
			if ((m.compareTo(t.get(i))) > 0) {
				m = t.get(i);
			}
		}
		return m;
	}

}
