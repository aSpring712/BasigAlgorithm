package Inflearn.Section2.Answer;
// Q5. 소수(에라스토스테네스 체)

import java.util.Scanner;

/*
 * 자연수 N이 입력되면 1부터 N까지 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * 
 * 입력 : 첫 줄에 자연수의 개수 N(2~200000)이 주어집니다.
 * 
 * ex 20    -> 8
 * 
 * n 제한이 200,000이기 때문에 에라토스테네스 체로 풀지 않으면 시간 제한에 걸림
 * -> 이중 for 돌리면 타임리밋에 걸림..
 */

public class Q5 {

	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		
		for(int i = 2; i <= n; i++) { // 0, 1은 소수의 대상 아님. 2부터 n까지 돌면서 소수 개수 출력
			if(ch[i] == 0) { // 전부 초기화되어있어서 0임. 근데 2부터 검사하니까 2는 소수 -> 1들어간 애들 제외하고 
				answer++; // 소수개수 +1
				for(int j = i; j <= n; j = j + i) ch[j] = 1; // 2의 배수에 모두 1 집어넣어버림 
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
