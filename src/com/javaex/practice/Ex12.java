package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("반지름을 입력하세요: ");
			double half = sc.nextDouble();
			final double pi = 3.14;
			
			System.out.println("원의 넓이는" + half * half * pi);
			
		sc.close();
	}
	
}
