package Inflearn.Section2.My;

import java.util.Scanner;

// Q7 점수계산
/*
 * OX 문제 -> 맞거나 / 틀리거나
 * 연속적으로 답을 맞추면 +1점씩 추가되면서 점수 올라가고 틀리면 다시 0에서부터 시작함
 */
public class Q7 {
	
	public int solution(int n, int[] arr) {
		int answer = 0, score = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				score++;
				answer += score;
			} else {
				score = 0;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q7 T = new Q7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, arr));
	}

}
