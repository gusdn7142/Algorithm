package Lv2;

import java.util.*;

public class 귤_고르기_v1 {
    public int solution(int k, int[] tangerine) {
        int count = 0;   //판매할 k개의 귤의 종류

        //1. map 선언
        Map<Integer, Integer> map = new HashMap<>();

        //2. tangerine[] 배열의 귤의 개수를 map에 저장
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
        }

        //3. map을 내림차순 정렬한 후 k번째 수까지의 개수(temp)를 구해 count(종류) 계산
        List<Integer> keySet = new ArrayList<>(map.keySet());

        //value로 map을 오름차순 정렬
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        //Collections.sort(keySet, (o1, o2) -> map.get(o2).compareTo(map.get(o1)) );


        int temp = 0;
        for(int i=0; i<map.size(); i++){
            int key = keySet.get(i);  //내림차순된 key 조회
            temp+= map.get(key);       //key에 해당되는 value 조회

            //System.out.println(map.get(key));
            count++;     //판매할 귤의 종류++

            if(k <= temp){   //귤 k개를 다 골랐다면
                break;
            }
        }

        return count;
    }
}
