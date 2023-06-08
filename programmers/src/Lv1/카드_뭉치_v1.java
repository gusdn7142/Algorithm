package Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 카드_뭉치_v1 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "Yes";

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(cards2));

        //goal[] 배열의 요소가 card1[]와 card2[] 배열에 존재하는지 검사
        for(int i=0; i<goal.length; i++){

            if(list1.size()>0){
                if(list1.get(0).equals(goal[i])){
                    list1.remove(0);
                    continue;
                }
            }
            if(list2.size()>0){
                if(list2.get(0).equals(goal[i])){
                    list2.remove(0);
                    continue;
                }
            }

            result = "No";
            break;
        }

        return result;
    }
}
