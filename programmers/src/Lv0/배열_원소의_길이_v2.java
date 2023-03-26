package Lv0;

import java.util.Arrays;
import java.util.regex.Pattern;

public class 배열_원소의_길이_v2 {
    public int[] solution(String[] strList) {
        int[] strListLength = new int[strList.length];

        boolean bool1 = true;
        boolean bool2 = true;

        //strlist의 각 원소가 1이상 100이하인지 체크
        for(String str : strList){
            if(str.length()<1 && 100<str.length()){
                bool1 = false;
            }
        }

        //strlist의 각 원소가 알파벳의 소문자 or 대문자 or 특수문자로 이루어져 있는지 체크
        String pattern = "[a-zA-Z\\W]+";
        for(String str : strList){
            if(!Pattern.matches(pattern, str)){
                bool2 = false;
            }
        }

        //위의 조건들을 모두 만족하면
        if(bool1 && bool2){
            strListLength = Arrays.stream(strList)
                    //.mapToInt(String::length)
                    .mapToInt(s -> s.length())
                    .toArray();
        }
        return strListLength;
    }
}
