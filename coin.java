import java.util.*;
public class coin
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[] =new int[n],g=1;
        for(int i=0;i<n;a[i++]=sc.nextInt());
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(g>=a[i])
            {
                g+=a[i];
            }
        }
        System.out.println(g);
      
    }
}