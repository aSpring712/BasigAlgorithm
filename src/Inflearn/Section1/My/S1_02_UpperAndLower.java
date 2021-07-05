package Inflearn.Section1.My;

import java.util.Scanner;

// 002. 대소문자 변환
public class S1_02_UpperAndLower {
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
			
			if(c >= 'a' & c <= 'z') {
				answer += Character.toUpperCase(c);
			}
			if(c >= 'A' & c <= 'Z') {
				answer += Character.toLowerCase(c);
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_02_UpperAndLower T = new S1_02_UpperAndLower();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
