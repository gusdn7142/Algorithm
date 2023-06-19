package Lv1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수_v1 {
    public String solution(String[] participant, String[] completion) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();    // <참가자 이름, (동명이인일 경우를 위한) 참가자 수>

        //1. 마라톤 완주자를 Map에 저장
        for(int i=0; i<completion.length; i++){
            if(map.containsKey(completion[i])){      //중복 참가자이면
                map.put(completion[i], map.get(completion[i])+1);
            } else {                                 //중복 참가자가 아니면
                map.put(completion[i], 1);
            }
        }

        //2. 마라톤 참여자 중에 완주하지 않은 사람을 필터링
        for(String str : participant){

            if(map.containsKey(str) && map.get(str) > 0) {       //마라톤 참여자가 완주자 명단에 있으면
                map.put(str, map.get(str)-1);                    //완주자를 map에서 제거 (동명이인이 있기 떄문에 put 메서드 사용)
            }
            else {                                               //마라톤 참여자가 완주자 명단에 없으면
                result = str;  //마라톤 완주 실패자 저장
                break;
            }

        }

        return result;
    }
}
