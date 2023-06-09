package Lv1;

public class 푸드_파이트_대회_v2 {
    public String solution(int[] food) {
        StringBuilder result = new StringBuilder("0");

        //1. 대회를 위해 배치해야할 음식을 문자열로 표현
        for(int i=food.length-1; i>0; i--){
            int num = food[i];

            //result의 앞과 뒤에 num 값 만큼 i를 더해줌
            for(int j=0; j<num/2; j++){
                result.insert(0, i);
                result.append(i);
            }
        }

        return result.toString();
    }
}
