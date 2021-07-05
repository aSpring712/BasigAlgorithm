package Inflearn.Section1.My;

import java.util.Scanner;

public class S1_08_validPalindrome {

	public String solution(String str) {
		String answer = "NO";
		
		// equalsIgnoreCase : 대소문자 구분하지 않고 같은지 알아볼 수도 있지만 이번에는 대문자로 다 바꿔서 equals로 비교
		// replace()는 정규식 사용 불가능 <-> replaceAll()은 정규식 사용 가능
		// 대문자 A-Z까지가 ^ 아니면 -> 그것들을 다 빈 문자 ""로 바꾸어라
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
//		System.out.println(str);  -> FOUNDTIMESTUDYUDUTSEMITDNUOF
		
		// StringBuilder로 reverse 시켜서 비교
		String tmp = new StringBuilder(str).reverse().toString(); // str을 reverse 시키고 tmp에 String 형으로 바꿔서 저장
		
		if(str.equals(tmp)) {
			answer = "YES"; // 또는
//			return "YES"; //로 바로 YES를 return 시켜버림
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S1_08_validPalindrome T = new S1_08_validPalindrome();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 공백을 포함한 문자열이 입력되므로 한 줄을 입력받는 nextLine()으로 받음
		System.out.println(T.solution(str));
	}
}
