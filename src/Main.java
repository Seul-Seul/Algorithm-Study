import unit1.CaseConversion;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        System.out.print("입력 : ");
        int N = kb.nextInt();
        long sum = 0;
        long max = 0;

        for(int i = 0 ; i < N ; i++){
            int temp = kb.nextInt();
            if(temp > max)  max = temp;
            sum += temp;
        }
        System.out.println("결과: " + sum / max * 100.0 / N);
    }
}