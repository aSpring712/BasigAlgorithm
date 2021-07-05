package inClass;

public class FindBestImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imgName[] = { "독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀",
                "아레느깡 단 베르양", "잠자는 소녀", "테라스의 두 자매",
                "피아노 레슨", "피아노 앞의 소녀들", "해변에서"};
		
		int[] voteResult = {0, 0, 5, 8, 3, 1, 1, 0, 5};
		
		int Max = 0; // 가장 큰 점수
		int index = 0; // 가장 큰 점수를 받은 그림
		
		for(int i = 0; i < voteResult.length; i++) {
			if(Max < voteResult[i]) {
				Max = voteResult[i];
				index = i;
			}
		}
		System.out.println("가장 인기가 많은 그림 번호 : " + index + "번 점수 " + Max);
		System.out.println("가장 인기가 많은 그림 이름 : " + imgName[index]);
	}
}
