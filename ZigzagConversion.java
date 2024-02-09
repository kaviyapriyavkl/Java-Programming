import java.util.Arrays;

public class ZigzagConversion {
    public static void main(String[]args){
        // Create empty rows
        String s="THISISJAVA";
        int key=3;
        String[] arr=new String[key];
        int strlen=s.length();
        for(int m=0;m<arr.length;m++){
        arr[m]="";
        }
        int i=0;
        while(i<strlen)
        {
        for(int j=0;j<key && i<strlen;j++)
        {
            arr[j]+=s.charAt(i);
            i++;
        }

        for(int k=key-2;k>0 && i<strlen; k--)
        {arr[k]+=s.charAt(i);
        i++;}

    }
  System.out.println(Arrays.toString(arr));
    }
}


