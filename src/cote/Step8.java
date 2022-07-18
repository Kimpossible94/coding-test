package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step8 {
   public static void main(String[] args) throws IOException {
//      소수_찾기_1978();
//      소수_2581();
      소인수분해_11653();
   }

   private static void 소인수분해_11653() throws IOException {
      //정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int N = Integer.parseInt(br.readLine());

      for (int i = 2; i <= Math.sqrt(N); i++) {
         while (N % i == 0) {
            sb.append(i).append('\n');
            N /= i;
         }
      }

      if(N != 1){
         sb.append(N);
      }
      System.out.println(sb);
   }


   private static void 소수_2581() throws IOException {
      //자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
      //예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
      // 이들 소수의 합은 620이고, 최솟값은 61이 된다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int M = Integer.parseInt(br.readLine());
      int N = Integer.parseInt(br.readLine());
      boolean[] primeFlg = new boolean[N+1];
      에라토르테네스의체(primeFlg);

      int sum = 0;
      int min = Integer.MAX_VALUE;
      for (int i = M; i <= N; i++) {
         if(!primeFlg[i]){
            sum += i;
            if(min == Integer.MAX_VALUE) {
               min = i;
            }
         }
      }

      if(sum == 0) System.out.println(-1);
      else {
         System.out.println(sum);
         System.out.println(min);
      }
   }

   private static void 에라토르테네스의체(boolean[] primeFlg){
      // 0과 1은 소수가 아니므로 true
      primeFlg[0] = true;
      primeFlg[1] = true;

      for (int i = 2; i <  Math.sqrt(primeFlg.length); i++) {
         // 이미 걸러진 숫자라면 Pass
         if(primeFlg[i]) continue;

         for (int j = i * i; j < primeFlg.length; j += i) {
            primeFlg[j] = true;
         }
      }
   }
   private static void 소수_찾기_1978() throws IOException {
      //주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int result = 0;
      for (int i = 0; i < N; i++) {
         int num = Integer.parseInt(st.nextToken());
         if(checkPrime(num)) result++;
      }

      System.out.println(result);
   }

   private static boolean checkPrime(int num) {
      // 1은 소수가 아니므로 false
      if(num == 1) return false;

//      // 2부터 num - 1 까지 나누어서 떨어지는 약수가 있는지 확인
//      for (int j = 2; j < num - 1; j++) {
//         if(num % j == 0) return false;
//      }

      for (int j = 2; j < Math.sqrt(num); j++) {
         if(num % j == 0) return false;
      }
//
//      boolean[] primeFlg = new boolean[num+1];
//
//      // 0과 1은 소수가 아니므로 true
//      primeFlg[0] = true;
//      primeFlg[1] = true;
//
//      for (int i = 2; i <  Math.sqrt(num); i++) {
//         // 이미 걸러진 숫자라면 Pass
//         if(primeFlg[i]) continue;
//
//         for (int j = i * i; j < num+1; j = j * i) {
//            primeFlg[j] = true;
//         }
//      }
//
//      return primeFlg;

      return true;
   }
}
