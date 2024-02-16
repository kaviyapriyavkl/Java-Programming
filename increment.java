// import java.util.*;
// import java.math.BigInteger;
// public class increment
//  {
//     public static void main(String[]args){
//     // Scanner sc=new Scanner(System.in);
//     BigInteger summ = BigInteger.ZERO;
//     int[] arr={1,2,3};
//     // int[] nw =new int[arr.length];
    
//     for(int i=0;i<arr.length;i++)
//     {   
//         summ = summ.multiply(BigInteger.TEN).add(BigInteger.valueOf(arr[i]));
//     }
//     // System.out.print(summ);
//     // summ=summ.divide(BigInteger.TEN);
    
//     System.out.print(summ+" "); 
//     summ = summ.add(BigInteger.ONE);
//     System.out.print(summ+" "); 
    
//     for (int i = arr.length - 1; i >= 0; i--) {
//         arr[i] = summ.mod(BigInteger.TEN).intValue();
//         summ = summ.divide(BigInteger.TEN);
//         System.out.print(arr[i] + " ");
//     }
//     for(int i=arr.length-1;i>=0;i--){System.out.print(arr[i]+" ");}

// //     for(int i=0;i<arr.length;i++)
// //     {
// //         arr[i]=summ%10;
// //         summ=summ/10;
// //         // System.out.print(arr[i]);
// //     }
// //     for(int i=arr.length-1;i>=0;i--){System.out.print(arr[i]+" ");}
// // }
//  }}



import java.util.*;
import java.math.BigInteger;

public class increment {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        BigInteger summ = BigInteger.ZERO;
        int[] arr = {9,9,9};
        

        for (int i = 0; i < arr.length; i++) {
            summ = summ.multiply(BigInteger.TEN).add(BigInteger.valueOf(arr[i]));
        }
        // System.out.print(summ);
        // summ = summ.divide(BigInteger.TEN);

        System.out.println(summ + " ");
        summ = summ.add(BigInteger.ONE);
        String sizee=summ+"";
        System.out.print(sizee+" ");
        int[] nw =new int[sizee.length()];
        
        for(int i=0;i<nw.length;i++)
        {
         nw[i]=Integer.parseInt(sizee.substring(i, i+1));
         System.out.print(nw[i]+" ");
        }
    }
}

        // for (int i = nw.length - 1; i >= 0; i--) {
        //     arr[i] = summ.mod(BigInteger.TEN).intValue();
        //     summ = summ.divide(BigInteger.TEN);
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i <nw.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

   
