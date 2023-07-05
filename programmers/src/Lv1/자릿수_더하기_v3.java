package Lv1;

public class 자릿수_더하기_v3 {
    public int solution(int n) {

        String strNum = Integer.toString(n);

        int result = strNum.chars()
                .map(ch -> ch-'0')
                .sum();

        return result;
    }
}
