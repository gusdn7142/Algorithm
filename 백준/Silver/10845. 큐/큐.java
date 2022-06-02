import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();       // 출력할 결과물 저장

        //테스트 케이스 T 입력
        int T = scan.nextInt();

        //큐 셋팅
        int[] queue = new int[T];
        int begin = 0;
        int end = 0;


        while(T-->0){
            //명령 입력 (명령어)
            String op = scan.next();   //" "으로 인식하여 끊음

            switch (op) {  //명령어
                case "push":
                    //push 명령 수행 + end도 1증가
                    queue[end++] = scan.nextInt(); //숫자
                    break;
                case "pop":
                    if (begin == end) {  //큐에 값이 없을 경우
                        sb.append("-1").append("\n");
                    }
                    else //pop 명령 수행 + begin도 1증가
                        sb.append(queue[begin++]).append("\n");
                    break;
                case "front":
                    if (begin == end) {  //큐에 값이 없을 경우
                        sb.append("-1").append("\n");
                    }
                    else
                        sb.append(queue[begin]).append("\n");
                    break;
                case "back":
                    if (begin == end) {  //큐에 값이 없을 경우
                        sb.append("-1").append("\n");
                    }
                    else
                        sb.append(queue[end-1]).append("\n");
                    break;
                case "size":
                    sb.append(end-begin).append("\n");
                    break;
                case "empty":
                    if (begin == end) {  //큐에 값이 없을 경우
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);


    }

}





