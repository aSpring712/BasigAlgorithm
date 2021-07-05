package Inflearn.Section1.Answer;
// 10. 가장 짧은 문자거리

import java.util.Scanner;

/*
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소 거리를 출력하는 프로그램을 작성하세요.
 * 
 * 입력 : 첫 번째 줄에 문자열 s와 문자열 t가 주어진다. 문자열과 문자는 소문자로만 주어진다 ex) teachermode e 
 * (문자열 길이는 100을 넘지 않는다)
 * 출력 : 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.    -> 1 0 1 2 1 0 1 2 2 1 0
 */

public class S1_10_ShortestDistance {

	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()]; // 동적인 int 배열
		int p = 1000;
		
		for(int i = 0; i < s.length(); i++) { // 왼쪽에 있는 t와의 거리
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == t) { p = 0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
		
	
	public static void main(String[] args) {
		S1_10_ShortestDistance T = new S1_10_ShortestDistance();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 공백 전까지 문자열 읽고
		char c = sc.next().charAt(0); // 문자 한개 읽음
		for(int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}
	}

}
