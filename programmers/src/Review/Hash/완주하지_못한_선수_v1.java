package Review.Hash;

import java.util.HashMap;

public class 완주하지_못한_선수_v1 {
    public String solution(String[] participant, String[] completion) {
        String result = "";   //완주하지 못한 선수의 이름
        HashMap<String, Integer> map = new HashMap<>();  //마라톤 참가 선수이면 +1, 완주 선수이면 -1 값을 저장

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);  //map에 (마라톤 참가자) default로 1을 저장하고, 동명이인이 있을경우 +1한 값을 저장
        }
        for (String player : completion) {
            map.put(player, map.get(player) - 1);            //map에 (마라톤 완주자) 선수가 있다면 카운트--한 값을 저장
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0){   //마라톤 완주자가 아니면
                result = key;         //마라톤 완주 실패자 저장
                break;
            }
            //System.out.println(key + "는 " + map.get(key));
        }

        return result;
    }
}
