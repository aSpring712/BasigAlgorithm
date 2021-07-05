package programmers;

public class Q1 {

	public static void main(String[] args) {
		boolean answer = true;
		
		String s = "123456";
		int length = s.length();
		char[] c = s.toCharArray();
		
		if(length == 4 || length == 6) {
			for(char x : c) {
				if(!Character.isDigit(x)) {
					answer = false;
					break;
				}
			}
		} else {
			answer = false;
		}
		
		System.out.println(answer);
	}

}
