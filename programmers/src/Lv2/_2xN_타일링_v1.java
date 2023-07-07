package Lv2;

import java.util.ArrayList;

public class _2xN_타일링_v1 {
    public int solution(int n) {
        ArrayList<Integer> dp = new ArrayList<Integer>();

        dp.add(1);
        dp.add(2);

        for(int i=2; i<n; i++) {
            dp.add((dp.get(i-1) + dp.get(i-2)) % 1000000007);
        }

        return dp.get(n-1);
    }
}
