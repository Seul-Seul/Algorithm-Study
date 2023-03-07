package unit1;

public class FindChar {
    public  int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }
        return answer;
    }

}
