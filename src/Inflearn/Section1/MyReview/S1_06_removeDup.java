package Inflearn.Section1.MyReview;

import java.util.Scanner;

//S1_06_removeDup
/*
 * 소문자로 된 한개의 문자열 입력 -> 중복된 문자를 제거하고 출력하기
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서 유지
 * 
 * 입력
 * 첫 줄에 문자열 입력(길이는 100을 넘지 않음)
 * 
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열 출력
 * 
 * ex) ksekkset
 * -> kset
 */

public class S1_06_removeDup {

	public String solution(String str) { // str은 소문자로만 이루어진 단어
		String answer = "";
		
		for(int i =0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " : " + i + "번째 문자 중복된 문자의 위치 : " + str.indexOf(str.charAt(i)));
			if(i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_06_removeDup T = new S1_06_removeDup();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
