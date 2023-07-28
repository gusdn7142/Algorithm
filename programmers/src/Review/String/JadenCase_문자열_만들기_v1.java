package Review.String;

public class JadenCase_문자열_만들기_v1 {
    public String solution(String s) {

        String answer = "";    //출력에 사용될 문자열 변수

        //입력받은 문자열 s를 소문자로 변환 후 " " 기준으로 문자열 잘라서 배열에 넣음
        String[] strArray = s.toLowerCase().split("");

        //공백(" ")을 구분하기 위한 boolean 타입 플래그
        boolean flag = true;      //단어들의 맨 앞자리일때 true, 뒷자리는 false로 추론

        for(String str : strArray) {
            //1. flag가 true이면 str을 대문자로 변환, 아니면 str을 반환하여 더해줌
            if(flag){
                answer += str.toUpperCase();
            }
            else answer += str;


            //2. str이 공백(" ")이면 flag=true, 공백(" ")이 아니면 flag=false
            if(str.equals(" ")==true){
                flag=true;
            }
            else flag=false;
        }

        return answer;
    }
}
