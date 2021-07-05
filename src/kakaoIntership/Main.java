package kakaoIntership;

public class Main {
	
//	public int distance(int x, int y) {
////		int d = Math.abs();
//		
////		return d;
//	}
	
	public int[] solution(String[][] places) { 
		int[] answer = {};
		int roomNo = 0;
		
		while(roomNo < 5) {
			String[] waiting = places[roomNo]; // 1번째 대기실 검사
			System.out.println(roomNo + "번 대기실 검사");
			boolean b = false;
			int pCnt = 0;
			
			for(int i = 0; i < waiting.length; i++) {
				for(int j = 0; j < waiting.length; j++) {
					if(waiting[i].charAt(j) == 'P') {
						System.out.println(i + "행" + j + "열");
						b = true;
						pCnt++;
					}
				}
			}
			
			if(b == false) {
				System.out.println(roomNo + "번 방에는 응시자 없음");
			} else {
				System.out.println(roomNo + "번 방에 응시자 수 : " + pCnt);
			}
			
			System.out.println();
			roomNo++;
		}
		
		

		
		return answer; 
	}
	

	public static void main(String[] args) {
		Main T = new Main();
		String[][] places = { { "POOOP", // 대기실 1
								"OXXOX", 
								"OPXPX", 
								"OOXOX", 
								"POXXP" },    
				
							  { "POOPX", // 대기실 2
								"OXPXP", 
								"PXXXO", 
								"OXXXO", 
								"OOOPP" },    
							  
							  { "PXOPX", // 대기실 3
								"OXOXP", 
								"OXPXX", 
								"OXXXP", 
								"POOXX" },    
							  
							  { "OOOXX", // 대기실 4
								"XOOOX", 
								"OOOXX", 
								"OXOOX", 
								"OOOOO" }, 
							  
							  { "PXPXP", // 대기실 5
								"XPXPX", 
								"PXPXP", 
								"XPXPX", 
								"PXPXP" } };  

		T.solution(places);
	}

}
