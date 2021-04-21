package codeUp;

import java.util.Scanner;

public class q1031 {
	/*
	 * 10진수를 입력받아 8진수(ocatl)로 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
//		System.out.println(Integer.toOctalString(i)); 
		System.out.printf("%o", i);
	}

}
