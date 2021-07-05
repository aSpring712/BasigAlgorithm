package Inflearn.Section1.My;

import java.util.ArrayList;
import java.util.Scanner;

// S1_04_ReverseWord 단어 뒤집기

/*
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
 * 첫 줄에 자연수 N(3<=N<=20)이 주어짐
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어지며
 * 단어는 영어 알파벳으로만 구성되어 있음
 * 
 * N개의 단어를 입력된 순서대로
 * 한 줄에 하나씩 뒤집어서 출력
 * 
 * 입력
 * 3
 * good
 * Time
 * Big
 * 
 * 출력
 * doog
 * emiT
 * giB
 */

public class S1_04_ReverseWord {

	/* String은 변경되면 새로운 객체를 계속 생성(수정이 아님)
	 * 그런데 StringBuilder는 객체 하나만 만들어 놓으면 수정, 삭제 등등... 해도 그 객체로 쓰지
	 * 새로 생성되거나 하지 않음 -> 메모리 낭비가 없음
	 * String의 수정이 많으면 StringBuilder 사용 */
	
	public String Solution(String[] str) { // n개의 배열 str 넘겨받음
		String answer = "";
		
		for(String s : str) {
			String tmp = "";
			for(int i = s.length()-1; i >= 0; i--) {
				tmp += s.charAt(i);
			}
			answer += tmp + "\n";
		}
		
		return answer;
	}
	
	/*
	 * 여기서 ArrayList 말고 String[] 배열을 만들어서 담아도 되는지?
	 * - 리스트와 배열의 효율성 차이는 그때그때 다름!
	 * 만약 
	 */
	
	public static void main(String[] args) {
		S1_04_ReverseWord T = new S1_04_ReverseWord();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n개의 단어를 입력하겠다
		String[] str = new String[n]; // 크기가 n인 배열 만들기
		
		for(int i = 0; i < n; i++) {
			str[i] = sc.next(); // 엔터로 구분, 단어 3개 입력받기
		}
		
		System.out.println(T.Solution(str)); // str 배열 넘겨줌
	}
}
