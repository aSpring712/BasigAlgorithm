package programmers;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public int solution(int[] nums) {
        int answer = 0; // 마리 수
        int max = nums.length; // 고를 수 있는 포켓몬의 최대 수
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i < nums.length-1; i++) { // 0 1 2 
        	stack.push(nums[i]);
        	for(int j = i+1; j < nums.length; j++) { // 1 2 3
        		if(stack.size() == max) break;
        		else {
        			stack.push(nums[j]);
        		}
        	}
        }
        
        return answer;
        }
	
	public static void main(String[] args) {
		Solution S = new Solution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(S.solution(nums));
	}
}
