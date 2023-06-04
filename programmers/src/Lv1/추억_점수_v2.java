package Lv1;

import java.util.HashMap;
import java.util.Map;

public class 추억_점수_v2 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<name.length; i++) {
            String key = name[i];
            Integer value = yearning[i];
            map.put(key, value);
        }

        int[] result = new int[photo.length];


        //photo[]의 길이만큼 반복하면서 각 photo의 추억점수를 result[] 배열에 저장
        for(int row=0; row<photo.length; row++){
            for(int col=0; col<photo[row].length; col++){
                String str = photo[row][col];

                if(map.containsKey(str)){        //key가 존재하면
                    result[row] += map.get(str);     //value 저장
                }
            }
        }

        return result;
    }
}
