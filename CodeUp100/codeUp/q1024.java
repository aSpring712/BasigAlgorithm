package codeUp;

import java.util.Scanner;

public class q1024 {
	// 단어 1개 입력받아 나누어 출력하기
	// 영어 단어의 각 문자를 한줄에 한 문자씩 분리해 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next(); // 단어 하나 입력받음
		int wLength = word.getBytes().length; // 단어의 길이
//		System.out.println(wLength);
		
		char[] c = new char[20]; // 단어 길이는 20까지!
		
		for(int i = 0; i < wLength; i++) {
			c[i] = word.charAt(i);
			System.out.printf("\'%c\'\n", c[i]);
		}
	}

}
