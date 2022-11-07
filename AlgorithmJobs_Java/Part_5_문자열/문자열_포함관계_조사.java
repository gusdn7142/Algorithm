package Part_4_문자열;

import java.util.Scanner;

public class 문자열_포함관계_조사 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        String a = scan.nextLine();   //비교 당할 문자열 입력
        String b = scan.nextLine();   //비교할 문자열 입력


        if(a.contains(b)){             //a문자열 안에 b문자열을 포함하고 있으면
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
