//Binary Search
import java.util.Scanner;
class H 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int [] arr= new int [size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target=sc.nextInt();

        // function calling 
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int [] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(end<=end)
        {
            //find the mid 
            // if we will use start+end/2 it might be create some problem
            int mid=start+(end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                end=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;       
    }
}