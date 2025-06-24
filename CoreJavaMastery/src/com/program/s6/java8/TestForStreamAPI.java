package com.program.s6.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestForStreamAPI {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		List<Integer> result = list.stream().map(x -> x * 5).collect(Collectors.toList());

		System.out.println(result);

		list.stream().map(x -> x * 5).collect(Collectors.toList());

		// source - intermediate - intermediate - terminal

		System.out.println(list);

	}

}
