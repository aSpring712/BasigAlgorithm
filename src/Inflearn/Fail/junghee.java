package Inflearn.Fail;

import java.util.Scanner;

// 표준 체중 구하기
/*
 * 남자 : 키(m) * 키(m) * 22
 * 여자 : 키(m) * 키(m) * 21
 * 
 * 표준 체중은 별도 함수 std_weight 내에서 계산, 파라미터 값 : height, gender
 * 출력 : 소수점 둘째자리까지
 */

public class junghee {

	public void std_weight(int height, String gender) { 
		float weight = 0;
		
		// cm -> m로 변환 0.01 곱하기
		double tmp = height * 0.01;
		
		if(gender.equals("남자")) {
			weight = (float) Math.pow(tmp, 2) * 22;
		} else {
			weight = (float) Math.pow(tmp, 2) * 21;
		}
		
		System.out.printf("키 %dcm %s의 표준 체중은 %.2fkg 입니다.", height, gender, weight);
	}
	
	public static void main(String[] args) {
		junghee T = new junghee();
		Scanner sc = new Scanner(System.in);
		System.out.println("키(cm)와 성별(남자/여자)을 입력하세요 >> ");
		int height = sc.nextInt();
		String gender = sc.next();
		
		T.std_weight(height, gender);
	}
}
