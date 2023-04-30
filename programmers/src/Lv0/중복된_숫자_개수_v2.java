package Lv0;

public class 중복된_숫자_개수_v2 {
    public int solution(int[] array, int n) {
        int count = 0;

        for(int i=0; i<array.length; i++){
            if(array[i]==n) count++;
        }

        return count;
    }
}
