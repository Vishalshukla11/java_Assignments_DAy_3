//Fibonacci Series
import java.util.Scanner;
class C 
{
    public static void main(String args[])
    {
        int num1=0, num2=1, num3;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range of series ");
        int num=sc.nextInt();
        System.out.print(num1 + " " + num2);

        for(int i=2;i<=num;i++)
        {
           num3=num1+num2;
            System.out.print(" "+ num3);
            num1=num2;
            num2=num3;

        }
    }
}