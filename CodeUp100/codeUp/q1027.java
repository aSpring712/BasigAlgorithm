package codeUp;

import java.util.Scanner;

public class q1027 {
	/*
	 * 년월일(yyyy.mm.dd)을 입력받아
	 * 일월년(dd-mm-yyyy)로 출력해보자
	 * 
	 * 01.04.01
	 * 2001.4.1    -> 01-04-2001   
	 * 
	 * 한 자리 일/월은 0을 붙여서 두 자리로,
	 * 년도도 0을 붙여 네자리로 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String date = sc.next();
		String[] dateArr = date.split("\\.");
		
		int d = Integer.parseInt(dateArr[2]);
		int m = Integer.parseInt(dateArr[1]);
		int y = Integer.parseInt(dateArr[0]);
		
		System.out.printf("%02d-%02d-%04d", d, m, y);
		
	}

}
