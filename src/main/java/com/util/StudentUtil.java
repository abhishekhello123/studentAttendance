package com.util;

import java.util.Arrays;
import java.util.List;

public class StudentUtil {

	public static void main(String[] args) {
		
		System.out.println("Student util project");
		List<String> numberList = Arrays.asList("1","2");
		
		for(int i=0;i<numberList.size();i++) {
			System.out.println(numberList.get(i));
		}
	}

}
