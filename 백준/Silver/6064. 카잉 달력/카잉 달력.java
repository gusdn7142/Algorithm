import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //테스트 케이스 T 입력력
       int T = scan.nextInt();


        while (T-->0){

            //4개의 정수 입력
            int m = scan.nextInt();
            int n = scan.nextInt();
            int x = scan.nextInt()-1;  //나머지 값이 0이 나오는것을 방지하기 위해 -1
            int y = scan.nextInt()-1;  //나머지 값이 0이 나오는것을 방지하기 위해 -1

            //전체 해 판단
            boolean check = false;

            //x는 고정하면서 x부터 n*m까지 반복하면서
            for (int i = x; i < (n * m); i += m) {

                if (i % n == y) {  //전체 해 i를 n으로 나눈 나머지가 y일떄의 i값 출력
                    System.out.println(i + 1);
                    check = true;
                    break;
                }

            }


            if (!check) {
                System.out.println(-1);

            }




        }







    }





}
