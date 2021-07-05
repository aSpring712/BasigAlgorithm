package Inflearn.Section1.Answer;

import java.util.Scanner;

// 001. 문자 찾기
public class S1_01_FindString_Answer {

	// 풀이
	public int solution(String str, char t) { // static이 아닌 instance이기 때문에 객체를 생성해야 함 
		int answer = 0;
		
		// 대소문자를 구분하지 않으니 모두 대문자로 바꿔버리기
		str = str.toUpperCase();
		/* char 변수는 Character라는 클래스의 메서드 사용 */
		t = Character.toUpperCase(t);
		
//		System.out.println(str + "\n" + t);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) answer++;
		}
		
		return answer;
	}
	
	// 입력받기
	public static void main(String[] args) {
		S1_01_FindString_Answer T = new S1_01_FindString_Answer(); // 객체 생성
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); // next() -> 문자 하나 입력받음
		char t = kb.next().charAt(0); // 이렇게 한방에 해결!		
		System.out.println(T.solution(str, t));
	}

}
