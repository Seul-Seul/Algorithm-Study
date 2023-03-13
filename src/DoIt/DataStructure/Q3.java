package DoIt.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
     /*구간 합 구하기(백준11659) , 시간제한 0.5초*/
     public void Q3() throws IOException {
          BufferedReader bufferedReader =
               new BufferedReader(new InputStreamReader(System.in));

          //1.숫자 개수 , 질의 개수 저장
          System.out.println("데이터의 개수와 질의 개수 입력");
          StringTokenizer stringTokenizer =
                  new StringTokenizer(bufferedReader.readLine());
          int suNo = Integer.parseInt(stringTokenizer.nextToken());
          int quizNo  = Integer.parseInt(stringTokenizer.nextToken());

          //2.합 배열S 구하기
          System.out.println("suNo개수의 배열 입력");
          long[]S = new long[suNo + 1]; //0번째 인덱스 무시 위해 크기 하나크게 선언
          stringTokenizer =
                  new StringTokenizer(bufferedReader.readLine());
          for(int i = 1 ; i <= suNo ; i++)
          {
               S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
          }

          //3. 구간 합 출력하기
          for(int q = 0 ; q < quizNo ; q++)
          {
               //질의 범위 받기
               System.out.println("질의 범위 숫자 두개 입력: ");
               stringTokenizer =
                       new StringTokenizer(bufferedReader.readLine());
               int i = Integer.parseInt(stringTokenizer.nextToken());
               int j = Integer.parseInt(stringTokenizer.nextToken());
               System.out.println("답: "+ (S[j] - S[i-1]));
          }
     }
}
