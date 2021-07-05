package Inflearn.Section2.My;
// Q6. 뒤집은 소수

import java.util.Scanner;

/*
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후
 * 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요
 * 
 * ex) 32를 뒤집으면 -> 23 -> 소수 -> 23 출력
 * ex) 910을 뒤집으면 -> 019 -> 소수 -> 19 출력
 * 
 * 첫 자리부터의 연속된 0은 무시
 * 
 * 입력 : 첫 줄에 자연수의 개수 N(3~100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어짐 (각 자연수의 크기는 100,000를 넘지 않음)
 * 출력 : 첫 줄에 뒤집은 소수를 출력 (출력 순서는 입력된 순서대로)
 */

public class Q6 {
	
	public int[] solution(int N, String arr[]) {
		int[] answer = new int[N];
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			String sb = new StringBuilder(arr[i]).reverse().toString();
			answer[i] = Integer.parseInt(sb);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(answer[i] > 1) { // 2부터 비교
				
				for(int j = 2; j < answer[i]; j++) {
					if(answer[i] == j) {
						break;
					} else if(answer[i] % j == 0) {
						answer[i] = 0;
						break;
					}
				}
			} else {
				answer[i] = 0;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q6 T = new Q6();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력받을 개수
		String[] arr = new String[N]; // 동적 배열
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		for(int x : T.solution(N, arr)) {
			if(x != 0) System.out.print(x + " ");
		}
	}
}
