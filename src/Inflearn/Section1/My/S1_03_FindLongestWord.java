package Inflearn.Section1.My;

import java.util.Scanner;

public class S1_03_FindLongestWord {

	 public String solution(String str) {
		    String answer = "";
		    
		    String[] strArr = str.split(" ");
		    int max_index = 0;

		    for(int i = 0; i < strArr.length; i++) {
		      if(strArr[i].length() > strArr[max_index].length()) {
		        max_index = i;
		      }
		    }
		    
		    return answer = strArr[max_index];
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
		String str = sc.nextLine(); // 한 줄 입력받기
		
		System.out.println(T.solution(str));
	}
}
