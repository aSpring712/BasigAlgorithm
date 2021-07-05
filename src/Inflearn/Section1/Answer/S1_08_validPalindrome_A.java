package Inflearn.Section1.Answer;

import java.util.Scanner;
// S1_08_validPalindrome
// 유효한 팰린드롬

/*
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 "NO"를 출력하는 프로그램 작성
 * 단, 회문을 검사할 때 알파벳만 가지고 회문을 검사 -> 대소문자 구분X
 * 알파벳 이외의 문자는 무시
 * 
 * 입력 : 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어짐
 *  ex) found7, time: study; Yduts; emit, 7Dnuof
 *
 * 출력 : 첫 줄에 팰린드롬인지 결과를 YES 또는 NO로 출력
 *  ex) YES
 */
public class S1_08_validPalindrome_A {

	public String solution(String str) {
		String answer = "";
		// 대소문자를 구분하지 않음 -> 모두 대문자로 변경 또는 equalsIgnoreCase
		str = str.toUpperCase(); // 대문자로 변경
		
		char[] c = str.toCharArray(); // char형 배열로 쪼개서 검사하기! -> isAlphabet 사용할거라서
		String tmp = ""; // 알파벳을 제외한 문자 저장
		
		for(char x : c) {
			if(Character.isAlphabetic(x)) { // 얘가 문자이면
				tmp += x; // 알파벳만 걸러져 나옴
			}
		}
		
		// 검사할 문자 위치
		int lt = 0; // 첫 번째 문자
		int rt = tmp.length()-1; // 마지막 문자
		answer = "YES";
		
		while(lt < rt) {
			if(tmp.charAt(lt) != tmp.charAt(rt)) {
				answer = "NO";
			}
			lt++;
			rt--;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_08_validPalindrome_A T = new S1_08_validPalindrome_A();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 공백을 포함한 여러 개의 단어가 들어오니까 Enter로 구문하는 nextLine으로 받음
		System.out.println(T.solution(str));
	}
}
