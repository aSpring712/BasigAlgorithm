package Inflearn.Section1.My;
// 11번
import java.util.Scanner;

// 문자열 압축
/*
 * 알파벳 대문자로 이루어진 문자열을 입력받아
 * 같은 문자가 '연속으로 반복'되는 경우
 * -> 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램 작성
 * (반복횟수가 1인 경우 생략)
 * 
 * 입력 : 첫 줄에 문자열이 주어지고(길이는 100을 넘지 않음) 
 * 출력 : 첫 줄에 압축된 문자열 출력
 *
 * ex) KKHSSSSSSSE  	  ->  K2HS7E
 * ex) KSTTTSEEKFKKKDJJGG ->  KST3SE2KFK3DJ2G2
 */

public class S1_11_strComp {

	public String solution(String str) {
		String answer = "";
		
		// 변수 초기화
		int cnt = 0; // 각 문자의 개수 구하기
		char p = str.charAt(0);
		char[] tmp = str.toCharArray();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == p) { // 같은 문자야!
				cnt++;
				tmp[i] = str.charAt(i);
				if(cnt != 1) {
					tmp[i] = ' ';
				}
			} else { // 다른 문자야!
				p = str.charAt(i);
				
				if(cnt != 1) {
					tmp[i-1] = Integer.toString(cnt).charAt(0); // 걔는 그냥 갯수로 바꿔버려
				}
				cnt = 1; // 그리고 새로 바뀐 문자 갯수는 이제 1개야
			}
		}
		
		if(tmp[tmp.length-1] == ' ') {
			tmp[tmp.length-1] = Integer.toString(cnt).charAt(0);
		}
		
		for(char c : tmp) {
			if(c != ' ') answer += c;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_11_strComp T = new S1_11_strComp();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
