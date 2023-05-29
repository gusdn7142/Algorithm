package Lv1;

public class 가장_가까운_같은_글자_v2 {
    public int[] solution(String str) {
        int[] result = new int[str.length()];

        //result[] 배열 각 요소의 가장 가까운 같은 글자의 거리 계산
        for(int i=0; i<str.length(); i++){

            String subStr = str.substring(0,i);   //문자 집합
            char alpha = str.charAt(i);           //찾을 문자

            if(subStr.indexOf(alpha)==-1) {   //찾을 문자를 찾지 못했다면
                result[i] = -1;                //-1 대입
            }else {                           //찾을 문자를 찾았다면
                result[i] = i-subStr.lastIndexOf(alpha);   //(i-alpha가 나온 마지막 인덱스) 대입
            }

        }

        return result;
    }
}
