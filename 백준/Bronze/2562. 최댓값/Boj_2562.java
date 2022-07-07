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
