import unit1.CaseConversion;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        CaseConversion T = new CaseConversion();
        Scanner kb = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = kb.next();
        System.out.println(T.solution2(str));
    }
}