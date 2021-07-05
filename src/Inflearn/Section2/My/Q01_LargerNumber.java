package Inflearn.Section2.My;

import java.util.Scanner;

// 1. 큰 수 출력하기

/* N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성
 * (첫 번째 수는 무조건 출력)
 * 
 * 입력 : 첫 줄에 자연수 N(1 <= N <= 100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 * 6
 * 7 3 9 5 6 12
 * 
 * 출력 : 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 * 7 9 6 12
 */


public class Q01_LargerNumber {
	
	public String solution(int n, int[] nArray) {
		String answer = String.valueOf(nArray[0]);
		
		for(int i = 1; i < nArray.length; i++) {
			if(nArray[i] > nArray[i-1]) {
				answer += " " + nArray[i];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q01_LargerNumber T = new Q01_LargerNumber();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nArray = new int[n];
		for(int i = 0; i < n; i++) {
			nArray[i] = sc.nextInt();
		}
		 
		System.out.println(T.solution(n, nArray));
	}
}
