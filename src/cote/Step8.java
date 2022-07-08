package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step8 {
   public static void main(String[] args) throws IOException {
      소수_찾기_1978();
   }

   private static void 소수_찾기_1978() throws IOException {
      //주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int result = 0;
      for (int i = 0; i < N; i++) {
         int num = Integer.parseInt(st.nextToken());
         if(num == 2) {
            result++;
            continue;
         } else if(num == 1 || num % 2 == 0) {
            continue;
         } else {

         }
      }
   }
}
