package cote;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step3 {
   public static void main(String[] args) throws IOException {
      구구단_2739();
      _10950();
      합_8393();
      빠른_15552();
      N_찍기_2741();
      기찍_N_2742();
      _11021();
      _11022();
      별_찍기_1_2438();
      별_찍기_2_2439();
      X보다_작은_수_10871();
      _10952();
      _10951();
      더하기_사이클_1110();
   }

   private static void 더하기_사이클_1110() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      int copyN = N;
      int count = 0;
      do{
         N = ((N%10)*10) + ((N/10 + N%10) % 10);
         count++;
      } while (copyN != N);

      System.out.println(count);
   }

   private static void _10951() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String input;

      while((input = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(input);

         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());

         int result = A + B;

         bw.write(result + "\n");

      }
      bw.flush();
      bw.close();
      br.close();
   }

   private static void _10952() {
      Scanner sc = new Scanner(System.in);

      while (true){
         int A = sc.nextInt();
         int B = sc.nextInt();
         if((A+B) == 0){
            break;
         }
         System.out.println(A+B);
      }
   }

   private static void X보다_작은_수_10871() {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int X = sc.nextInt();

      StringBuffer sb = new StringBuffer();

      for (int i = 0; i < N; i++) {
         int num = sc.nextInt();
         if(X > num){
            sb.append(num+" ");
         }
      }

      System.out.println(sb);
   }

   private static void 별_찍기_2_2439() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int N = Integer.parseInt(br.readLine());

      for (int i = 1; i <= N; i++) {
         for (int j = 1; j <= N-i; j++) {
            bw.write(" ");
         }
         for (int j = 1; j <= i; j++) {
            bw.write("*");
         }
         bw.write("\n");
      }

      br.close();
      bw.flush();
      bw.close();
   }

   private static void 별_찍기_1_2438() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int N = Integer.parseInt(br.readLine());

      for (int i = 0; i < N; i++) {
         for (int j = 0; j < i+1; j++) {
            bw.write("*");
         }
         bw.write("\n");
      }

      br.close();
      bw.flush();
      bw.close();
   }

   private static void _11022() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int N = Integer.parseInt(br.readLine());

      for (int i = 0; i < N; i++) {
         String[] str = br.readLine().split(" ");
         bw.write("Case #"+(i+1)+": "+str[0]+" + "+str[1] + " = " + (Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + "\n");
      }

      br.close();
      bw.flush();
      bw.close();
   }

   private static void _11021() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int N = Integer.parseInt(br.readLine());

      for (int i = 0; i < N; i++) {
         String[] str = br.readLine().split(" ");
         bw.write("Case #"+(i+1)+": " + (Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + "\n");
      }

      br.close();
      bw.flush();
      bw.close();
   }

   private static void 기찍_N_2742() {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      for (int i = N; i > 0; i--) {
         System.out.println(i);
      }
   }

   private static void N_찍기_2741() {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      for (int i = 0; i < N; i++) {
         System.out.println(i+1);
      }
   }

   private static void 빠른_15552() throws IOException {
      StringTokenizer st;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out) );

      int N = Integer.parseInt( br.readLine() );

      for(int i = 1; i <= N; i++) {
         st = new StringTokenizer(br.readLine()," ");
         bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n"));
      }
      br.close();
      bw.flush();
      bw.close();
   }

   private static void 합_8393() {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int result = 0;
      for (int i = 0; i < num; i++) {
         result += i+1;
      }
      System.out.println(result);
   }

   private static void _10950() {
      Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();

      for (int i = 0; i < count; i++) {
         int firstNum = sc.nextInt();
         int secondNum = sc.nextInt();
         System.out.println(firstNum+secondNum);
      }

   }

   private static void 구구단_2739() {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      if(N > 1 && N <= 9){
         for (int i = 0; i < 9; i++) {
            System.out.println(N + " * " + (i+1) + " = " + (N * (i+1)));
         }
      }
   }
}
