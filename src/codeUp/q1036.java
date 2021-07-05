package codeUp;

import java.util.Scanner;

public class q1036 {
	// 알파벳 입력받고 유니코드로 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		int i = (int) c;
		System.out.println(i);
	}
}
