package Review.Loop;

import java.util.Scanner;

public class 삼각형_출력_3_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //n개의 행 출력
        for(int i=0; i<n; i++){

            //공백 출력
            for(int j=0; j<n-1-i; j++){
                System.out.print(" ");
            }
            //"*" 출력
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            System.out.println();  //줄바꿈
        }
    }
}
