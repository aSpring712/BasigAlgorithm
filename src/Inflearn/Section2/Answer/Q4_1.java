package Inflearn.Section2.Answer;
// Q4. 피보나치 수열

import java.util.Scanner;

/*
 * 앞의 2개의 수를 합해서 다음 숫자가 되는 수열
 * 입력 : 피보나치 수열의 총 항의 수가 입력됨.
 * ex) 7   -> 1 1 2 3 5 8 13
 * 
 * 첫 줄에 총 항수 N(3~45)가 입력됨
 * -> 1 1 2는 고정!!
 */

public class Q4_1 {
	
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < n; i++) { // 0 1 2 3 4 5 6 7 
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q4_1 T = new Q4_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x : T.solution(n)) System.out.print(x + " ");
	}
}
