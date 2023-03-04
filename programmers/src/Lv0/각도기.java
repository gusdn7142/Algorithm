package Lv0;

public class 각도기 {
    public int solution(int angle) {
        int result = 0;
        boolean bool = (0<angle && angle<=180) ? true : false;

        if(!bool){
            return -1;
        }

        if(0<angle && angle<90){
            result = 1;
        } else if(angle==90){
            result = 2;
        } else if(90<angle && angle<180) {
            result = 3;
        } else {
            result = 4;
        }

        return result;
    }
}
