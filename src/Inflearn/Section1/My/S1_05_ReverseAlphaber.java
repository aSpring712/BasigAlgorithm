package Inflearn.Section1.My;

import java.util.Scanner;

// S1_05_ReverseAlphaber 특정 문자 뒤집기

/*
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면
 * 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력
 * 
 * 입력 : 첫 줄에 길이가 100을 넘지 않는 문자열이 주어짐
 * 출력 : 첫 줄에 알파벳만 뒤집힌 문자열 출력
 */

public class S1_05_ReverseAlphaber {
	
	public String Solution(String str) { // 문자열을 입력받고
		String answer = "";
		
		char[] c = str.toCharArray(); // 문자 배열로 만들기 -> 수정 가능
		int lt = 0, rt = str.length()-1;
		
		while(lt < rt) { 
			if(c[lt] >= 'a' && c[lt] <= 'z' || c[lt] >= 'A' && c[lt] <= 'Z') { // lt가 알파벳인가?? O
				if(c[rt] >= 'a' && c[rt] <= 'z' || c[rt] >= 'A' && c[rt] <= 'Z') { // rt도 알파벳인가? -> 그럼 바꾸고
					char tmp = c[lt];
					c[lt] = c[rt];
					c[rt] = tmp;
					lt++;
					rt--;
				} else { // 아니면
					rt--;
				}					
			} else { // lt가 알파벳이 아닌가?
				lt++;
			}
		}
		String tmp = String.valueOf(c).toString();
		
		return answer = tmp;
	}
	
	public static void main(String[] args) {
		S1_05_ReverseAlphaber T = new S1_05_ReverseAlphaber();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.Solution(str));
	}
}
