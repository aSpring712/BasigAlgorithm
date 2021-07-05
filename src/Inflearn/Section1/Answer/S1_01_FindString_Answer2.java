package Inflearn.Section1.Answer;

import java.util.Scanner;

// 001. 문자 찾기
public class S1_01_FindString_Answer2 {

	// 풀이
	public int solution(String str, char t) { // static이 아닌 instance이기 때문에 객체를 생성해야 함 
		int answer = 0;
		
		// 대소문자를 구분하지 않으니 모두 대문자로 바꿔버리기
		str = str.toUpperCase();
		/* char 변수는 Character라는 클래스의 메서드 사용 */
		t = Character.toUpperCase(t);
		
//		System.out.println(str + "\n" + t);
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == t) answer++;
//		}

		// 향상된 for문 이용하기 -> forEach문
		for(char x : str.toCharArray()) {  // str을 기반으로 문자 배열 객체 생성해서 비교
			/* 여기서 : 우측에 올 것 -> 배열 / iterator를 제공하는 컬렉션 프레임워크들(List, ArrayList..)
			String 문자 한개 한개를 쪼개서 문자를 원소로 하는 문자 배열로 만들어줘야 함 */ 
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	// 입력받기
	public static void main(String[] args) {
		S1_01_FindString_Answer2 T = new S1_01_FindString_Answer2(); // 객체 생성
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); // next() -> 문자 하나 입력받음
		char t = kb.next().charAt(0); // 이렇게 한방에 해결!		
		System.out.println(T.solution(str, t));
	}

}
