package codeUp;

import java.util.Scanner;

public class q1025 {
	// 정수 1개 입력받아 나누어 출력하기
	// 다섯 자리 정수 1개를 입력받아 각 자리별로 나누어 출력
	// [숫자] 이렇게 출력
	// ex) 75254
	// [70000]
	// [5000]
	// [200]
	// [50]
	// [4]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("다섯 자리의 정수 1개를 입력하세요>>");

		int num = sc.nextInt(); // 다섯 자리로 이루어진 1개의 정수     54321 
		int[] n = new int[5];
		int j = 0;
		int sum = 0;
		
		for(int i = 10000; i > 0; i /= 10 ) { // 10000 1000 100 10
			n[j] = ((num-sum)/i)*i; // n[0] = (54321/i)*i = 50000
			sum += n[j];
			System.out.printf("[%d]\n", n[j]);
			j++;
		}

	}

}
