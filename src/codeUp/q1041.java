package codeUp;

import java.util.Scanner;

// 1041 문자 1개 입력받아 다음 문자 출력하기
/*
 * 입력된 정수의 부호를 바꿔 출력해보자
 */
public class q1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		c = (char)(c+1);
		System.out.println(c);
	}
}
