<<<<<<< HEAD
import java.util.Scanner;

public class Boj_2562 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //배열 생성성
       int arr [] = new int[9];

        //서로 다른 자연수 n개 입력
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        //최댓값과 인덱스 초기화
        int max=arr[0];
        int index=0;


        //최댓값 구하기
        for(int i=1; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);






    }







}
=======
import java.util.Scanner;

public class Boj_2562 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[9];

        //9개의 값 입력
        int max = 0;
        int index = 0;

        for(int i=0; i<9; i++){
            arr[i] = scan.nextInt();

            if(max < arr[i]){
                max = arr[i];
                index = i+1;
            }

        }

        //최댓값과 최댓값이 몇번째 수인지 출력
        System.out.println(max);
        System.out.println(index);


    }






}
>>>>>>> 666a4814868f257974474a3bb0d859a7d21746a8
