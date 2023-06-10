package Lv1;

import java.util.HashSet;

public class 폰켓몬_v2 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxCount = nums.length / 2;

        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), maxCount);
    }
}
