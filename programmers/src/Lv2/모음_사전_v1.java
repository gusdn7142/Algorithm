package Lv2;

public class 모음_사전_v1 {
    char[] alpha = {'A', 'E', 'I', 'O', 'U'};
    int result = 0;          //사전에서 몇번째 단어인지 저장
    int count = 0;           //사전에 등장하는 단어 카운트

    void getResult(int index, String curStr, String target){
        if(curStr.equals(target))
            result = count;   //사전에서 몇번째 단어인지 저장

        if(index >= 5) {    //기저조건
            return;
        }else{
            for(int i=0; i<5; i++){
                count++;           //사전에 등장하는 단어 카운트
                getResult(index+1, curStr + alpha[i], target);
            }
        }
    }

    public int solution(String word) {
        getResult(0, "", word);  //index, str, word
        return result;
    }

}
