import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //지구(E), 태양(S), 달(M)의 연도
        int E = scan.nextInt();
        int S = scan.nextInt();
        int M = scan.nextInt();

        int e=1;
        int s=1;
        int m=1;

        int year=1;
        while(true){

            if(e>15){
                e=1;
            }

            if(s>28){
                s=1;
            }

            if(m>19){
                m=1;
            }

            if(e==E && s==S && m==M){
                break;
            }

            e++;
            s++;
            m++;
            year++;
        }


        System.out.println(year);





    }




}
