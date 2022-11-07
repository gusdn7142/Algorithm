package Part_5_재귀함수;

import java.util.Scanner;

public class 순열구하기 {
    //변수 초기화
    static int n;            //나열할 알파벳 수
    static int r;           //나열할 자릿수
    static int result[] = new int[10];      //알파벳을 저장할 배열


    static void getResult(int x){  //x번째 for문을 돌려야 함

        if(x >= r){                 //이미 r개의 for문이 돌아갔으면
            boolean flag = false;
            for(int i=0; i<r; i++) {     //배열의 저장된 r개의 수에 중복이 있는지 검사
                for(int j=0; j<r; j++){
                    if(i !=j && result[i] == result[j]){  //i와 j가 다르면서 result[i]와 result[j]가 같으면 중복!!!
                        flag = true;
                    }
                }
            }

            if(flag==false){   //중복이 아니면 result[] 배열값을 출력

                //런타임 에러 방지를 위해 문자열로 출력
                String str="";
                for(int i=0; i<r; i++){
                    str += (char)(result[i]+'a');
                    //System.out.print((char)(result[i]+'a'));
                }
                System.out.println(str);
            }
        }
        else {
            for(int i=0; i<n; i++){
                result[x] = i;
                getResult(x+1);
            }
        }

    }


    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();          //나열할 알파벳 수
        r = scan.nextInt();          //나열할 자릿 수
        getResult(0);

    }


}
