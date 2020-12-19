package javacourse;

import java.util.Scanner;
 // 5. Compute Quotient and Remainder
 class QuotientRemainder 
{
     public static void main(String[] args)
     {
        int dividend, divisor;
        Scanner x;
        x=new Scanner(System.in);
        System.out.println("Enter dividend=");
        dividend=x.nextInt();
        System.out.println("Enter divisor =");
       
        divisor=x.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
     }
}
