import java.util.*;
public class sumofrowcol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int ran = sc.nextInt(),sum=0;
        int[][] arr = new int[ran][ran];
        
        for(int i=0;i<ran;i++){
            for(int j=0;j<ran;j++){
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        for(int i=0;i<ran;i++){
            
            sum=0;
            for(int j=0;j<ran;j++){
                // System.out.print(arr[i][j]+" ");
                // if(i==j||j==ran-i-1)
                // {
                    sum+=arr[i][j];
                // }
            }
           
 System.out.print(sum+" ");

        }
         System.out.println();
         for(int j=0;j<ran;j++){
            
            sum=0;
            for(int i=0;i<ran;i++){
                // System.out.print(arr[i][j]+" ");
                // if(i==j||j==ran-i-1)
                // {
                    sum+=arr[i][j];
                // }
            }
        
            System.out.print(sum+ " ");
    }
    
    int[] rsum=new int[ran];
    int[] csum=new int[ran];
    int c=0;
    for(int i=0;i<ran;i++){
        for(int j=0;j<ran;j++){
            rsum[i]+=arr[i][j];
            csum[j]+=arr[i][j];
        }
    }
    for(int i=0;i<ran;i++)
    {
        for(int j=0;j<ran;j++)
        {
            if(rsum[i]<csum[j]){c++;}
        }
    }
    System.out.println();
    System.out.println(Arrays.toString(rsum));
    System.out.println(Arrays.toString(csum));
    System.out.println(c);

}
} 