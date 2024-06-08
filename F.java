//Find Second Largest Number in Array
import java.util.Scanner;
class F 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size =sc.nextInt();
        int [] arr= new int [size];
       int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                       
                }
            }
        }

        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i] + "  ");
         }

         
            if(arr.length<2)
            {
                System.out.println("array doesn't have enough elements");
            }
            else
            {
                System.out.println("second largest element is => " + arr[arr.length-2]);
            }
         


    }
}