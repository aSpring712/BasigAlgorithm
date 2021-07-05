package codeUp;

import java.util.Scanner;

public class q1029 {
	/*
	 * 실수 1개를 입력받아 그대로 출력
	 * (단, 입력되는 실수의 범위는 +- 1.7*10^-308 ~ +- 1.7*10^308)
	 * 
	 * 참고 : float형 변수 ->  +- 3.4*10^-38 ~ 3.4*10^38 범위
	 * double형 -> +- 1.7*10^-308 ~ +- 1.7*10^308 범위 범위 가능 -> But float보다 2배의 저장공간 필요
	 * 
	 * 입력된 실수를 소수점 이하 11자리까지 반올림하여 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double d = sc.nextDouble();
		System.out.printf("%.11f", d); // 실수형 출력 : f -> 11번째자리까지 반올림하여 출력 -> %.11f 
		
	}

}
