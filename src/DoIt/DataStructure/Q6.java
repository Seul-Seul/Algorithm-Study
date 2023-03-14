package DoIt.DataStructure;

import java.util.Scanner;

public class Q6 {
    public Q6(){
        System.out.println("Q6 : 투포인터");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int N = sc.nextInt();

        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N){
            if(sum == N){
                count ++; end_index++;
                sum = sum + end_index;
            }
            else if(sum > N){
                sum = sum - start_index;
                start_index++;
            }
            else if(sum < N){
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println("답: " + count);
    }
}
