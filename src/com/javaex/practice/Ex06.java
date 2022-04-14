package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++%2;
		int m = i;
		int hh = i++%2;
		int f = i;
		int hhh = i++%2;
//		int g = i++;
//		int s = i--;
//		int a = i--;
		
		System.out.println(i);	// 10... 인 줄 알았으나 ++, --는 해당 라인 이외의 모든 부분에 적용되는 듯 함... 다른 코드를 짜면 계속 추가 제거됨
		System.out.println(n);	// 0
		System.out.println(m);
		System.out.println(hh);
		System.out.println(f);
		System.out.println(hhh);
		
	}
	
}
