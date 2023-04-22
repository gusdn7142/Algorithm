package Lv0;

public class 머쓱이보다_키_큰_사람_v1 {
    public int solution(int[] array, int height) {
        int count = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] > height) count++;
        }

        return count;
    }
}
