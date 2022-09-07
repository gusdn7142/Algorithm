import java.util.Scanner;



public class 윷놀이 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            //4개의 윷 입력
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();

            //윷의 상태를 입력
            int front = 0;
            int back = 0;

            //윷의 상태 구현
            if(a==0) front++;
            if(b==0) front++;
            if(c==0) front++;
            if(d==0) front++;

            if(a==1) back++;
            if(b==1) back++;
            if(c==1) back++;
            if(d==1) back++;

            //윷의 결과 출력
            if(front==1 && back==3) {
                System.out.println("A");
            }
            if(front==2 && back==2) {
                System.out.println("B");
            }
            if(front==3 && back==1) {
                System.out.println("C");
            }
            if(front==4) {
                System.out.println("D");
            }
            if(back==4) {
                System.out.println("E");
            }

        }

    }
}