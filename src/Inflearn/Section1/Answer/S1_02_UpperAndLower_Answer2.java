package Inflearn.Section1.Answer;

import java.util.Scanner;

// 002. 대소문자 변환
public class S1_02_UpperAndLower_Answer2 {
/*
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 
 * 대문자 -> 소문자로
 * 소문자 -> 대문자로 
 * 변환하여 출력
 * 
 * 입력 : 첫 줄에 문자열이 입력됨(길이는 100을 넘지 않음)
 * 문자열은 영어 알파벳으로만 구성
 * ex) StuDY
 * 
 * 출력 : sTUdy
 */
	public String solution(String str) {
		String answer = "";
		
		for(char c : str.toCharArray()) {
//			if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
//			else answer += Character.toLowerCase(c);
			
			/* 아스키코드 이용해서 풀기
			 * 대문자 : 65~90
			 * 소문자 : 97~122 
			 * 
			 * 대문자면 +32 해서 소문자로,
			 * 소문자면 -32 해서 대문자로 변환 가능 */
			
			if(c >= 65 && c <= 90) answer += (char)(c+32); // 대문자+32 -> 소문자
			else answer += c-32; // 소문자-32 -> 대문자
			
//			if(c >= 97 && c <= 122) 소문자인가?
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		S1_02_UpperAndLower_Answer2 T = new S1_02_UpperAndLower_Answer2();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
