package kakaoIntership;

import java.util.ArrayList;
import java.util.Stack;

public class Q3 {

	public String solution(int n, int k, String[] cmd) {
		String answer = "";
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); // 원본 -> 초기 행 크기만큼 초기화
		for(int i = 0; i < n; i++) {
			arr.add(i);
		}
		
		ArrayList<Integer> clone = new ArrayList<Integer>();
		clone.addAll(arr); // 복사
		
		Stack<String> stack = new Stack<String>(); // 삭제한 행을 담기 위해
		
		for(int i = 0; i < cmd.length; i++) { // 명령 횟수만큼 실행
			String pos = "";
			
			switch (cmd[i].charAt(0)) {
			case 'U': // 현재 선택된 행에서 X칸 위에 있는 행 선택
				pos = cmd[i].substring(2);
				k = k < Integer.parseInt(pos) ? 0 : k - Integer.parseInt(pos);
				break;
			case 'D': // 현재 선택된 행에서 X칸 아래에 있는 행 선택
				pos = cmd[i].substring(2);
				k = (k + Integer.parseInt(pos)) > clone.size()-1 ? clone.size()-1 : k + Integer.parseInt(pos);
				break;
			case 'C': // 현재 선택된 행 삭제 후 바로 아래 행 선택(삭제된 행이 가장 마지막 행이면 바로 윗 행 선택)
				stack.push(k + "," + clone.get(k));
				clone.remove(k);
				if(clone.size()-1 == k) {
					k = k-1;
				}
				break;
				
			case 'Z': // 가장 최근에 삭제된 행을 원래대로 복구(선택된 행은 바뀌지 않음)
				String tmp = stack.pop(); // 가장 최근에 삭제된 행 내용
				int index = Integer.parseInt(tmp.substring(0, 1)); // 위치
				int name = Integer.parseInt(tmp.substring(2)); // 내용
				
				if(index > clone.size()-1) {
					clone.add(name);
				} else {
					clone.add(index, name);
				}
				
				if(index <= k) {
					k = k+1;
				}
				
				break;
			}
		}
		
		for(int i = 0; i < arr.size(); i++) {
			boolean b = false;
			for(int j = 0; j < clone.size(); j++) {
				if(arr.get(i) == clone.get(j)) {
					b = true;
					break;
				}
			}
			
			if(b == true) answer += "O";
			else answer += "X";
		}
		
		return answer; // 처음과 비교하여 삭제되지 않은 행은 O, 삭제된 행은 X로 표시
	}
	
	public static void main(String[] args) {
		Q3 T = new Q3();
		int n = 8; // 처음 표의 행 개수
		int k = 2; // 처음에 선택된 행의 위치를 나타내는 정수
		String[] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"}; // 수행 명령어가 담긴 문자열 배열
		System.out.println(T.solution(n, k, cmd));
	}
}
