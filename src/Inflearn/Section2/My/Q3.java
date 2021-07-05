package Inflearn.Section2.My;
// Q3. 가위 바위 보

import java.util.Scanner;

/*
 * A, B 두 사람이 가위바위보
 * 총 N번 게임
 * A가 이기면 -> A 출력
 * B가 이기면 -> B 출력
 * 비기면     -> D 출력
 * 
 * 가위 : 1
 * 바위 : 2
 * 보   : 3
 * 
 * 입력 : 
 * 게임 횟수 N (1~100)
 *            바위  보  보  가위  보
 * A 낸 정보 : 2	 3	 3	 1	  3
 *            가위 가위 바위 바위 보
 * B 낸 정보 : 1	 1	 2	 2	  3
 * 
 * 출력 :      A    B   A   B    D
 * 
 *  	       [0] [1] [2] [3] [4]
 *			[0]	2	3	3	1	3
 *			[1]	1	1	2	2	3
 *
 *	   i  j     i  j
 *    [0][0]과 [1][0] 비교
 *    [0][1]과 [1][1] 비교
 *    [0][2]와 [1][2] 비교
 *    
 *    이기는 경우 -> 1 가위 냈을 때  2 바위  3 보
 *                   3 보            1 가위  2 바위
 *                  -2               1       -1
 *                  
 *    지는 경우   -> 2              -1       1
 */
public class Q3 {
	
	public String solution(int n, int[][] game) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			if(game[0][i] == game[1][i]) {
				answer += "D\n";
			} else {
				
				if(game[0][i] == 1 && game[1][i] == 3) {
					answer += "A\n";
				} else if(game[0][i] == 2 && game[1][i] == 1) {
					answer += "A\n";
				} else if(game[0][i] == 3 && game[1][i] == 2) {
					answer += "A\n";
				} else {
					answer += "B\n";
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q3 T = new Q3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 게임 횟수
		int[][] game = new int[2][n];
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < n; i++) {  
				game[j][i] = sc.nextInt(); 
			}
		}
		
		System.out.println(T.solution(n, game));
	}
}
