import java.io.*;
import java.util.ArrayDeque;

public class Main {

    public static void main(String args[]) throws IOException {

        //입력 클래스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //출력 클래스
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스 T입력
        int T = Integer.parseInt(br.readLine());

        //덱 클래스 선언
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        //테스트 케이스 T만큼 반복
        for (int i=0; i<T; i++) {

            //명령 + 숫자 입력
            String str = br.readLine();
            String[] s = str.split(" ");
            String op = s[0];  //명령어만 뻄

            if (op.equals("push_front")) {
                int num = Integer.parseInt(s[1]);  //숫자를 받아옴.
                queue.offerFirst(num);             //push_front 수행

            }
            else if (op.equals("push_back")) {
                int num = Integer.parseInt(s[1]);  //숫자를 받아옴.
                queue.offerLast(num);              //push_back 수행

            }
            else if (op.equals("front")) {
                if (queue.isEmpty()) {            // 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력
                    bw.write("-1");
                } else {
                    bw.write(String.valueOf(queue.peekFirst()));  // 덱의 가장 앞에 있는 정수를 출력
                }
                bw.write("\n");
            }
            else if (op.equals("size")) {
                bw.write(String.valueOf(queue.size()));  //덱에 들어있는 정수의 개수를 출력
                bw.write("\n");
            }
            else if (op.equals("empty")) {
                if (queue.isEmpty()) {               //덱이 비어있으면 1을, 아니면 0을 출력
                    bw.write("1");
                } else {
                    bw.write("0");
                }
                bw.write("\n");
            }
            else if (op.equals("pop_front")) {
                if (queue.isEmpty()) {             //덱에 들어있는 정수가 없는 경우에는 -1을 출력
                    bw.write("-1");
                } else {
                    bw.write(String.valueOf(queue.pollFirst()));  //덱의 가장 앞에 있는 수를 빼고, 그 수를 출력
                }
                bw.write("\n");
            }
            else if (op.equals("pop_back")) {
                if (queue.isEmpty()) {
                    bw.write("-1");  //덱에 들어있는 정수가 없는 경우에는 -1을 출력
                } else {
                    bw.write(String.valueOf(queue.pollLast()));   //덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력
                }
                bw.write("\n");
            }
            else if (op.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1");  //덱에 들어있는 정수가 없는 경우에는 -1을 출력
                } else {
                    bw.write(String.valueOf(queue.peekLast()));  //덱의 가장 뒤에 있는 정수를 출력
                }
                bw.write("\n");
            }
        }
        bw.flush();
    }



}