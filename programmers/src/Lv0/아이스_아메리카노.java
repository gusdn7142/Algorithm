package Lv0;

public class 아이스_아메리카노 {
    public int[] solution(int money) {
        int[] result = new int[2];

        result[0] = money / 5500;  //살 수 있는 아메키라노 수 계산
        result[1] = money % 5500;  //잔 돈 계산

        return result;
        //return new int[money / 5500, money % 5500]
    }
}
