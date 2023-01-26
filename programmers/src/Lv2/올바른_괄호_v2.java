package Lv2;

public class 올바른_괄호_v2 {
    boolean solution(String str) {

        boolean answer = true;         //출력할 문자(bool) 초기화

        int count=0;                     //여는괄호와 닫는괄호의 개수에 대한 카운트

        //여는 괄호이면 count 증가, 닫는 괄호이면 count 감소
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)=='('){  //여는 괄호이면
                count++;
            }
            else if(str.charAt(i)==')'){ //닫는 괄호이면
                count--;

                if(count < 0){  //닫는 괄호가 더 많다면..
                    answer = false;
                    break;
                }
            }
        }

        //여는 괄호가 남아있다면
        if(count > 0){
            answer = false;
        }

        return answer;   //bool 문자 출력
    }
}
