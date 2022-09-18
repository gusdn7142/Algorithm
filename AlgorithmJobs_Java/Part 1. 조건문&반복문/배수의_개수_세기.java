package Part_1_조건문and반복문;
import java.util.Scanner;

public class 배수의_개수_세기 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //3개의 자연수 a ,b, c 입력
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //a가 b보다 클 경우
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        //a부터 b까지의 수중 c의 배수의 개수를 카운트
        int cnt = 0;
        for(int i=a; i<=b; i++){
            if(i%c==0){  //i가 c의 배수이면
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
