import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();       // 출력할 결과물 저장

        //스택 불러옴
        Stack<Integer> stack = new Stack<>();

        //테스트 케이스 T입력
        int T = in.nextInt();

        int top = 0;  //스택에 들어간 마지막 수

        //T번 반복
        while (T-- > 0) {  //T번 반복하여

            int num = in.nextInt();  //수를 입력 (ex, 4)

            if (num > top) {  //top보다 수가 크면
                for (int i = top + 1; i <= num; i++) { // top + 1부터 입력받은 num 까지 push를 한다.
                    stack.push(i);  //1... 2.. 3... 4...
                    sb.append('+').append('\n');    // + 를 저장한다.
                }
                top = num;    //다음 push할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            //스택의 top 값과 입력받은 값이 다른 경우 (top보다 작을때가 전제)
            else if (stack.peek() != num) {
                System.out.println("NO");
                return;        // 또는 System.exit(0); 으로 대체해도 됨.
            }
            //스택의 top 값과 입력받은 값이 같을때 (top보다 작을때가 전제)
            stack.pop();                 //push 모두 완료후 최종 top값 pop
            sb.append('-').append('\n'); //pop할때마다 -출력

        }
        System.out.println(sb);
    }


}
