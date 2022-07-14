import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();          
		in.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);  // T의 십의 자릿수 +  T의 일의 자릿수
//			System.out.println(N);			
			
			cnt++;          
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
