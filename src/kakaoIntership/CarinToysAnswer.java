package kakaoIntership;

import java.util.Scanner;
import java.util.Stack;

public class CarinToysAnswer {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;	// 인형이 터진 개수
		Stack<Integer> stack = new Stack<Integer>();
		
		// 먼저 moves 탐색
		for(int pos : moves) { // pos-1 열에서 0부터 쭉 내려가면서 인형이 있는지 탐색
			for(int i = 0; i < board.length; i++) { // board.length 행 크기, board[0].length 열 크기
				if(board[i][pos-1] != 0) { // 인형 발견
					int tmp = board[i][pos-1]; // 인형 번호를 tmp에 저장
					board[i][pos-1] = 0; // 인형 주워올렸으므로 0으로 바꿔줌
					
					// 터트려지는지 아닌지 검사
					if(!stack.isEmpty() && tmp == stack.peek()) { // 바구니에 인형이 있으면서 같은 인형이면
						answer += 2;
						stack.pop(); // stack 상단에 있는 동일한 인형 터트림
					} else { // stack이 비어있거나, 상단에 있는 인형과 뽑은 인형이 다른 인형이면
						stack.push(tmp);
					}
					
					break; // 인형을 뽑았으므로 더이상 집어올리면 안됨
				} // 인형 발견
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		CarinToysAnswer T = new CarinToysAnswer();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();			// 격자의 크기
		int[][] board = new int[n][n];  // 2차원 배열
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();			// 움직이는 횟수
		int[] moves = new int[m];		// 움직임 위치
		for(int i = 0; i < m; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.println(T.solution(board, moves));
	}
}
