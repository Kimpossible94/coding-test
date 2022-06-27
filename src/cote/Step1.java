package cote;

import java.util.Scanner;

public class Step1 {
   public static void main(String[] args) {
//      Hello_World_2775();
//      고양이_10171();
//      개_10172();
//      사칙연산_10869();
//      Jonas_10926();
//      _1998년생_태국_18108();
//      나머지_10430();
//      곱셈_2588();
      새싹_25083();
   }

   private static void Hello_World_2775() {
      System.out.print("Hello World!");
   }

   private static void 고양이_10171() {
      System.out.print("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|");
   }

   private static void 개_10172() {
      System.out.print("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");
   }

   private static void 사칙연산_10869() {
      Scanner sc = new Scanner(System.in);
      int A,B;
      A = sc.nextInt();
      B = sc.nextInt();
      System.out.println(A+B);
      System.out.println(A-B);
      System.out.println(A*B);
      System.out.println(A/B);
      System.out.println(A%B);
   }

   private static void Jonas_10926() {
      Scanner sc = new Scanner(System.in);
      String inputId = sc.nextLine();

      System.out.println(inputId + "??!");
   }

   private static void _1998년생_태국_18108() {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      System.out.println(a - (2541-1998));
   }

   private static void 나머지_10430() {
      int A,B,C;
      Scanner sc = new Scanner(System.in);
      A = sc.nextInt();
      B = sc.nextInt();
      C = sc.nextInt();

      System.out.println((A+B)%C);
      System.out.println(((A%C) + (B%C))%C);
      System.out.println((A*B)%C);
      System.out.println(((A%C) * (B%C))%C);
   }

   private static void 곱셈_2588() {
      int A,B;
      Scanner sc = new Scanner(System.in);
      A = sc.nextInt();
      B = sc.nextInt();

      int[] C = {B/100, B/10%10, B%10};

      System.out.println(C[2] * A);
      System.out.println(C[1] * A);
      System.out.println(C[0] * A);
      System.out.println(B * A);
   }

   private static void 새싹_25083() {
      System.out.println("         ,r'\"7\n" +
              "r`-_   ,'  ,/\n" +
              " \\. \". L_r'\n" +
              "   `~\\/\n" +
              "      |\n" +
              "      |");
   }

}
