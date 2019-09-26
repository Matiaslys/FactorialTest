public class Factorial {
   public static int findFactorial(int x) {
       int result = 1;
       if (x > -1 && x < 16) {
           for (int i = 1; i <= x; i++) {
               result = result * i;

               System.out.println(result);
           }
       }
       else result = -1;
       {
           System.out.println(result);
       }
       return result;
   }
}
