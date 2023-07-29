package Review.String;

public class 이상한_문자_만들기_v1 {
    public String solution(String str) {

        StringBuilder sb = new StringBuilder();
        boolean switching = true;                 //true(짝수번째), false(홀수번째)
        String result = "";

        //문자열에서 짝수 인덱스는 대문자로, 홀수 인덱스는 소문자로 변환
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == ' '){
                result += " ";
                switching = true;
            }else{
                String temp = "" + str.charAt(i);

                if(switching){                        //짝수번째이면
                    result += temp.toUpperCase();     //대문자로 변환
                } else{                               //홀수번째이면
                    result += temp.toLowerCase();     //소문자로 변환
                }
                switching = !switching;               //true => false, false => true
            }
        }

        return result;
    }
}
