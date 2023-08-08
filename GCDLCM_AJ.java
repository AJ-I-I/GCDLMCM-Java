import java.util.Scanner;
public class GCDLCM_AJ
   {//class
   public static void main (String [] args)
      {//main
      
       Scanner Keyboard = new Scanner(System.in);
       
       int run_Again = 1;
       
       do//do loop
       {
        int a, b;
        
        System.out.print("Enter two positive integers: ");
        a = Keyboard.nextInt();
        b = Keyboard.nextInt();
        
        int G = GCD( a, b);
        int L = LCM( a, b);
        
           System.out.println("The greatest common divisor of "+a+" and "+b+" is "+G);
           
           System.out.println("The least common multiple of "+a+" and "+b+" is "+LCM(a,b));
           
           System.out.println("Run again? enter 1 for yes. enter anyother digit for no.");
           run_Again = Keyboard.nextInt();
        
        }while(run_Again == 1);
     
       }//end main 
   static int GCD(int a, int b)
      {//GDC Method
      
       if (a<b)
       {
         int num1=a;
         a = b;
         b = num1;
       }//end first if
       
       if (b == 0)
       {
       return a;
       }
       return GCD(b, a % b);
      }
      
   static int LCM(int a, int b)
       {
       int G = GCD(a, b);
       return (a*b)/G;
       }
       
}//end class