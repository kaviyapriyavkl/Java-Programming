import java.util.*;
public class firstandlastindex {
    public static void main(String[]args)
    {
        int[] arr={1,2,1,3,4,5,5,3,3};
        int key=7;
        int[] indx={-1,-1};
        Arrays.sort(arr);
        // List<Integer> a=new ArrayList<Integer>(Arrays.asList(arr)) ;
        // if(arr.contains(key)){
        for(int i=0;i<arr.length;i++ )
        {
            if(arr[i]==key){indx[0]=i;break;
            }
            

        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==key){indx[1]=i;break;}
        }
        for(int i=0;i<2;i++){System.out.print(indx[i]+" ");}
    }}

