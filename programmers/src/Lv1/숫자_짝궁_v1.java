package Lv1;

public class 숫자_짝궁_v1 {
    public String solution(String X, String Y) {
        StringBuilder result = new StringBuilder();                             //짝궁 문자열

        //1. X 문자열에 0~9까지의 숫자 개수를 xArr 배열에 저장
        int[] xArr = new int[10];

        for(int i=0; i<X.length(); i++){
            int ch = X.charAt(i) - '0';
            xArr[ch]++;
        }

        //System.out.println(Arrays.toString(xArr));


        //2. Y 문자열에 0~9까지의 숫자 개수를 yArr 배열에 저장
        int[] yArr = new int[10];

        for(int i=0; i<Y.length(); i++){
            int ch = Y.charAt(i) - '0';
            yArr[ch]++;
        }

        //System.out.println(Arrays.toString(yArr));


        //3. xArr와 yArr에 저장된 9~0까지 수 중 공통적으로 있는 수를 result 문자열에 저장
        for(int i=9; i>=0; i--){
            while(xArr[i] > 0 && yArr[i] > 0){
                result.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }
        //System.out.println(result.toString());

        if(result.toString().equals(""))   //짝궁이 존재하지 않으면 "-1" 반환
            return "-1";
        else if(result.toString().charAt(0)=='0')  //짝궁이 "0"으로만 구성되어 있으면 "0" 반환
            return "0";

        return result.toString();
    }
}
