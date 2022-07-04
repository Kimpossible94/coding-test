package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step5 {
   public static void main(String[] args) throws IOException {
      정수_N개의_합_15596();
      셀프_넘버_4673();
      한수_1065();
   }

   private static void 한수_1065() throws IOException {
      //어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
      // 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
      // 123은 한수, 157도 한수 이런식으로 각 자리수가 등차수열을 이루면 한수임
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println(d2(Integer.parseInt(br.readLine())));
   }

   private static int d2(int i) {
      if(i < 100){
         return i;
      }
      int res = 99;

      while (i >= 100){
         if((i/100-(i/10)%10) == ((i/10)%10-i%10)){
            res++;
         }
         i--;
      }

      return res;
   }

   private static void 셀프_넘버_4673() {
      //셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
      //양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.
      //예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.
      //33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
      //n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
      //생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
      //10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
      boolean[] check = new boolean[10001];

      for (int i = 0; i < check.length; i++) {
         int num = d(i);

         if(num < 10001) check[num] = true;
      }

      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < check.length; i++) {
         if(!check[i]){
            sb.append(i).append("\n");
         }
      }

      System.out.println(sb);
   }

   private static int d(int i) {
      int sum = i;

      while (i != 0){
         sum += i%10;
         i = i/10;
      }
      return sum;
   }

   private static void 정수_N개의_합_15596() {
      sum(new int[]{1, 2, 3});
   }

   private static long sum(int[] a) {
      long result = 0;
      for (int i = 0; i < a.length; i++) {
         result += a[i];
      }
      return result;
   }
}
