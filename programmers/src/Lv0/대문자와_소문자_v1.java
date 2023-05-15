package Lv0;

public class 대문자와_소문자_v1 {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();

        for(int i=0; i<my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                result.append(Character.toLowerCase(my_string.charAt(i)));
            }
            if(Character.isLowerCase(my_string.charAt(i))){
                result.append(Character.toUpperCase(my_string.charAt(i)));
            }
        }

        return result.toString();
    }
}
