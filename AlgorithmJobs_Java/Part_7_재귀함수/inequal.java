package Part_5_재귀함수;

import java.util.Scanner;

public class inequal {


    //전역변수 초기화
    static int k;        //부등호 수
    static String str;    //부등호 문자열
    static int result[] = new int[20];        //결과값 저장 배열
    static char[] chArray = new char[20];  //부등호 저장 문자 배열
    static boolean checkMax[] = new boolean[20];    //배열의 0~9까지의 숫자 중복 체크
    static boolean finishMax = false;                //getMax() 함수 종료 체크
    static boolean checkMin[] = new boolean[20];    //배열의 0~9까지의 숫자 중복 체크
    static boolean finishMin = false;                //getMin() 함수 종료 체크


    //최대값 구하는 함수
    static void getMax(int index){

        if(finishMax==true) return;     //최대 정수를 출력했다면 getMax() 함수 종료

        if(index > k) {                 //기저조건..  index가 k+1번째이면
            for(int i=0; i<k+1; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
            finishMax = true;         //getMax() 함수 종료 여부 true로 변경
        }
        else{
            for(int i=9; i>=0; i--) {   //9부터 0까지의 수 i
                result[index] = i;

                boolean signFlag = false;   //부등호 관계 만족여부 체크

                if(checkMax[i] == false) {   //중복값이 아니라면
                    if(index==0) signFlag=true;        //부등호 관계 만족
                    else {
                        if(chArray[index-1] == '>'){
                            if(result[index-1] > result[index]){
                                signFlag = true;        //부등호 관계 만족
                            }
                        }

                        if(chArray[index-1] == '<'){
                            if(result[index-1] < result[index]){
                                signFlag = true;        //부등호 관계 만족
                            }
                        }
                    }

                    if(signFlag == true){           //부등호 관계가 만족이면
                        checkMax[i] = true;      //중복값 여부를 true로 변경
                        getMax(index+1);        //재귀함수 반복
                        checkMax[i] = false;     //중복값 여부를 false로 변경
                    }
                }
            }
        }

    }



    //최소값 구하는 함수
    static void getMin(int index){

        if(finishMin==true) return;     //최대 정수를 출력했다면 getMin() 함수 종료

        if(index > k) {                 //기저조건..  index가 k+1번째이면
            for(int i=0; i<k+1; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
            finishMin = true;         //getMin() 함수 종료 여부 true로 변경
        }
        else{
            for(int i=0; i<=9; i++) {   //0부터 9까지의 수 i
                result[index] = i;

                boolean signFlag = false;   //부등호 관계 만족여부 체크

                if(checkMin[i] == false) {   //중복값이 아니라면
                    if(index==0) signFlag=true;        //부등호 관계 만족
                    else {
                        if(chArray[index-1] == '>'){
                            if(result[index-1] > result[index]){
                                signFlag = true;        //부등호 관계 만족
                            }
                        }

                        if(chArray[index-1] == '<'){
                            if(result[index-1] < result[index]){
                                signFlag = true;        //부등호 관계 만족
                            }
                        }
                    }

                    if(signFlag == true){           //부등호 관계가 만족이면
                        checkMin[i] = true;      //중복값 여부를 true로 변경
                        getMin(index+1);        //재귀함수 반복
                        checkMin[i] = false;     //중복값 여부를 false로 변경
                    }
                }
            }
        }

    }




    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        k = scan.nextInt();             //부등호 수
        scan.nextLine();                //한 줄 띄기
        str = scan.nextLine();          //부등호 문자열 입력
        str = str.replaceAll(" ", "");     //부등호 문자열에서 공백 제거
        chArray = str.toCharArray();  //부등호 문자배열


        getMax(0);   //최대값 함수
        getMin(0);  //최소값 함수


    }
}
