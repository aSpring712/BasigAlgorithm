package Inflearn.Section1.My;

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
public class S1_07_Palindrome {
	public String solution(String str) {
		String answer = "";
		
		char[] c = str.toUpperCase().toCharArray(); // 전부 대문자로 바꿔서 양단이 같은지 검사
		
		int lt = 0;
		int rt = str.length()-1;
		answer = "YES";
		
		while(lt < rt) {
			if(c[lt] != c[rt]) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		S1_07_Palindrome T = new S1_07_Palindrome();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
