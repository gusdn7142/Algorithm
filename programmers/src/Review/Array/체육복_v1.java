package Review.Array;

public class 체육복_v1 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n+1];   //체육복을 가지고 있는지를 판별하는 배열 (-1 : 체육복 도난 / 0 : 체육복 1벌 / 1 : 체육복 2벌)

        int result = n;   //체육복을 가진 학생 수

        for (int i : lost)
            people[i]--;  //도난당한 체육복 카운트 (ex, 2번:-1,  4번:-1)
        for (int i : reserve)
            people[i]++;  //여벌 체육복 카운트 (ex, 1번:+1, 3번:+1, 5번:+1)

        for (int i = 1; i < people.length; i++) {
            if(people[i] == -1) {   //i번째 학생이 체육복이 없다면
                if(i-1 >= 1 && people[i-1] == 1) {   //i-1번째 학생이 여벌 체육복이 있다면
                    people[i]++;       //여벌 체육복을 빌림
                    people[i-1]--;     //여벌 체육복 제거
                }else if(i+1 < people.length && people[i+1] == 1) {   //i+1번째 학생이 여벌 체육복이 있다면
                    people[i]++;       //여벌 체육복을 빌림
                    people[i+1]--;     //여벌 체육복 제거
                }else              //여벌 체육복을 빌릴 수 없으므로
                    result--;     //체육복을 가진 학생수--
            }
        }

        return result;
    }
}
