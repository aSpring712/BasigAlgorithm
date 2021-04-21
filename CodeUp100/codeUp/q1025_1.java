package codeUp;

import java.util.Scanner;

public class q1025_1 {
	// 정수 1개 입력받아 나누어 출력하기
	// 다섯 자리 정수 1개를 입력받아 각 자리별로 나누어 출력
	// [숫자] 이렇게 출력
	// ex) 75254
	// [70000]
	// [5000]
	// [200]
	// [50]
	// [4]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("다섯 자리의 정수 1개를 입력하세요>>");

		String num = sc.next(); // 처음부터 문자로 입력받기
		char[] str = num.toCharArray(); // char 배열로 저장
		
		for(int j = 0; j < str.length; j++) {
			System.out.print("[" + str[j]); 		// 0         1         2             3             4
			   
			for(int i = 4-j; i > 0; i--) { // 4번돌고   3번돌고    2번돌고      1번돌고        0번돌고
				System.out.print("0");
			}
			System.out.println("]");
		}
	}

}
