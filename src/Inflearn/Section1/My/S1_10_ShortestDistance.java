package Inflearn.Section1.My;
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

	public String solution(String str, char target) {
		String answer = "";
		int[] iArr = new int[str.length()]; // str의 길이만큼 int형 배열 만듦
		char[] cArr = str.toCharArray(); // 문자를 쪼개서 배열에 담음
		// cArr 0 1 2 3 4 5 6 7 8 9 10
		//      t e a c h e r m o d e
		
		int sub = 1000;
		
		for(int i = 0; i < str.length(); i++) {
			if(cArr[i] == target) { // cArr에 들어있는 문자가 target문자 e와 같은가?
				sub = 0; // 자기 자신이므로 거리는 0으로 초기화하고
			} else { // 다르면 sub +1 시켜서
				sub++;
			}
			iArr[i] = sub; // 거리를 담을 배열에 0을 집어넣음
		}
		
		sub = 1000;
		for(int i = str.length()-1; i >= 0; i--) {
			if(cArr[i] == target) {
				sub = 0;
			} else {
				sub++;
			}
			iArr[i] = (iArr[i] >= sub) ? sub : iArr[i];
		}
		
		for(int i : iArr) {
			answer += i + " ";
		}
		
		return answer.trim();
	}
	
	public static void main(String[] args) {
		S1_10_ShortestDistance T = new S1_10_ShortestDistance();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char t = sc.next().charAt(0);
		System.out.println(T.solution(str, t));
	}
}
