//Leap Year
import java.util.Scanner;
class B 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println(year + " =>is leap year");
        }
        // if(year%400==0)
        // {
        //     System.out.println(year + " => is leap century year");
        // }
        if(year%4!=0)
        {
            System.out.println(year + " => is not leap year");
        }
    }

}
