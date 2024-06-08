// Linear Search
import java.util.Scanner;
class G 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int [] arr = new int [size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the target");
        int target=sc.nextInt();
       System.out.println(linearSearch(arr,target)) ;

        
    }

    public static int linearSearch(int [] arr, int target)
    {
            if(arr.length==0)
            {
                return -1;
            }

            for(int i=0;i<arr.length;i++)
            {
                int element=arr[i];
                if(element==target)
                {
                    System.out.print("index number is =>");
                    return i;
                }
            }

            // this line will executed when non of the above statemet will not ececuted 

            return -1;
    }
}