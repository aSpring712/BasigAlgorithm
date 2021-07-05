package Inflearn.Section1.My;

public class practice {

	public static void main(String[] args) {
		String a = "1000011";
		int num = Integer.parseInt(a, 2); // 2진수를 10진수로 변환
		System.out.println(Character.toChars(num));
	}

}
