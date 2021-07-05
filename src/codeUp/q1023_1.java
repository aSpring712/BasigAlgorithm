package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1023_1 {

	public static void main(String[] args) throws IOException {
		// [기초-입출력] 실수 1개 입력받아 부분별로 출력하기
		// 정수 부분, 실수 부분으로 나누어서 출력
		// 해결 방법은 여러가지
		// 만약 실수 부분이 0으로 시작하지 않는다면 
		// ex) 1.000009 -> scanf("%d.%d", &a, &b)
		// 절대값이 10000을 넘지 않으며, 소수점 이하 자리수는 최대 6자리까지, 0이 아닌 숫자로 시작한다.
		// 출력 : 첫 번째 줄에 정수 부분, 두 번째 줄에 실수 부분 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine(); // 입력받고
		String arr[] = a.split("\\."); // .으로 나누어서 저장
		System.out.printf("%s\n%s", arr[0], arr[1]);

	}

}
