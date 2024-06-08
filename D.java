//Factorial
import java.util.Scanner;
class D 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int mul=1;

        for(int i=1;i<=num;i++)
        {
            mul=mul*i;
            
        }
        System.out.println(mul);
    }
}