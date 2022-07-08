package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step7 {
   public static void main(String[] args) throws IOException {
      손익분기점_1712();
      벌집_2292();
      분수찾기_1193();
      달팽이는_올라가고_싶다_2869();
      ACM_호텔_10250();
      부녀회장이_될테야_2775();
      설탕_배달_2839();
      큰_수_10757();
   }

   private static void 큰_수_10757() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String A = st.nextToken();
      String B = st.nextToken();
      StringBuilder sb = new StringBuilder();

      int maxLength = Math.max(A.length(), B.length());

      int[] intA = new int[maxLength+1];
      int[] intB = new int[maxLength+1];

      for (int i = A.length()-1, idx = 0; i >= 0; i--, idx++) {
         intA[idx] = A.charAt(i)-'0';
      }

      for (int i = B.length()-1, idx = 0; i >= 0; i--, idx++) {
         intB[idx] = B.charAt(i)-'0';
      }

      for (int i = 0; i < maxLength; i++) {
         int val = intA[i] + intB[i];
         intA[i] = val%10;
         intA[i+1] += val/10;
      }

      if(intA[maxLength] != 0){
         sb.append(intA[maxLength]);
      }

      for (int i = maxLength - 1; i >= 0; i--) {
         sb.append(intA[i]);
      }
      System.out.println(sb);
   }

   private static void 설탕_배달_2839() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int C = -1;

      if(N%5 == 0){
         C = N/5;
      } else {
         for (int i = 0; i <= N/5; i++) {
            if((N-5*i)%3 != 0){
               continue;
            } else {
               C = i + (N-5*i)/3;
            }
         }
      }
      System.out.println(C);
   }

   private static void 부녀회장이_될테야_2775() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[][] APT = new int[15][15];

      for (int i = 0; i < 15; i++) {
         APT[i][1] = 1;
         APT[0][i] = i;
      }

      for (int i = 1; i < 15; i++) {
         for (int j = 2; j < 15; j++) {
            APT[i][j] = APT[i-1][j] + APT[i][j-1];
         }
      }

      int T = Integer.parseInt(br.readLine());

      for (int i = 0; i < T; i++) {
         int k = Integer.parseInt(br.readLine());
         int n = Integer.parseInt(br.readLine());
         System.out.println(APT[k][n]);
      }
   }

   private static void ACM_호텔_10250() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int T = Integer.parseInt(br.readLine());

      for (int i = 0; i < T; i++) {
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int H = Integer.parseInt(st.nextToken());
         int W = Integer.parseInt(st.nextToken());
         int N = Integer.parseInt(st.nextToken());

         int Y;
         int X;

         if(N%H == 0) {
            Y = H;
            X = N/H;
         } else {
            Y = N%H;
            X = N/H + 1;
         }

         if(X < 10){
            sb.append(Y + "0" + X + "\n");
         } else {
            sb.append("" + Y + X + "\n");
         }
      }
      System.out.println(sb);
   }

   private static void 달팽이는_올라가고_싶다_2869() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
      int D = (V-B)/(A-B);

      if((V-B)%(A-B) != 0){
         D++;
      }

      System.out.println(D);
   }

   private static void 분수찾기_1193() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int crossCount = 1; //라인
      int prevCountSum = 0; //누적합계

      while (true){
         if(N <= prevCountSum + crossCount){
            if(crossCount % 2 == 0){
               System.out.println((N - prevCountSum) + "/" + (crossCount-(N - prevCountSum - 1)));
               break;
            } else {
               System.out.println((crossCount-(N - prevCountSum - 1)) + "/" + (N - prevCountSum));
               break;
            }
         } else {
            prevCountSum += crossCount;
            crossCount++;
         }
      }
   }

   private static void 벌집_2292() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());

      int range = 2;
      int count = 1;

      if(N==1){
         System.out.println(1);
      } else {
         while (range <= N){
            range = range + (count * 6);
            count++;
         }
         System.out.print(count);
      }
   }

   private static void 손익분기점_1712() throws IOException {
      // 월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며,
      // 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
      // 예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.
      // 노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다.
      // 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
      // A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      if(B >= C)System.out.println(-1);
      else System.out.println(A/(C-B) + 1);
   }
}
