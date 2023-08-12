package Review.Stack;

public class 올바른_괄호_v1 {
    boolean solution(String str) {

        boolean answer = true;         //출력할 문자(bool) 초기화

        char chArray[] = str.toCharArray();  //괄호 문자열을 괄호 배열로 변환
        int len = chArray.length;                  //괄호 문자열 길이

        int stack[] = new int[100000];   //스택 배열 생성
        int top=0;                   //스택의 현재 크기


        //여는 괄호이면 스택에 넣고, 닫는 괄호이면 스택에서 제거하는 로직 구현
        for(int i=0; i<len; i++){
            if(chArray[i]=='('){  //여는 괄호이면
                stack[top] = i;    //스택에 값 입력
                top++;

            }else{ //닫는 괄호이면
                if(top==0){  //스택 배열의 크기가 0이면 (닫는 괄호가 더 많다면)
                    answer = false;
                    break;
                }

                stack[top-1] = 0;    //스택의 값 제거
                top--;
            }
        }

        //스택이 남아있으면 (여는 괄호가 남아있다면)
        if(top > 0){
            answer = false;
        }


        return answer;   //bool 문자 출력
    }
}
