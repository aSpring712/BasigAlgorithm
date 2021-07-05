package Inflearn.Section1.Answer;
/* indexOf(), substring()으로 풀기 */
import java.util.Scanner;

public class S1_03_FindLongestWord_Answer2 {

	 public String solution(String str) {
		    String answer = "";
		    int m = Integer.MIN_VALUE, index;
		    /* 문자열.indexOf(' ')   -> 문자열 중에 공백이 발생하는 가장 첫번째 index를 반환 */
		    
		    while((index = str.indexOf(' ')) != -1) { 
		    	/* 문장에서 공백 발견 시 index 숫자 반환(가장 처음에 발견되는 공백 위치 출력), 끝까지 돌면 이제 공백 없으니 -1 반환 -> 반복문 종료 */
		    	// it" "  ->  2에서 공백 발견 -> 2 반환  						    2번째 공백은 5, 그 다음은 10,	 13
		    	// substring()으로 공백 발견한 2 이전까지의 문자 따오기 -> it		it is          it is time 		it is time to
		    	String tmp = str.substring(0, index); // 0 ~ index 전까지를 떼어서 tmp에 담음 -> tmp = "it"
		    	
		    	int len = tmp.length(); // 떼어낸 문자의 길이를 변수 len에 담고
		    	if(len > m) { // 길이가 최소값 m보다 길면 m에다가 len 집어넣고 
		    		m = len;
		    		answer = tmp; // 긴 단어니까 answer에 담음 -> 앞에서부터 비교해야 길이가 같을 때 앞에 단어가 담김 : it
		    	}
		    	str = str.substring(index+1); // index+1 즉 it 뒤 is time to study까지 추출해서 담음
		    }
		    if(str.length() > m) answer = str;
		    return answer;
	 }
	
	public static void main(String[] args) {
		S1_03_FindLongestWord_Answer2 T = new S1_03_FindLongestWord_Answer2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 한 줄 입력받기
		System.out.println(T.solution(str));
	}
}
