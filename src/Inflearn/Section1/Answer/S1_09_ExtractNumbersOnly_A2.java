package Inflearn.Section1.Answer;

import java.util.Scanner;

// 숫자만 추출
// S1_09_ExtractNumbersOnly
/* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만든다
 * 만약 tge0a1h205er에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 '자연수'로 만들면 1205가 된다 -> 자연수의 첫 자리가 0인것은 의미가 없으므로 1205만 출력됨 
 * 추출하여 만들어진 자연수는 100,000,000을 넘지 않는다
 * 
 * 입력 : 첫 줄에 문자열의 길이가 100을 넘지 않는 숫자와 문자가 섞인 문자열이 입력된다 ex) g0en2T0s8eSoft
 * 출력 : 첫 줄에 자연수를 출력한다.
 */

public class S1_09_ExtractNumbersOnly_A2 {
	
	public int solution(String str) {
		String answer = ""; // 0으로 초기화를 해놓고 문자열에서 하나하나 탐색
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x; // String형이므로 더해지지 않고 문자 0 2 0 8이 누적됨
		}
		
		return Integer.parseInt(answer); // 문자 0208을 정수형으로 바꿔주면 숫자 208이 됨
	}

	public static void main(String[] args) {
		S1_09_ExtractNumbersOnly_A2 T = new S1_09_ExtractNumbersOnly_A2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
