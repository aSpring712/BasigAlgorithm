package Inflearn.Section1.MyReview;

import java.util.Scanner;

public class S1_03_FindLongestWord {
	/* substring(), indexOf */
	public String solution(String str) {
		   String answer = "";
		   
		   int i; // 분리할 index 위치
		   int max = Integer.MIN_VALUE; // 구할 수 있는 최소값으로 초기화
		   
		   while((i = str.indexOf(" ")) != -1) { // it is time to stydy 하면 처음에 2 5 10 13 이렇게 공백 네개까지 구하기
			   // 즉 공백이 없어서 반환값이 -1 나오면 while문 stop하고 빠져나감
			   
			   String tmp = str.substring(0, i); // 첫번째 글자부터 공백 직전까지 자름!
			   int len = tmp.length();
			   
			   if(len > max) {
				   max = len;
				   answer = tmp;
			   }
			   
			   str = str.substring(i+1);
		   }
		   
		   if(str.length() > max) 
			   answer = str;
		   
		   return "가장 긴 단어 : " + answer;
		  }

	public static void main(String[] args) {
//		한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//		문장속의 각 단어는 공백으로 구분됩니다.
//
//		입력
//		첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//
//		출력
//		첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
		S1_03_FindLongestWord T = new S1_03_FindLongestWord();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 한 문장 입력
		System.out.println(T.solution(str));
	}
}
