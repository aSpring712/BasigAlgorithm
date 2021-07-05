package Inflearn.Section1.Answer;
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
		
		str = str + " ";
		int cnt = 1;
		
		for(int i = 0; i < str.length()-1; i++) { // str에 공백 넣어준건 빼고 계산
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt); // 또는 Integer.toString(cnt)
				cnt = 1;
			}
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
