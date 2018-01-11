package io.java8.lambdabasics;

import java.util.ArrayList;
import java.util.List;

public class C_ShortCuts {

	public static void main(String[] args) {
		List<String> l;
		l = new ArrayList<>();
		l.add("Lakshmi");
		l.add("Aruna");
		l.add("Cheeni");
		l.add("Chethana");
		for (String s : l) {
			System.out.println(s);
		}
	}

}
