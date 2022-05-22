import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		
		//BuffredReader 사용 : 예외처리를 꼭 해주어야한
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		
		//BufferedWriter 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
         		
		int T = Integer.parseInt(bf.readLine());  //테스트 수 설정
		
		int A[] = new int[T];
		int B[] = new int[T];		

		for(int i=0; i<T; i++) {
			String tmp = bf.readLine(); 
			String array[] = tmp.split(" "); 
			
			A[i] = Integer.parseInt(array[0]);
			B[i] = Integer.parseInt(array[1]);
		}
		
		
		for(int i=0; i<T; i++) {	
		bw.write(A[i]+B[i] + "\n");   //버퍼에 있는 값 전부 출력
		}

		
//		bw.flush();   
		bw.close();   
		
	}

}
