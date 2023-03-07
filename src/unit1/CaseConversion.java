package unit1;

public class CaseConversion {
    public String solution(String str){
        String answer ="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x))    answer+= Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public String solution2(String str){
        //ASCII코드 사용
        //대문자 : 65~90 소문자 : 97~122
        String answer = "";
        for(char x : str.toCharArray()){
            if(x >= 65 && x <= 92) answer += (char)(x+32);  //형 변환 안하면 숫자로 나옴
            else    answer += (char)(x-32);
        }
        return answer;
    }
}
