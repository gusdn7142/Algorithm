package Lv0;

public class 배열_두배_만들기_v1 {
    public int[] solution(int[] numbers) {
        int[] newNumbers = new int[numbers.length];

        boolean bool1 = true;
        boolean bool2 = true;

        //numbers[]의 각 원소가 -10000이상 10,000이하인지 체크
        for(int number : numbers){
            if(number<-10000 && 10000<number){
                bool1 = false;
            }
        }

        //numbers[]의 길이가 1이상 1000이하인지 체크
        if(numbers.length<1 && 1000<numbers.length){
            bool2 = false;
        }

        //numbers[] 배열의 2배한 값을 newNumbers[] 배열에 대입
        for(int i=0; i<numbers.length; i++){
            newNumbers[i] = numbers[i] * 2;
        }

        return newNumbers;
    }
}
