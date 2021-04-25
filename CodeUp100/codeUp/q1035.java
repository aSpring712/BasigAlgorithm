package codeUp;

import java.util.Scanner;

public class q1035 {

	public static void main(String[] args) {
		// 16진수로 입력된 정수 1개를 8진수로 바꾸어 출력하기
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); // 숫자 하나 입력받음 -> 16진수로 바꾸기 위해서 String으로 받았음
		int o = Integer.parseInt(s, 16); // 입력받은 숫자를 16진수로 변환함
		System.out.println("16진수 " + o); // 16진수로 바뀌었는지 확인
		System.out.print("8진수로 변환 : ");
		System.out.printf("%o", o); // %o를 통해서 int형 16진수 o를 8진수로 변환하여 출력
		
	}

}
