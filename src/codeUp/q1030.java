package codeUp;

import java.util.Scanner;

public class q1030 {
	/*
	 * 정수 1개를 입력받아 그대로 출력하기 3
	 * (단, 입력되는 정수의 범위는 -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807)
	 * 
	 * 참고 : int형 변수 ->  -2147483648 ~ +2147483647 범위
	 * long 형 -> -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long l = sc.nextLong();
		System.out.println(l); 
		
	}

}
