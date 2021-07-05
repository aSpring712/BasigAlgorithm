package codeUp;

import java.util.Scanner;

// p.1037 [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
public class q1037 {

	public static void main(String[] args) {
		// 10진 정수 1개를 입력받아 아스키 문자로 출력(정수 범위 0~255)
		Scanner sc = new Scanner(System.in);
//		char c = (char) sc.nextInt();		
//		System.out.println(c);
		System.out.println((char)sc.nextInt());
	}
}
