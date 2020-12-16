package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		boolean status = true;
		String str = "keepo";
		String str1 = "peek";
		if (str.length() != str1.length()) {
			status = false;
		} else {
			char ch[] = str.toLowerCase().toCharArray();
			char ch1[] = str1.toLowerCase().toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			status = Arrays.equals(ch, ch1);
			
		}
		System.out.println(status);
	}

}
