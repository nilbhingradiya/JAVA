package javacourse;

//  3.Multiply Two Floating-Point Numbers

import java.util.Scanner;

public class multiply 
{
    public static void main(String[] args)
    {
        float n1,n2;
        Scanner x;
        x=new Scanner(System.in);
        System.out.println("Enter n=");
        n1=x.nextInt();
        n2=x.nextInt();
        float pro = n1*n2;
        System.out.println("mul="+pro);
    }
}
