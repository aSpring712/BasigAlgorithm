package boj;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int tmp = b; // 385
		System.out.println(a * (tmp%10)); // 472 * 5
		tmp = b / 10; // 38
		System.out.println(a * (tmp%10)); // 472 * 8 
		tmp = tmp / 10; // 3
		System.out.println(a * tmp); // 472 * 3
		System.out.println(a * b);
	}
}
