package Inflearn.Section2.Answer;
// Q4. 피보나치 수열

import java.util.Scanner;

/*
 * 앞의 2개의 수를 합해서 다음 숫자가 되는 수열
 * 입력 : 피보나치 수열의 총 항의 수가 입력됨.
 * ex) 7   -> 1 1 2 3 5 8 13
 * 
 * 첫 줄에 총 항수 N(3~45)가 입력됨
 * 
 */

public class Q4 {
	/* 배열을 쓰지 말라고 한다면 */
	public void solution(int n) {
		int a = 1, b = 1, c;
		
		System.out.print(a + " " + b + " ");
		
		for(int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		Q4 T = new Q4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		T.solution(n);
	}
}
