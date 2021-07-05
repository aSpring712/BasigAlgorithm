package programmers;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		
		int[] numbers = {2, 1, 3, 4, 1};
		int[] answer = new int[numbers.length];
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				answer[i] = numbers[i] + numbers[j];
			}
		}
		
		System.out.println(Arrays.stream(answer).distinct().sorted());
		
		
	}

}
