package DoIt.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q7 {
    public Q7() {
        System.out.println("Q7 : 투포인터");
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("재료의 개수와 갑옷이 되는 번호 입력: ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(N+"개의 배열 입력: ");
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int count = 0;
        int i = 0;     //A[0] -> Min
        int j = N - 1; //A[N-1] -> Max
        while(i<j){
            if(A[i] + A[j] == M){
                i++; j--;
                count ++;
            }
            else if(A[i] + A[j] > M)    j--;
            else i++; //A[i] + A[j] < M
        }

        System.out.println("답: " + count);
    }
}
