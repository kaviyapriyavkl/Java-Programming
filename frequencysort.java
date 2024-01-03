import java.util.*;

public class frequencysort {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        int [] feq=new int[10];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        for(int i=0;i<n;feq[arr[i++]]++);
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(feq[arr[i]]>feq[arr[j]] || (feq[arr[i]]==feq[arr[j]]&&arr[i]>arr[j]))
                {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
            
        }

        
       System.out.println(Arrays.toString(arr));
        
        
        
    }
}