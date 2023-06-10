package Lv1;

import java.util.HashSet;

public class 폰켓몬_v1 {
    public int solution(int[] nums) {
        int result = 0;
        int pickCount = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        if(pickCount < set.size()) { //nums[]에 담긴 포켓몬의 종류가 pickCount보다 크면
            result = pickCount;
        } else {  //nums[]에 담긴 포켓몬의 종류가 pickCount보다 작거나 같으면
            result = set.size();
        }

        return result;
    }
}
