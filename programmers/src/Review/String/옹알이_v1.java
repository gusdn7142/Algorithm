package Review.String;

public class 옹알이_v1 {
    public int solution(String[] babblings) {

        int result = 0;   //머쓱이의 조카가 발음할 수 있는 단어의 개수

        //1. babblings[] 배열의 단어들을 하나씩 조회하면서 머쓱이가 발음할 수 있는 단어이면 result 값 증가
        for(int i = 0; i < babblings.length; i++) {

            //babblings[i]에 (머쓱이가 발음 가능한 발음 중) 연속된 발음이 존재하면 pass
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }

            babblings[i] = babblings[i].replace("aya", " ");   //머쓱이가 발음 가능한 발음을 " "로 변경
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");   //"yayae" 같이 "aya"가 없어지면서 "ye"도 없어지는 case를 위해 필요

            if(babblings[i].equals(""))
                result++;

        }
        return result;
    }
}
