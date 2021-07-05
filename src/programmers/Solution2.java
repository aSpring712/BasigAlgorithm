package programmers;
// 완주하지 못한 선수

import java.util.HashMap;

public class Solution2 {

	public String solution(String[] participant, String[] completion) {
      String answer = "";
      
      HashMap<Integer, String> hm = new HashMap<Integer, String>();
      for(int i = 0; i < participant.length; i++) {
    	  hm.put(i, participant[i]);
      }
           
      return answer;
    }
	
	public static void main(String[] args) {
		Solution2 S = new Solution2();
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(S.solution(participant, completion));
	}
}
