import java.util.*;



public class uniquenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        int [] feq=new int[10];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[n-1]);
        
        
    }
}