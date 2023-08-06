package Review.String;

import java.util.HashMap;

public class 가장_가까운_같은_글자_v1 {
    public int[] solution(String str) {
        int[] result = new int[str.length()];
        HashMap<Character, Integer> map = new HashMap<>();   //문자, 인덱스 저장

        //result[] 배열 각 요소에 가장 가까운 같은 글자의 거리 저장
        for(int i=0; i<str.length(); i++){

            char alpha = str.charAt(i);           //찾을 문자

            if(!map.containsKey(alpha)) {   //alpha가 map에 없다면
                result[i] = -1;             //-1로 셋팅
                map.put(alpha, i);          //map에 key=alpha, value=index 입력
            }else {                         //alpha가 map에 있다면
                int beforeIdx = map.get(alpha); //map에서 key==alpha에 해당하는 value 조회
                result[i] = i - beforeIdx;
                map.put(alpha, i);         //map에 key=alpha, value=index 입력
            }
        }


        return result;
    }
}
