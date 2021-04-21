package codeUp;

import java.util.Scanner;

public class q1028 {
	/*
	 * 정수 1개를 입력받아 그대로 출력하기
	 * (단, 입력되는 정수의 범위는 0 ~ 4,294,967,295)
	 * 
	 * 참고 : int형 변수 ->  -2147483648 ~ +2147483647 범위
	 * unsigned int형 -> 0 ~ 4,294,967,295 범위 가능
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextLong();
		System.out.println(i);
	}

}
