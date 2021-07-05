package Inflearn.Section2.My;
// Q4. 피보나치 수열

import java.util.Scanner;

/*
 * 앞의 2개의 수를 합해서 다음 숫자가 되는 수열
 * 입력 : 피보나치 수열의 총 항의 수가 입력됨.
 * ex) 7   -> 1 1 2 3 5 8 13
 * 
 * 첫 줄에 총 항수 N(3~45)가 입력됨
 */

public class Q4 {
	
	public int[] solution(int n) {
		int[] arr = new int[n+1];
		arr[1] = 1;
		
		for(int i = 1; i < n; i++) {
			arr[i+1] = arr[i-1] + arr[i];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Q4 T = new Q4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(T.solution(n)[i] + " ");
		}
	}
}
