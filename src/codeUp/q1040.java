package codeUp;

import java.util.Scanner;

// 1040 정수 1개 입력받아 부호 바꿔 출력하기
/*
 * 입력된 정수의 부호를 바꿔 출력해보자
 */
public class q1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = -1 * n;
		System.out.println(n);
	}
}
