import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		int T = input.nextInt(); 

		int A[] = new int[T];
		int B[] = new int[T];
		
		for(int i=0; i<T; i++) {
			A[i] = input.nextInt(); 
			B[i] = input.nextInt(); 
		}

		for(int i=0; i<T; i++) {
			System.out.println(A[i]+B[i]);
		}
		
		
		input.close();		
	}
}
