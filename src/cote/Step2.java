package cote;

import java.util.Scanner;

public class Step2 {
   public static void main(String[] args) {
//      두_수_비교하기_1330();
//      시험_성적_9498();
//      윤년_2753();
//      사분면_고르기_14681();
//      알람_시계_2884();
//      오븐_시계_2525();
//      주사위_세개_2480();
   }

   private static void 주사위_세개_2480() {
      Scanner sc = new Scanner(System.in);
      int[] randomNumbers = new int[3];
      for (int i = 0; i < randomNumbers.length; i++) {
         randomNumbers[i] = sc.nextInt();
      }

      boolean firstFlag = randomNumbers[0] == randomNumbers[1];
      boolean secondFlag = randomNumbers[1] == randomNumbers[2];
      boolean thirdFlag = randomNumbers[0] == randomNumbers[2];

      if(firstFlag && secondFlag){
         System.out.println(10000 + randomNumbers[0] * 1000);
      } else if(firstFlag || secondFlag || thirdFlag){
         if(firstFlag || secondFlag){
            System.out.println(1000 + randomNumbers[1] * 100);
         } else {
            System.out.println(1000 + randomNumbers[0] * 100);
         }
      } else {
         System.out.println(Math.max(randomNumbers[0], Math.max(randomNumbers[1],randomNumbers[2])) * 100);
      }
   }

   private static void 오븐_시계_2525() {
      Scanner sc = new Scanner(System.in);
      int H = sc.nextInt();
      int M = sc.nextInt();
      int T = sc.nextInt();
      int C = M+T;

      if(C / 60 < 1){
         M = C;
      } else {
         H = H + (C / 60);
         if(H >= 24){
            H = 0 + H%24;
         }
         M = C % 60;
      }
      System.out.println(H + " " + M);
   }

   private static void 알람_시계_2884() {
      Scanner sc = new Scanner(System.in);
      int H = sc.nextInt();
      int M = sc.nextInt();
      int C;

      if((M - 45) < 0){
         if((H-1) < 0){
            H = 23;
         } else {
            H = H-1;
         }
         M = 60 + M - 45;
      } else {
         M = M - 45;
      }

      System.out.println(H + " " + M);
   }

   private static void 사분면_고르기_14681() {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();

      if(A > 0){
         if(B > 0){
            System.out.println(1);
         } else {
            System.out.println(4);
         }
      } else {
         if(B > 0){
            System.out.println(2);
         } else {
            System.out.println(3);
         }
      }
   }

   private static void 윤년_2753() {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();

      if((A%4 == 0 && A%100 != 0) || A%400 == 0){
         System.out.println(1);
      } else {
         System.out.println(0);
      }
   }

   private static void 시험_성적_9498() {
      Scanner sc = new Scanner(System.in);
      int score = sc.nextInt();

      if(score >= 90) System.out.println("A");
      else if (score >= 80) System.out.println("B");
      else if (score >= 70) System.out.println("C");
      else if (score >= 60) System.out.println("D");
      else System.out.println("F");
   }

   private static void 두_수_비교하기_1330() {
      Scanner sc = new Scanner(System.in);
      int A,B;
      A = sc.nextInt();
      B = sc.nextInt();

      if(A > B){
         System.out.println(">");
      } else if(A < B){
         System.out.println("<");
      } else {
         System.out.println("==");
      }
   }
}
