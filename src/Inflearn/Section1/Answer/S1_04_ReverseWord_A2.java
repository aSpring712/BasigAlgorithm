package Inflearn.Section1.Answer;

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

public class S1_04_ReverseWord_A2 {

		//       lt		  rt -> lt = 0, rt = s.length()-1
		// S 배열 0 1 2 3 4
		//        S t u d y
		// lt와 rt의 값을 교환해주고
		// S 배열 0 1 2 3 4
		//        y t u d S
		// lt+1 rt-1 해서 또 두개를 교환해주고
       //          lt  rt
		// S 배열 0 1 2 3 4
		//        S d u t y
		// lt+1 rt-1 했는데 글자 갯수가 홀수라서 만약 두개 값이 같아지면 stop
		/* 즉 lt < rt 일 때만 실행하면 됨 */
		
		// 짝수인 경우
		//       lt     rt
		// S 배열 0 1 2 3
		//        g o o d
		// ->     d o o g
		//         lt rt
		//		  d o o g
		// 최종 교환하고 또 lt+1 rt-1 하면 lt>rt가 되어버림
		// 결국 문자열 개수가 짝수이든 홀수이든
		/* lt < rt 일 때만 시행하면 됨 */
	
	public ArrayList<String> Solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		// 받아온 문자 뒤집기
		for(String x : str) { // x는 String임 -> 문자 배열로 만듦
			char[] s = x.toCharArray();
		
			int lt = 0, rt = x.length()-1;

			// 직접 reverse
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				
				lt++;
				rt--;
			}
			// reverse 시킨 char 배열을 다시 한개의 단어로 String화 시키기
			String tmp = String.valueOf(s); // 이렇게 하면 s라는 문자 배열을 String으로 바꿔 줌 -> valueOf : static 메서드라서 클래스 이름 String으로 접근
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_04_ReverseWord_A2 T = new S1_04_ReverseWord_A2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n개의 단어를 입력하겠다
		String[] word = new String[n]; // 단어를 담을 배열의 크기를 n으로 생성
		
		for(int i = 0; i < n; i++) {
			word[i] = sc.next(); // 띄어쓰기로 구분
		}
		
		for(String x : T.Solution(n, word)) {
			System.out.println(x);
		}
	}
}
