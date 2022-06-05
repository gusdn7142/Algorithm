import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //n과 m을 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //총 사람의 개수 n
        int k = sc.nextInt();  //K번쨰 제거할 사람

        StringBuilder sb = new StringBuilder();  //출력 문자열 지정

        sb.append('<');

        //큐 생성
        Queue<Integer> queue = new LinkedList<Integer>();

        //n번만큼 숫자 push
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }

        for (int i=0; i<n-1; i++) {  //n-1번만큼 반복
            for (int j=0; j<k-1; j++) {  //k-1번 반복
                queue.offer(queue.poll());  //pop한 후에 그 값을 다시 push
            }
            sb.append(queue.poll() + ", ");  //그 값을 pop해서 출력
        }
        sb.append(queue.poll() + ">");  //마지막 값 pop
        System.out.println(sb);


    }





}
