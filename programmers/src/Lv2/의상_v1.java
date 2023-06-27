package Lv2;

import java.util.HashMap;

public class 의상_v1 {
    public int solution(String[][] clothes) {

        HashMap<String, Integer> map = new HashMap<>();

        //의상 종류별로 개수를 세어 해시맵에 저장
        for(int i=0; i<clothes.length; i++){
            String category = clothes[i][1];                        //clothes에서 row 조회후 col 1 조회
            map.put(category, map.getOrDefault(category, 0) + 1);  //카테고리별 개수 저장
        }

        int count = 1;  //서로 다른 옷의 조합의 수

        //각 옷 종류별로 입을지 안 입을지 여부를 선택하여 경우의 수 계산
        for(String key : map.keySet()) {
            count *= (map.get(key)+1);         //종류A를 입지않고 종류B만 입는 경우도 고려하여 (A+1)*(B+1)
        }

        return count - 1;  //모든 의상을 입지 않는 경우는 제외하고 반환
    }
}
