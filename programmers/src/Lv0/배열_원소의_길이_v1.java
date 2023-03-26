package Lv0;

import java.util.regex.Pattern;

public class 배열_원소의_길이_v1 {
    public int[] solution(String[] strlist) {
        int[] strListLength = new int[strlist.length];

        boolean bool1 = true;
        boolean bool2 = true;

        //strlist의 각 원소가 1이상 100이하인지 체크
        for(String str : strlist){
            if(str.length()<1 && 100<str.length()){
                bool1 = false;
            }
        }

        //strlist의 각 원소가 알파벳의 소문자 or 대문자 or 특수문자로 이루어져 있는지 체크
        String pattern = "[a-zA-Z\\W]+";
        for(String str : strlist){
            if(!Pattern.matches(pattern, str)){
                bool2 = false;
            }
        }

        //위의 조건들을 모두 만족하면
        if(bool1 && bool2){
            //strlist 배열의 각 원소의 길이를 strListLength 배열에 저장
            for(int i=0; i<strListLength.length; i++){
                strListLength[i] = strlist[i].length();
            }
        }
        return strListLength;
    }
}
