package Lv1;

public class 자릿수_더하기_v2 {
    public int solution(int n) {
        int result = 0;

        String strNum = Integer.toString(n);

        for(int i=0; i<strNum.length(); i++){
            result += strNum.charAt(i)-'0';        //Character.getNumericValue(strNum.charAt(i))
        }

        return result;
    }
}
