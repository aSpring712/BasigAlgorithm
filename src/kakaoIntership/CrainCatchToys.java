package kakaoIntership;

//class Solution {
//	public int[] solution(int[][] board, int[] moves) {
//		int answer = 0;
//		
//		// 일단 5*5라고 했을 때 1번째 칸에서 인형 고르기
//		int[] toy = new int[moves.length]; // 배열길이 : 8 -> 최대 움직임 횟수만큼 인형을 담을 수 있음
//		
//		for(int i = 0; i < moves.length; i++) { // 가로 좌표가 1 5 3 5 1 2 1 4 일 때
//			int x = moves[i]-1; // 가로 위치
//			
//			for(int j = 0; j < board.length; j++) { // 세로 1번째 칸에서 5번째 칸까지 조사 
//				if(board[j][x-1] != 0) {
//					toy[i] = board[j][x-1]; // 가장 위에 있는 인형을 배열에 담고 더 파지 않고 빠져나옴
//					board[j][x-1] = 0; // 게임 판에서는 인형 없어짐
//					break;
//				}
//			}
//		}
//		return toy;
////		return answer;
//	}
//}

public class CrainCatchToys {
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},
						 {0,0,1,0,3},
						 {0,2,5,0,1},
						 {4,2,4,4,2},
						 {3,5,1,3,1}};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4}; // 길이가 8
		//             4  3  1  1  3  2  0  4
		
		int[] toy = new int[moves.length]; // {0, 0, 0, 0, 0, 0, 0, 0}  인형
		
		for(int i = 0; i < moves.length; i++) { // 총 8번 뽑아야 함
			int x = moves[i]-1; // x좌표값
			for(int j = 0; j < board.length; j++) { // y축 0번부터 아래로 내려가면서 인형이 있는지 검사(깊이 -> board의 길이)
				if(board[j][x] != 0) { // 인형이 있으면
					toy[i] = board[j][x]; // 가장 위에 있는 인형을 배열에 담고
					board[j][x] = 0; // 뽑았으니까 인형 없애고
					break; // 더 돌지 않고 빠져나옴
				}
			}
			System.out.print(toy[i]);
		} // 인형 다 뽑음
		
		System.out.println("\n인형뽑기 완료!");
		
		// 0없이 빈자리 채우기 ?
		
		// 인형 바구니 검사(연속된 인형 검사)
		int cntPop = 0; // 없어진 인형의 개수
		boolean flag = false; // 터진 인형 없음
		
		do {
			flag = false;
			for(int i = 0; i < toy.length-1; i++) {
				System.out.print(i + "번 인형 " + toy[i] + " ");
				for(int j = i+1; j < toy.length; j++) {
					System.out.println(j + "번 인형 " + toy[j] + " 비교 >> ");
					if (toy[i] == 0) {
						System.out.println(toy[i] + " : 아 비교할 수 없어");
						break; // i=0인 for문을 종료하고 i = 1로 넘어감
					}
						
					if (toy[j] == 0) { // toy[1]이랑 toy[2]를 비교 안하고 toy[3]으로 넘어감
						System.out.println(toy[j] + " : 봐봐 인형이 없어 다음 인형이랑 비교할게");
						continue; 
					}
					
					if (toy[i] == toy[j]) { // toy[0],이 0이 아니면서 toy[1]이랑 같으면
						cntPop += 2; // 2개 터지고
						System.out.println(toy[i] + "==" + toy[j] + " >> 2개 팡! 총 " + cntPop +"개의 인형이 터졌어");
						flag = true;
						toy[i] = 0;
						toy[j] = 0;
						break;
					} else {
						System.out.println("서로 다른 인형이야..");
						break;
					}
				}
				System.out.println(i + "번째 인형 검사 완료");
				System.out.println();
			}
			
			System.out.print("남은 인형 : ");
			for(int i : toy) {
				System.out.print(i);
			}
		} while(flag);
		System.out.println("총 터진 인형의 수 : " + cntPop);	
	}
}
