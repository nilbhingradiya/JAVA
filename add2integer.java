package javacourse;

import java.util.Scanner;

//   2.Add Two Integers
public class addinteger
{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner x;
        x=new Scanner(System.in);
        System.out.println("Enter n= ");
        n1=x.nextInt();
        n2=x.nextInt();
        int sum= n1+n2;
        System.out.println("sum="+sum);
    }
}
