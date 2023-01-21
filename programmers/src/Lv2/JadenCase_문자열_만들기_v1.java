package Lv2;

public class JadenCase_문자열_만들기_v1 {
    public String solution(String s) {

        String answer = "";    //출력에 사용될 문자열 변수

        // " " 기준으로 문자열 잘라서 배열에 넣음
        String[] strArray = s.split(" ");


        //문자열 배열의 각 문자열들을 JadenCase 문자열로 만들기
        for(int i=0; i<strArray.length; i++) {

            String str = strArray[i];  //문자열 배열에서 각 문자열을 조회

            if(str.length()==0){    //문자열의 길이가 0이라면 (공백 이라면)
                answer += " ";
            }
            else{     //문자열이 존재하면
                //0번쨰 문자를 대문자로 변환
                answer += str.substring(0,1).toUpperCase();

                //1번째부터 마지막까지 문자를 소문자로 변환
                answer += str.substring(1,str.length()).toLowerCase();

                //마지막에 " "추가
                answer += " ";
            }

        }


        //원래 s의 마지막 문자가 " "이면 그대로 반환
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }

        //원래 s의 마지막 문자가 " "가 아니면 " "를 제거 후 반환
        return answer.substring(0, answer.length()-1);

    }
}
