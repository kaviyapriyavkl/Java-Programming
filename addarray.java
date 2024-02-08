import java.util.*;

public class addarray {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        float mid;
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};

        int[] arr3= new int [arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++)
        {arr3[i]=arr1[i];}
        for(int i=0;i<arr2.length;i++)
        {arr3[i+arr1.length]=arr2[i];}
        // System.arraycopy(arr1,0,arr3,0,arr1.length);
        // System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Arrays.sort(arr3);
        // for(int i=0;i<arr3.length;i++){System.out.print(arr3[i]);}
        if(arr3.length%2==0)
        {   int med=arr3.length/2;
            mid=(float)((arr3[med])+(arr3[med-1]))/2;

        }
        else{mid=arr3[arr3.length/2];}
       System.out.print(mid);


    }
}
