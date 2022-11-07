package Part_8_자료구조_스택and큐;

import java.util.Scanner;

public class 스택_구현 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();  //스택의 최대 크기
        int m = scan.nextInt();  //연산의 개수

        Stack stack = new Stack();  //스택 초기화
        stack.create(n);            //스택의 최대크기 설정

        for(int i=0; i<m; i++){

            int operation = scan.nextInt();  //명령 입력

            if(operation == 1){              //push()
                int num = scan.nextInt();    //숫자 입력
                stack.push(num);
            }
            else if(operation == 2){         //pop()
                stack.pop();
            }
            else if(operation == 3){         //top()
                int result = stack.top();
                if(result==-1) System.out.println("NULL");
                else System.out.println(result);
            }
        }
    }




}


class Stack{
    //1 : push
    //2 : pop
    //3 : Top

    int len;                //스택의 현재 크기
    int capacity;           //스택의 최대 크기
    int data[] = new int[105]; //스택 배열

    void create(int n){
        capacity = n;  //스택의 최대 크기 설정
    }

    void push(int y){
        if(len >= capacity){   //스택의 값이 최대 크기를 초과하면
            System.out.println("Overflow");
        }
        else {
            data[len++] = y;   //스택에 값 삽입
        }

    }

    void pop(){
        if(len <= 0){   //스택에 값이 없으면
            System.out.println("Underflow");
        }
        else {
            data[len-1] = 0;   //스택에서 값 제거
            len--;
        }

    }

    int top(){
        if(len <= 0){   //스택에 값이 없으면
            //System.out.println("NULL");
            return -1;
        }
        else {
            return data[len-1];   //스택의 가장 상단 값 리턴
        }

    }
}
