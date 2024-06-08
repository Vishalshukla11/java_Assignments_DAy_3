//Harmonic Number
import java.util.Scanner;
class E 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        double result=0.0;
        for(int i=num;i>0;i--)
        {
            result=result+(double)1/i;
            System.out.println(result + " ");

        }


    }
}