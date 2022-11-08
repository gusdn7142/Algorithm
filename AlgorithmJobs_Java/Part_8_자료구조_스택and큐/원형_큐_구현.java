package Part_8_자료구조_스택and큐;

import java.util.Scanner;

public class 원형_큐_구현 {

    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  //큐의 최대 크기
        int m = scan.nextInt();  //연산의 개수

        //큐 연산 수행
        CircleQueue circleQueue = new CircleQueue();  //큐 초기화
        circleQueue.create(n);   //큐의 최대크기 셋팅

        for(int i=0; i<m; i++) {
            int operation = scan.nextInt();   //연산

            if(operation == 1){            //push() 연산 수행
                int num = scan.nextInt();
                circleQueue.push(num);
            }
            else if(operation == 2){       //pop() 연산 수행
                circleQueue.pop();
            }
            else if(operation == 3){       //front() 연산 수행
                int result = circleQueue.front();
                if(result==-1){
                    System.out.println("NULL");
                }
                else{
                    System.out.println(result);
                }
            }
        }



    }


}


//원형 큐
class CircleQueue{

    final int MAX = 100; //배열의 최대 크기
    int f;      //front... pop()에 사용
    int r;      //rear... push()에 사용
    int len;       //원소의 개수
    int capacity;  //큐의 최대 큐기
    int data[] = new int[MAX];  //큐 배열

    void create(int n){
        capacity = n;  //큐의 최대 크기 셋팅
        f = 0;        //front 값 설정
        r = 0;        //rear 값 설정
        len = 0;      //원소의 개수 설정
    }

    void push(int y){

        if(len >= capacity){   //원소의 개수가 큐의 최대크기 이상이면
            System.out.println("Overflow");
        }
        else{
            data[r++] = y;       //큐에 값 삽입
            if(r >= MAX){    //r이 배열의 최대 크기 이상이면
                r = 0;
            }
            len++;     //원소의 개수 증가
        }
    }


    void pop(){
        if(len <= 0){   //원소의 개수가 0개이면
            System.out.println("Underflow");
        }
        else{
            data[f++]=0;
            if(f >= MAX){    //f가 배열의 최대 크기 이상이면
                f = 0;
            }
            len--;     //원소의 개수 감소
        }
    }

    int front(){
        if(len <= 0){   //원소의 개수가 0개이면
            return -1;
        }
        else{
            return data[f];          //front번째 값 리턴
        }

    }


}
