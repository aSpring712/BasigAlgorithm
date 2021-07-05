package boj;
/* 빠른 A+B => BufferedReader, BufferedWriter
 * 버퍼를 거쳐 입/츨력 장치로 전달 -> 시스템의 데이터 처리 효율성을 높여주며
 * InputStreamReader/OutputStreamWriter를 같이 사용하여 버퍼링을 하게 되면 입출력 스트림으로부터
 * 미리 버퍼에 데이터를 갖다놓기 때문에 효율적이고 데이터 양이 적을 때에는 차이가 미미하지만
 * 양이 많을 수록 속도면에서 빠름
 * 
 *  --> 버퍼를 사용하지 않으면 입력을 하는 동시에 하나씩 프로그램에 전달되지만,
 *  버퍼를 통해 입력 받으면 입력이 있을 때마다 하나씩 버퍼에 전송되었다가 버퍼가 가득차거나 개행 문자가 나타나면
 *  버퍼 내용을 한번에 프로그램에 전송시킨다. 
 *  
 *  BufferedReader -> 복잡(형편환, 파싱 등), 빠르나 자체 예외처리가 없어서 따로 예외처리 필요 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Reader와 Writer를 선언
		// 각각 InputStreamReader와 OutputStreamReader를 통해 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// read로 입력받은 데이터를 가공하기 위한 Tokenizer 선언
		// BufferedReader로 입력한 값은 전부 String으로 return 됨 -> 토큰화하여 가공해야 함
		StringTokenizer st;
		
		// String 값이 return 되므로 필요한 형태로 형변환 필요
		int T = Integer.parseInt(br.readLine()); /* 몇 번의 연산을 할 것인지 입력 받음 */
		
		for(int i = 0; i < T; i++) { // T번만큼 돌면서 입력받고, 계산
			// String으로 입력받은값을 Token화하여
			st = new StringTokenizer(br.readLine()); // 12 34 한 줄 입력받음
			
			// 토큰별로 잘라서 원하는 형태로 데이터 형변환
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int result = A + B;
			
			// 결과 출력
			bw.write(result + "\n"); // 자동 개행 안됨
		}
		
		// Writer의 경우 반드시 flush()나 close()를 호출해 닫아줘야 함
		bw.flush();
	}
}
