package Inflearn.Section1.Answer;
/* 아스키 코드로 구하기 */
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

public class S1_09_ExtractNumbersOnly_A {
	
	public int solution(String str) {
		int answer = 0; // 0으로 초기화를 해놓고 문자열에서 하나하나 탐색
		
		for(char x : str.toCharArray()) { // (Character는 원래 정수형) -> x >= 48 and x <= 57 -> 문자 '0' : 48 ~ 문자 '9' : 57 -> 를 만나면 true
			if(x >= 48 && x <= 57) { // g0en2T0s8eSoft 가 입력되었을 때 현재 문자형인 숫자들은 0208 -> char형이 연산될 때 아스키코드(숫자)로 연산됨
				answer = answer * 10 + (x-48); // answer
			//              0   * 10 + (48-48)  =   0    -> 연산을 해서 진짜 정수형이 됨
			//              0   * 10 + (50-48)  =   2
			//              2   * 10 + (48-48)  =   20
			//             20   * 10 + (56-48)  =   202 
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		S1_09_ExtractNumbersOnly_A T = new S1_09_ExtractNumbersOnly_A();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
