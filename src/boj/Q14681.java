package boj;

import java.util.Scanner;

/*
 * 사분면 고르기
 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램 작성
 */
public class Q14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		} else if(x > 0 && y < 0) {
			System.out.println(4);
		} else if(x < 0 && y > 0) {
			System.out.println(2);
		} else if(x < 0 && y < 0) {
			System.out.println(3);
		}
	}
}
