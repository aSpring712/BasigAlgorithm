package boj;

import java.util.Scanner;

/*
 * 45분 일찍 알람 설정하기
 * H, M
 * 
 * 불필요한 0사용하지 않음
 */
public class Q2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			m = m-45+60;
			if(h == 0) {
				h = 23;
			} else {
				h--;
			}
		} else {
			m = m - 45;
		}
		System.out.println(h + " " + m);
	}
}
