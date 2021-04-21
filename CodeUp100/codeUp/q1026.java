package codeUp;

import java.util.Scanner;

public class q1026 {
	/*
	 * 입력되는 시:분:초에서 분만 출력해보자.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		String[] splitTime = time.split(":");
		
		System.out.println(Integer.parseInt(splitTime[1]));
	}

}
