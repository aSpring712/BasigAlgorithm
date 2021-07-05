package codeUp;

import java.util.Scanner;

public class q1008 {
	public static void main(String[] args) {
		//System.out.println("Hello\nWorld"); 
		/* escape 문자 : 출력하는 문장 안에서 원하는 형식에 맞추어 출력할 수 있도록
		 * 줄을 바꾸는 등의 특별한 의미들을 나타내기 위해 사용 */
		// \n : new line 줄 바꿈
		// \t : tab
		// \c : carriage return, 그 줄 맨앞으로 커서를 보냄
		
		//System.out.println("\'Hello\'");
		// \'   \" 는    '와 "그 자체를 의미함
		
		// System.out.println("\"Hello World\"");
		
		// System.out.println("\"!@#$%^&*()\"");
		
		// 출력 결과 "C:\Download\hello.cpp"   -> \ 는 \\ 두개를 써주어야 함
		// System.out.println("\"C:\\Download\\hello.cpp\"");
		
		/*
		 ┌┬┐
		 ├┼┤
		 └┴┘
		 출력하기
		 */
		
		System.out.println("\u250C\u252C\u2510");
		System.out.println("\u251C\u253C\u2524");
		System.out.println("\u2514\u2534\u2518");
		
//		Scanner sc = new Scanner(System.in);
		//int a = scanner.nextInt();
		//System.out.println(a + " " + a + " " + a);
		
//		String time = sc.next();
//		System.out.println(time);
		
//		
//		char b = scanner.next().charAt(0);
//		System.out.println(b);
		
//		float f = scanner.nextFloat();
//		System.out.printf("%.2f", f);
		
//		String date = sc.next();
//        String[] dateArray = date.split("\\.");
//        
//        int[] arr = new int[3];
//        
//        for(int i = 0; i < dateArray.length; i++) {
//        	arr[i] = Integer.parseInt(dateArray[i]);
//        }
//        
//       	System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
		
//			String birth = sc.next(); // 110011-0000000 주민번호 입력받음 "-"로 구분됨
//			String[] arr = birth.split("-");
//			
//			System.out.printf("%s%s", arr[0], arr[1]);
		
			Scanner sc = new Scanner(System.in);
//	        String str = sc.next();
//	        char[] data = new char[50]; // 길이 50
//	        for(int i = 0; i < str.length(); i++) {
//	        	data[i] = str.charAt(i);
//	        	System.out.printf("%c", data[i]);
//	        }
			
			// String data = sc.next(); // 공백 치면 거기까지만 받아들임 -> asd bdfsa  -> asd 로 끊음
//			String data = sc.nextLine(); // 이렇게 해야 공백까지 포함해서 받아들임
//	        System.out.printf("%s", data);
	        

		}
		
		
}
