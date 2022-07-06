package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step6 {
   public static void main(String[] args) throws IOException {
      아스키_코드__11654();
      숫자의_합_11720();
      알바벳_찾기_10809();
      단어_공부_1157();
      단어의_개수_1152();
      상수_2908();
      다이얼_5622();
      크로아티아_알파벳_2941();
      그룹_단어_체커_1316();
   }

   private static void 그룹_단어_체커_1316() throws IOException {
      // 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
      // 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
      // aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
      // 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int res = 0;

      int N = Integer.parseInt(br.readLine());

      for (int i = 0; i < N; i++) {
         boolean[] boolArr = new boolean[26];
         int prev = 0;
         boolean flg = true;
         for (byte b : br.readLine().getBytes()) {
            if(prev == b){
               continue;
            } else {
               if(boolArr[b-97]){
                  flg = false;
                  break;
               } else {
                  boolArr[b-97] = true;
                  prev = b;
               }
            }
         }

         if(flg) res++;

      }
      System.out.println(res);
   }

   private static void 크로아티아_알파벳_2941() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split("");
      int res = 0;

      for (int i = 0; i < str.length; i++) {
         if(i > 0){
            if(str[i].equals("=")){
               switch (str[i-1]){
                  case "c" :
                  case "z" :
                  case "s" :
                     res--;
                     break;
               }

               if(i > 1 && str[i-1].equals("z") && str[i-2].equals("d")) res--;
            }


            if(str[i].equals("-")){
               switch (str[i-1]){
                  case "c" :
                  case "d" :
                     res--;
                     break;
               }
            }


            if(str[i].equals("j")){
               switch (str[i-1]){
                  case "l" :
                  case "n" :
                     res--;
                     break;
               }
            }
         }

         res++;
      }

      System.out.println(res);
   }

   private static void 다이얼_5622() throws IOException {
      // 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
      // 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
      // 숫자 1을 걸려면 총 2초가 필요하다.
      // 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
      // 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
      // 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
      // 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      int result = 0;

      for (byte b : str.getBytes()) {
         if(b <= 67) result += 3;
         else if(b <= 70) result += 4;
         else if(b <= 73) result += 5;
         else if(b <= 76) result += 6;
         else if(b <= 79) result += 7;
         else if(b <= 83) result += 8;
         else if(b <= 86) result += 9;
         else result += 10;
      }
      System.out.println(result);
   }

   private static void 상수_2908() throws IOException {
      // 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
      // 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
      // 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
      // 상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
      // 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
      // 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
      // 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int A = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
      int B = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());

      System.out.println(Math.max(A, B));
   }

   private static void 단어의_개수_1152() throws IOException {
      //영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
      // 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
      // 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      StringTokenizer st = new StringTokenizer(str," ");

      System.out.println(st.countTokens());
   }

   private static void 단어_공부_1157() throws IOException {
      //알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
      // 단, 대문자와 소문자를 구분하지 않는다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[] intArr = new int[26];
      String s = br.readLine();


      for (int i = 0; i < s.length(); i++) {
         // A-Z는 아스키코드로 65-90
         if(65 <= s.charAt(i) && s.charAt(i) <= 90){
            intArr[s.charAt(i) - 65]++;
         }
         // a-z는 아스키코드로 97-122
         else {
            intArr[s.charAt(i) - 97]++;
         }
      }

      int max = -1;
      char c = '?';
      for (int i = 0; i < intArr.length; i++) {
         if(max == intArr[i]) {
            c = '?';
         }
         if(max < intArr[i]) {
            max = intArr[i];
            c = (char) (i + 65);
         }
      }
      System.out.println(c);
   }

   private static void 알바벳_찾기_10809() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[] intArr = new int[26];
      for (int i : intArr) i = -1;

      String str = br.readLine();

      for (int i = 0; i < str.length(); i++) {
         char c = str.charAt(i);
         if(intArr[c - 'a'] == -1){
            intArr[c - 'a'] = i;
         }
      }


   }

   private static void 숫자의_합_11720() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      br.readLine();
      String[] arr = br.readLine().split("");
      int res = 0;
      for (int i = 0; i < arr.length; i++) {
         res += Integer.parseInt(arr[i]);
      }
   }

   private static void 아스키_코드__11654() throws IOException {
      int i = System.in.read();
      System.out.println(i);
   }
}
