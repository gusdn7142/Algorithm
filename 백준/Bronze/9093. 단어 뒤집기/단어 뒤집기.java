import java.io.*;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws IOException {  //readLine() 사용시  IOException 필요

        //테스트 케이스 T 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());  //String형을 int형으로 변환 해주어야함

        //출력 클래스 설정
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (T --> 0) {  
            //알파벳 문장 입력
           String str = bf.readLine() + "\n";

           //스택 불러오기
           Stack<Character> s = new Stack<>();

            //단어 뒤집어 출력
           for (char ch : str.toCharArray()) {  //toCharArray() : 문자열을 char형 배열로 바꿔준다
                if (ch == '\n' || ch == ' ') {   //문자열이 공백이고
                    while (!s.isEmpty()) {       //스택이 비지 않았으면
                        bw.write(s.pop());       //pop
                    }
                    bw.write(ch);              //출력시 단어마다 간격을 주기 위해 설정
                } else {                        //문자열이 공백이 아니면
                    s.push(ch);                 //push
                }
            }
        }
        bw.flush(); 


    }

}


