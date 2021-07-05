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
 * StringBuilder reverse 사용
 * equalIgnoreCase
 */
public class S1_07_Palindrome_A2 {
	public String solution(String str) {
		String answer = "NO"; // 기본값
		
		String tmp = new StringBuilder(str).reverse().toString(); // String형 str을 StringBuilder형으로 변환 -> 역순으로 변환해 tmp에 담음
		
		if(str.equalsIgnoreCase(tmp)) { // 같지 않으면
			answer = "YES";
		}
	
		return answer;
	}

	
	public static void main(String[] args) {
		S1_07_Palindrome_A2 T = new S1_07_Palindrome_A2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
