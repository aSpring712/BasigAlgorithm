package Inflearn.Section2.Answer;
// Q6. 뒤집은 소수

import java.util.ArrayList;
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
	public boolean isPrime(int num) { // 소수인지 확인하는 함수 -> 참 / 거짓 return 
		if(num == 1) return false; // 1은 소수가 아님
		for(int i = 2; i < num; i++) {
			if(num % i == 0) { // 1부터 자기자신 전까지 돌아가면서 나눠봤을 때 나누어떨어져서 나머지가 0이면 i는 num의 약수 -> 소수가 아님
				return false;
			}
		}
		return true; // 약수 발견안되고 끝났다 -> 소수다 -> true 반환
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) { // 소수면 ArrayList에 넣어서 return
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		// 일단 숫자 뒤집기
		for(int i = 0; i < n; i++) {
			int tmp = arr[i]; // 일단 원래 숫자를 임시 tmp에 담고
			int res = 0;
			while(tmp > 0) { // 뒤집기
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if(isPrime(res)) answer.add(res); // 참이면 소수 -> answer에 추가
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q6 T = new Q6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력받을 개수
		int[] arr = new int[n]; // 동적 배열
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
		
	}
}
