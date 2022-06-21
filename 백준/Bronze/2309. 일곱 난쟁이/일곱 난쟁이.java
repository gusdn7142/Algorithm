import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int arr[] = new int[9];  //아홉 난장이 키를 입력받을 배열
        int sum = 0;                //아홉 난장이 키의 합

        //아홉 난장이의 키 입력
        for(int i=0; i<9; i++){
            arr[i] = scan.nextInt();
            //scan.next();
            sum +=arr[i];
        }

        for(int i=0; i<8; i++) {                //0번 인덱스 ~ 7번 인덱스까지 반복
            for (int j = 1; j < 9; j++) {      //1번 인덱스 ~ 8번 인덱스까지 반복

                if(sum - (arr[i]+arr[j]) == 100){  //9C2를 구하면
                    arr[i] = 0;  
                    arr[j] = 0;

                    Arrays.sort(arr);            //오름차순 정렬
                    for(int k=2; k<9; k++) {     //0인 키를 가진 난쟁이 2명을 제외하고 나머지 7명의 난쟁이의 키 출력
                        System.out.println(arr[k]);
                    }

                    System.exit(0);  //시스템 종료

                }


            }

        }



    }










}
