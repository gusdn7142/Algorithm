import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class 스택2 {

    static int[] stack;


    public static void main(String[] args){

        //테스트 케이스 T 입력
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        stack = new int[T];    //스택의 크기를 T만큼 만듦

        StringBuilder sb = new StringBuilder();  //System.out의 시간 초과로 출력에 사용 예정

        //스택 클래스
        Stack<Integer> stack = new Stack<Integer>();

        //T만큼 테스트케이스 반복
        for(int i=0; i<T; i++){

            //명령 입력
            String str = scan.next();

            switch (str){
                case "push":
                    stack.push(scan.nextInt());          //push일 경우 정수를 입력받는다
                    break;
                case "pop":
                    if(stack.empty()){
                        sb.append(-1).append("\n");
                    }
                    else
                        sb.append(stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.empty()){
                        sb.append(1).append("\n");
                    }
                    else
                        sb.append(0).append("\n");
                    break;
                case "top":
                    if(stack.empty()){
                        sb.append(-1).append("\n");
                    }
                    else
                        sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);

        scan.close();
    }






}