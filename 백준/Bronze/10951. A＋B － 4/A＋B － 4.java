import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		while(input.hasNextInt()){   //hasNextInt()는 Scanner에서 정수를 입력받은 경우 true를 정수를 입력받지 않는 경우 false의 값을 반환받는 메소드
			
			int A=input.nextInt();
			int B=input.nextInt();
			
			System.out.println(A+B);
			
		}
		input.close();				
	}
}
