package Inflearn.Section1.Answer;

import java.util.Scanner;

// S1_07_Palindrome
/*
 * 회문 문자열 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 YES, 아니면 NO를 출력
 * 
 * 입력 : 첫 줄 길이 100을 넘지 않는 공백이 없는 문자열          ex) gooG
 * 출력 : 첫 번째 줄에 회문 문자열인지 결과를 YES 또는 NO로 출력 ex) YES
 * 
 */
public class S1_07_Palindrome_A {
	public String solution(String str) {
		String answer = "YES"; // 기본값
		// 모두 대문자로 바꿈
		// 문자열의 길의 / 2 만큼만 돌면 됨
		// ex) gooG -> 길이 4 -> 2번만 돌면 됨
		// ex) abcBa -> 길이 5 -> 어차피 중간은 대칭시켜서 검사할 게 없으니까 길이 5/2 -> 2번만 검사하면 됨 -> 0,`1
		
		int len = str.length();
		str = str.toUpperCase(); // 전부 대문자로 바꿔서 양단이 같은지 검사
		
		for(int i = 0; i < len/2; i++) { // 0번과 맨 마지막 비교, 1번과 맨 마지막에서 앞에 것 비교
			if(str.charAt(i) != str.charAt(len-i-1)) {
//				answer = "NO";
//				break; 또는
				return "NO"; // 회문이 아니니까 바로 NO를 return 하고 종료
			}
		}
		return answer;
	}

	
	public static void main(String[] args) {
		S1_07_Palindrome_A T = new S1_07_Palindrome_A();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
