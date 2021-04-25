package codeUp;

import java.util.Scanner;

public class q1034 {

	public static void main(String[] args) {
		/*
		 * 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
		 * 
		 * 참고 %o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다. %d로 출력하면 10진수로 출력된다.
		 * 
		 * 예시 int n; scanf("%o", &n); printf("%d", n); (C언어에서 소스 코드 작성 시 0으로 시작하는 수는
		 * 8진수로 인식된다. int a = 013; // 10진수 11과 같은 값)
		 */
		
		Scanner sc = new Scanner(System.in);
		String su = sc.next();
		int octal = Integer.parseInt(su, 8); // String을 8진수로 변환
		System.out.printf("%d", octal); // 10진수로 변환해서 출력
	}
}
