package Inflearn.Section1.Answer;

import java.util.Scanner;

// S1_12

/*
 * 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해서 보냄
 * 알파벳 한 문자마다 # 또는 *이 7개로 구성
 * 
 * 현수가 "#*****#"으로 구성된 문자를 보내면 영희는 다음과 같이 해석
 * #*****# -> 7자리의 2진수로 바꿈 -> # : 1, * : 0 -> 1000001
 * 이걸 10진수화 -> 65 -> 아스키 번호가 65문자로 변환 -> 'A'
 * A 65 ~ Z 90
 * 
 * 현수가 4개의 문자를 다음과 같이 신호로 보냈다 
 * #****###**#####**#####**##**
 * -> 4개의 문자 신호로 구분 시
 * #****## C
 * #**#### O
 * #**#### O
 * #**##** L
 * 
 * 신호 해석 프로그램 작성하기!
 * 
 * 입력 : 첫 줄에는 10을 넘지않는. 보낸 문자의 개수가 입력되고, 다음 줄에는 문자의 개수의 7배 만큼의 # 또는 * 신호가 입력됩니다.
 * 4
 * #****###**#####**#####**##** 
 * 
 * 출력 : COOL
 * 
 */

public class S1_12_Code {
	public String solution(int n, String str) {
		String answer = "";
		
		// for문
		for(int i = 0; i < n; i++) { // n개의 문자를 만들기 위해
			/* 문장 속 단어 substring() 사용 */
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0'); // 7개씩 잘라서, 2진수 형태로 바꿈
			int num = Integer.parseInt(tmp, 2); // 2진수를 10진수로 변환
			answer += (char) num; // char형으로 캐스팅해서 문자형으로 저장
			str = str.substring(7); // 7이전것 잘라버린 후 다시 저장
		}
		return answer;
	}
	
	public static void main(String[] args) {
		S1_12_Code T = new S1_12_Code();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(num, str));
	}
}
