package codeUp;

import java.util.Scanner;

public class q1032 {

	public static void main(String[] args) {
		// 10진수를 입력받아 16진수(hexadecimal)로 출력하기
		// 10진법 -> 한 자리에 10개(0~9)의 문자 사용
		// 16진법 -> 한 자리에 16개(0~9 a b c d e f)의 문자를 사용
		// 10      16
		// 10	   a
		// 11	   b
		
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		System.out.println(Integer.toHexString(d));
	}

}
