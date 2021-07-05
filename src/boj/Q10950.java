package boj;

import java.util.Scanner;

public class Q10950 {
	
	public static void main(String[] args) {
		Q10950 T = new Q10950();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] n1 = new int[t];
		int[] n2 = new int[t];
		
		for(int i = 0; i < t; i++) {
			n1[i] = sc.nextInt();
			n2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(n1[i] + n2[i]);
		}
	}
}
