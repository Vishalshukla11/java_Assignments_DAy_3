// Check Number is Positive or Negative
import java.util.Scanner;
class  A
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println(num + " =>given number is negative ");
        }
         if(num>0)
         {
            System.out.println(num + " = given number is positive");
         }
    }
}