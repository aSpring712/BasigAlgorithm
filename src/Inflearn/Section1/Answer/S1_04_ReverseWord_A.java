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

public class S1_04_ReverseWord_A {

	public ArrayList<String> Solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		// 받아온 문자 뒤집기
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString(); // x를 가지고 StringBuilder를 만들고 이 단어를 뒤집고 String형으로 다시 바꾸어라
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_04_ReverseWord_A T = new S1_04_ReverseWord_A();
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
