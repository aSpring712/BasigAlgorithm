package Inflearn.Section1.Answer;

import java.util.Scanner;

public class S1_05_ReverseAlphaber_A {

	public String solution(String str) {
		String answer = "";
		
		// lt가 특수문자이냐? Y -> lt++
		// 그럼 rt가 특수문자냐? Y -> rt--
		// 다 아니다 -> 둘 다 알파벳이다 -> 둘이 교환
		// 반복
		
		char[] s = str.toCharArray(); // 문자배열 생성
		int lt = 0;
		int rt = str.length()-1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) { // s[lt]가 알파벳이 아닌가? == 특수문자인가?
				lt++;
			} else if(!Character.isAlphabetic(s[rt])) { // s[rt]가 알파벳이 아닌가? == 특수문자인가?
				rt--;
			} else { // 둘 다 아닌가? == 둘 다 알파벳인가?
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
	
		answer = String.valueOf(s); // ()안에 변수를 String으로 바꾸어 줌
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_05_ReverseAlphaber_A T = new S1_05_ReverseAlphaber_A();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
