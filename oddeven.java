package javacourse;

import java.util.Scanner;

class oddeven 
{
    public static void main(String[] args)
    {
        int a,i;
        Scanner x;
        x = new Scanner(System.in);
        System.out.println("Enter a=");
        a=x.nextInt();
        if(a%2==0)
        {
            System.out.println("even number ");
        }
        else
        {
            System.out.println("odd number ");
        }
    }
}
