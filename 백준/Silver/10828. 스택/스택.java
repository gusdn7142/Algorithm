import java.util.Scanner;

public class Main {

    static int[] stack;
    static int size = 0;


    public static void main(String[] args) {

        //테스트 케이스 T 입력
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        stack = new int[T];    //스택의 크기를 T만큼 만듦

        StringBuilder sb = new StringBuilder();  //System.out의 시간 초과로 출력에 사용 예정

        //T만큼 테스트케이스 반복
        for(int i=0; i<T; i++){

            //명령 입력
            String str = scan.next();

            switch (str){
                case "push":
                    push(scan.nextInt());          //push일 경우 정수를 입력받는다
                    break;
                case "pop":
                    //System.out.println(pop());//pop한후 출력
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    //System.out.println(size());//size 출력
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    //System.out.println(empty());//empty 출력
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    //System.out.println(top());//top 출력
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);


    }


    /* 스택 구현 */

    //push
    static void push(int data){
        stack[size] = data;  //스택 맨위에 값 추가
        size++;              //스택 크기를 1칸 높임
    }

    //pop
    static int pop(){
        if(size==0){   //스택이 비어 있으면
            return -1;
        }

        int res = stack[size-1]; //출력할 스택 맨위에 값을 닮고
        stack[size-1] = 0;       //스택 값을 0으로 만듬
        size--;                 //스택 크기를 1칸 낮춤
        return res;  //pop한 값 리턴
    }

    //size
    static int size(){
        return size;
    }


    //empty
    static int empty(){
        if(size==0){  //스택이 비어있으면
            return 1;
        }
        return 0;
    }


    //top
    static int top(){
        if(size==0){  //스택이 비어있으면
            return -1;
        }
        return stack[size-1];  //스택 최상위 값 출력
    }





}
