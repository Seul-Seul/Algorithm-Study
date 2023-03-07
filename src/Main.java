import java.util.*;
public class Main {
    public static void main(String[] args) {
        FindChar T = new FindChar();
        CaseConversion C = new CaseConversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str,c));
        System.out.println(C.solution());
    }
}