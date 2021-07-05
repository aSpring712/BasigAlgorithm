package Inflearn.Section2.My;
// Q5. 소수(에라스토스테네스 체)

import java.util.Scanner;

/*
 * 자연수 N이 입력되면 1부터 N까지 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * 
 * 입력 : 첫 줄에 자연수의 개수 N(2~200000)이 주어집니다.
 * 
 * ex 20    -> 8
 */

public class Q5 {

	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1]; // 0 1 2 3 4 5 6 7
								  // 0 0 0 0 0 0 0 0 초기화 된 상태
		for(int i = 2; i <= n; i++) { // 1은 어차피 제외하고 2부터 7까지 비교
			if(arr[i] == 0) { 
				answer++;
				for(int j = i; j <= n; j = j + i) {
					arr[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q5 T = new Q5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}

}
