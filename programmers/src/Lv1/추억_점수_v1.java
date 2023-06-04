package Lv1;

public class 추억_점수_v1 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] result = new int[photo.length];

        //photo[]의 길이만큼 반복하면서 각 photo의 추억점수를 result[] 배열에 저장
        for(int row=0; row<photo.length; row++){
            for(int col=0; col<photo[row].length; col++){
                String str = photo[row][col];

                for(int i=0; i<name.length; i++){
                    if(str.equals(name[i])) {
                        result[row] += yearning[i];
                        break;
                    }
                }
            }
        }

        return result;
    }
}
