package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step8 {
   public static void main(String[] args) throws IOException {
//      소수_찾기_1978();
//      소수_2581();
//      소인수분해_11653();
//      소수_구하기_1929();
//      베르트랑_공준_4948();
      골드바흐의_추측_9020();
   }

   private static void 골드바흐의_추측_9020() throws IOException {
      // 1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다.
      // 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
      // 골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
      // 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
      // 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다.
      // 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
      // 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오.
      // 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      boolean[] primeFlg = new boolean[10001];
      int T = Integer.parseInt(br.readLine());
      에라토르테네스의체(primeFlg);

      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < T; i++) {
         int N = Integer.parseInt(br.readLine());
         int M = N/2;
         int B = N/2;

         while (true){
            if(!primeFlg[M] && !primeFlg[B]){
               sb.append(M).append(" ").append(B).append("\n");
               break;
            } else {
               M--;
               B++;
            }
         }
      }

      System.out.println(sb);
   }

   private static void 베르트랑_공준_4948() throws IOException {
      // 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
      // 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
      // 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
      // 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // n의 범위가 1 <= n <= 123456이므로 123456의 2배인 246913이 최대범위
      boolean[] primeFlg = new boolean[246913];
      에라토르테네스의체(primeFlg);

      while (true) {
         int N = Integer.parseInt(br.readLine());
         if(N == 0) break;

         int primeCnt = 0;

         // N보다 크고 2N보다 작거나 같은 숫자의 범위이므로 N+1이 시작점
         for (int i = N+1; i <= N * 2; i++) {
            if(!primeFlg[i]) primeCnt++;
         }
         System.out.println(primeCnt);
      }
   }

   private static void 소수_구하기_1929() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());

      boolean[] primeFlg = new boolean[N+1];
      에라토르테네스의체(primeFlg);

      StringBuilder sb = new StringBuilder();
      for (int i = M; i <= N; i++) {
         if(!primeFlg[i]) sb.append(i).append("\n");
      }
      System.out.println(sb);
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

      for (int i = 2; i <= Math.sqrt(primeFlg.length); i++) {
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
