package Inflearn.Section1.My;

import java.util.Scanner;

// 001. 문자 찾기
public class S1_01_FindString {
/*
 * 한 개의 문자열을 입력받고
 * 특정 문자를 입력받아
 * 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램 작성
 * 대소문자 구분X, 문자열의 길이는 100을 넘지 않음
 * 
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다
 * 문자열은 영어 알파벳으로만 구성
 * 
 * 입력
 * Computercooler
 * c
 * 
 * 출력
 * 2
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase(); // 한 개의 문자열 입력받기 -> 소문자로 변환해서 저장
//		String str = sc.next().toLowerCase(); // 이 문자가 몇 개 들어가있는지 출력하기 -> 소문자로 변환해서 저장
//		char c = str.charAt(0);
		char c = sc.next().charAt(0); // 이렇게 한방에 해결!
		
		// next() -> 문자 하나 입력받음
		
		int cnt = 0;
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == c) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
