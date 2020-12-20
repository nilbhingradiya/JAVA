package javacourse;

//  Check if a Number is Positive or Negative using if else

import java.util.Scanner;

public class pn 
{
    public static void main(String[] args) 
    {
        double number;
        Scanner x;
        x=new Scanner(System.in);
        System.out.println("Enter number=");
        number=x.nextInt();
        if(number<0.0)
        {
            System.out.println(number +"number is negative");
        }
        else if(number>0.0)
        {
            System.out.println(number+"number is positive");
        }
        else
        {
            System.out.println(number+"is 0");
        }
    }
}
