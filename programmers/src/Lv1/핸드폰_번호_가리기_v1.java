package Lv1;

public class 핸드폰_번호_가리기_v1 {
    public String solution(String phone_number) {

        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();

        for(int i=0; i<length; i++){
            if(i < length-4){
                sb.append("*");
            } else{
                sb.append(phone_number.charAt(i));
            }
        }

        return sb.toString();
    }
}
