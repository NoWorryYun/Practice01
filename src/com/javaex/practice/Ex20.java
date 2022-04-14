package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("500원 개수: ");
			int five_h = sc.nextInt();
			
			System.out.println("100원 개수: ");
			int one_h = sc.nextInt();

			
			System.out.println("50원 개수: ");
			int fifty = sc.nextInt();			
			
			System.out.println("10원 개수: ");
			int ten = sc.nextInt();			
		
			long sum = (five_h * 500L) + (one_h * 100L) + (fifty * 50L) + (ten * 10L);
			
			System.out.println("동전의 총합은" + sum + "원 입니다.");
		
		
		
		
		
		
		
		sc.close();
		
		
		
	}
	
}
