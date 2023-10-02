package Review.Loop;


public class 카드_뭉치_v1 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "Yes";
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        //goal[] 배열의 요소가 card1[]와 card2[] 배열에 존재하는지 검사
        for(int i=0; i<goal.length; i++){

            if(cardIdx1 < cards1.length && goal[i].equals(cards1[cardIdx1]) ){   //순서 중요
                cardIdx1++;
            } else if(cardIdx2 < cards2.length && goal[i].equals(cards2[cardIdx2])) {  //순서 중요
                cardIdx2++;
            } else {
                result = "No";
                break;
            }

        }
        return result;
    }
}
