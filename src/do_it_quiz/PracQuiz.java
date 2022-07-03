package do_it_quiz;

public class PracQuiz {
   public static void main(String[] args) {
      max4(4,1,2,5);
      min4(4,2,1,6);
      med3(4,5,2);
   }

   private static void med3(int a, int b, int c) {
      if(a>=b){
         if(b >= c) System.out.println(b);
         else if (c >= a) System.out.println(a);
         else System.out.println(c);
      } else if (a > c) System.out.println(a);
      else if(c > b) System.out.println(b);
      else System.out.println(c);
   }

   private static void min4(int a, int b, int c, int d) {
      int[] intArr = {a,b,c,d};
      int min = a;
      for (int i = 1; i < intArr.length; i++) {
         if(intArr[i] < min) min = intArr[i];
      }
      System.out.println(min);
   }

   private static void max4(int a, int b, int c, int d) {
      int[] intArr = {a,b,c,d};
      int max = a;
      for (int i = 1; i < intArr.length; i++) {
         if(intArr[i] > max) max = intArr[i];
      }
      System.out.println(max);
   }
}
