package Lv1;

public class 옹알이2_v1 {
    public int solution(String[] babbling) {

        String[] say = {"aya", "ye", "woo", "ma"};

        //1. babbling[] 배열에서 조카가 발음할 수 있는 단어 수 계산
        int count = 0;   //조카가 발음할 수 있는 단어의 개수
        for(String str : babbling){   //"yemawoo"
            boolean visited[] = new boolean[str.length()];

            //str에서 say[i] 값을 제거하면서 ""이 되면 count 증가
            for(int i=0; i<4; i++) {
                int index1 = str.indexOf(say[i]);    //발음 여부를 판별할 문자열에 조카의 발음이 포함된 인덱1스 조회

                while(index1!=-1 && !visited[index1]){    //인덱스1가 존재하고,  방문하지 않았다면
                    for(int j=index1; j<index1+say[i].length(); j++) {   //인덱스1+발음 길이만큼 방문
                        visited[j] = true;
                    }

                    int index2 = str.indexOf(say[i], index1+say[i].length());  //인덱스+발음 길이이후 부터 조카의 발음이 포함된 인덱스2 조회

                    if(index1+say[i].length() == index2) {  //인덱스1+발음 길이가 인덱스2와 같다면...  (즉, 조카가 가능한 발음이 연속되어 존재하면)
                        break;
                    } else {   //조카가 가능한 발음이 연속되어 존재하지 않으면..
                        index1 = index2;    //인덱스1 갱신
                    }
                }

            }

            //조카가 발음할 수 있는 단어 수 계산
            int tempCount = 0;
            for(int i=0; i<str.length(); i++) {
                if(visited[i]) {   //str에서 i가 방문처리가 되어 있다면
                    tempCount++;
                }
            }

            if(tempCount == str.length())  //str이 조카가 모두 발음할 수 잇는 문자열이라면
                count++;                   //조카가 발음할 수 있는 문자열(단어)의 개수 증가
        }

        return count;
    }
}
