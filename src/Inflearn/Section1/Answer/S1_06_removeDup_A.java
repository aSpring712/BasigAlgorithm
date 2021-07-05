package Inflearn.Section1.Answer;
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

/*
 * ksekkset
	k 0 0
	s 1 1
	e 2 2
	k 3 0    -> 중복
	k 4 0    -> 중복
	s 5 1    -> 중복
	e 6 2    -> 중복
	t 7 7
	
	자기 index 번호와 최초로 등장하는 index 번호가 일치하지 않으면 answer에 누적시키지 않으면 됨!
 */

import java.util.Scanner;

public class S1_06_removeDup_A {

	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {  
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_06_removeDup_A T = new S1_06_removeDup_A();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 한 줄 입력
		System.out.println(T.solution(str));
				

	}

}
