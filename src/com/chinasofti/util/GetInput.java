package com.chinasofti.util;

import java.util.Scanner;

public class GetInput {

	public String getString(String s) {
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		try {
			return sc.next();
		} catch (Exception e) {
			System.out.println("输入有误  此次输入无效");
			getString(s);
			return null;
		}
	}
	
	public int getInt(String s) {
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		try {
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println("输入有误  此次输入无效");
			getInt(s);
			return 0;
		}
	}
	
	public double getDouble(String s) {
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		try {
			return sc.nextDouble();
		} catch (Exception e) {
			System.out.println("输入有误  此次输入无效");
			getDouble(s);
			return 0;
		}
	}
	
}
