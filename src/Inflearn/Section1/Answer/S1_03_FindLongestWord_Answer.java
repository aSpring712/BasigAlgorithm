package Inflearn.Section1.Answer;

import java.util.Scanner;

public class S1_03_FindLongestWord_Answer {

	 public String solution(String str) {
		    String answer = "";
		    int m = Integer.MIN_VALUE; // 가장 작은 값 -... 로 초기화됨!
		    // 띄어쓰기로 분리해서 배열에 저장
		    String[] s = str.split(" ");
		    for(String x : s) {
		    	int len = x.length(); // 각 단어의 길이가 저장됨
		    	if(len > m) { // 단어 길이가 최소값 m보다 더 길면
		    		m = len; // 그 긴 길이를 m에 저장
		    		answer = x; // 이 때의 단어 x를 answer에 넣음
		    	}
		    }
		    return answer;
		  }
	
	public static void main(String[] args) {
		S1_03_FindLongestWord_Answer T = new S1_03_FindLongestWord_Answer();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 한 줄 입력받기
		System.out.println(T.solution(str));
	}
}
