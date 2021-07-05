package kakaoIntership;

public class Q1 {

	public int solution(String s) { // 일부 자릿수가 영단어로 되어있는 문자열 s
		int answer = 0;
		
		char[] cArr = s.toCharArray(); // 문자 배열 생성
		
		for(char x : cArr) {
			if(Character.isAlphabetic(x)) { // 알파벳이 포함됨
				s = s.replace("zero", "0");
				s = s.replace("one", "1");
				s = s.replace("two", "2");
				s = s.replace("three", "3");
				s = s.replace("four", "4");
				s = s.replace("five", "5");
				s = s.replace("six", "6");
				s = s.replace("seven", "7");
				s = s.replace("eight", "8");
				s = s.replace("nine", "9");
			} 
		}
		
		return answer = Integer.parseInt(s); // 모두 숫자로 return
	}
	
	public static void main(String[] args) {
		Q1 T = new Q1();
		String s = "one4seveneight";
		System.out.println(T.solution(s)); // 정담은 1478
	}
}
