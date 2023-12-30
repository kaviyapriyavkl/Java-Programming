import java.util.*;
import java.lang.Math;
public class premium {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int flag=0,sum=0;
    for(int i=0;i<arr.length;arr[i++]=sc.nextInt());
    sum=0;
    for(int i=0;i<arr.length;i++)
    {   
        flag=0;
        if(arr[i]==1){flag=1;}
       

        if(arr[i]!=2 &&arr[i]%2==0){flag=1;}
        else{   
               for(int j=2;j<=Math.sqrt(arr[i]);j++)//
                if(arr[i]%j==0){flag=1;break;}
        }
        
       
        
    
    if(flag==0)
    {
   sum+=arr[i];
  

    }
    }
    System.out.print(sum);
}

}
