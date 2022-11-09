package Part_8_자료구조_스택and큐;

import java.util.Scanner;

public class 괄호 {


    public static void main(String[] args){

        //괄호 쌍 입력
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();       //괄호 문자열 입력
        char chArray[] = str.toCharArray();  //괄호 문자열을 괄호 배열로 변환
        int len = chArray.length;                  //괄호 문자열 길이


        //스택 생성
        int stack[] = new int[55];   //스택 배열 생성
        int top=0;                   //스택의 현재 크기


        //스택 구현
        for(int i=0; i<len; i++){
            if(chArray[i]=='('){   //여는 괄호이면
                stack[top]=i;     //스택에 i를 넣는다.
                top++;
            }
            else{  //닫는 괄호이면
                if(top==0){   //스택이 비어 있으면... 닫는 괄호에 대한 짝(여는괄호)이 없는 경우
                    System.out.println("NO");
                    System.exit(0);
                }
                stack[top-1] = 0;   //스택의 값을 제거
                top--;
            }

        }


        //스택이 남아있으면.... 여는 괄호가 남아있다면
        if(top > 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }


    }

}
