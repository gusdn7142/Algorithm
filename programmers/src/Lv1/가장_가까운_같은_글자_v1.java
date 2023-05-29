package Lv1;

public class 가장_가까운_같은_글자_v1 {
    public int[] solution(String str) {
        int[] result = new int[str.length()];

        //result[] 배열 각 요소의 가장 가까운 같은 글자의 거리 계산
        for(int i=0; i<str.length(); i++){
            char alpha = str.charAt(i);
            int distance = -1;

            for(int j=0; j<i; j++){
                if(str.charAt(j)==alpha){
                    distance = i - j;
                }
            }

            result[i] = distance;
        }

        return result;
    }
}
