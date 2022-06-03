import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {  //readLine() 사용시  IOException 필요

        //입력 클래스 설정
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //출력 클래스 설정
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //알파벳 문장 입력
        String str = bf.readLine() + "\n";

        //스택 불러오기
        Stack<Character> s = new Stack<>();
        boolean tag = false; //태그 확인용

        //단어 뒤집어 출력
        for (char ch : str.toCharArray()) {  //toCharArray() : 문자열을 char형 배열로 바꿔준다
            if (ch == '<') {               //'<'일떄 tag는 true
                while (!s.isEmpty()) {       //스택이 비지 않았으면
                    bw.write(s.pop());       //pop
                }
                tag = true;
                bw.write(ch);
            } else if (ch == '>') {         //'>'일때 tag는 false
                tag = false;
                bw.write(ch);
            } else if (tag) {              //tag가 true이면 계속 출력
                bw.write(ch);
            }
            else if (ch == '\n' || ch == ' ') {   //tag 이후에 문자열이 공백이고
                while (!s.isEmpty()) {       //스택이 비지 않았으면
                    bw.write(s.pop());       //pop하여 출력
                }
                bw.write(ch);              //출력시 단어마다 간격을 주기 위해 설정
            }
            else {                        //tag 이후에 문자열이 공백이 아니면
                s.push(ch);                 //push
            }
        }
        bw.flush();  
        
    }

}
