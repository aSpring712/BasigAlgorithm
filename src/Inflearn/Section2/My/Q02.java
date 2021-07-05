package Inflearn.Section2.My;
// 2-2. 보이는 학생

import java.util.Scanner;

/*
 * 선생님이 볼 수 있는 학생의 수 구하기(앞 사람보다 크면 보이고, 작거나 같으면 보이지 않음)
 * 
 * 입력 : 첫 줄에 정수 N(5~100000) 입력, 다음 줄에 N명의 학생의 키가 앞에서부터 순서대로 주어짐
 * 8
 * 130 135 148 140 145 150 150 153
 * 
 * 출력 : 선생님이 볼 수 있는 최대 학생의 수
 * 5
 */
public class Q02 {

	public int solution(int n, int[] arr) {
		int answer = 1; // 제일 앞에 서있는 애는 보이므로 기본 값은 1
		int max = arr[0]; // 일단 맨 앞에 있는 애 값으로 주기
		
		for(int i = 1; i < n; i++) { // 1 2 3 4 5 6 7 
			if(max < arr[i]) { // 뒤에 있는 애가 더 커서 보인다면
				answer++; // 보이는 애 1명 증가
				max = arr[i];
			}
		}
		// 큰 키 정의 (처음에는 최소값으로) -> 키가 큰 애가 나타나면 answer++되고, max 값도 갱신
		// 볼 수 있는 애의 수 ++ 시켜주기
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 학생 수 N 입력받고
		// System.in을 N번 반복해서 배열에 저장
		 Q02 T = new Q02();
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 for(int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.println(T.solution(n, arr));
	}

}
