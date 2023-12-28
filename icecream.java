import java.util.*;
import java.lang.Math;
public class icecream {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong(),k=sc.nextLong(),noc=(n+1)/2;
    
    System.out.print(k<=noc?(2*k)-1:(k-noc)*2);
    // List<Integer> nw=new ArrayList<>();
    // for(int i=1;i<=n;i++)
    // {
    //     if(i%2!=0)
    //     {
    //         nw.add(i);

    //     }
    // }
    // for(int i=1;i<=n;i++)
    // {
    //     if(i%2==0)
    //     {
    //         nw.add(i);
    //     }

    // }
    // System.out.print(nw);
    // System.out.print(nw.get(k-1));
     
}

}


// import java.util.Scanner;

// public class iceCream {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Num : ");
//         int num = sc.nextInt();
//         int k = sc.nextInt();
//         int index=0;
//         int[] iceCream = new int[num];
//         for(int i=1;i<=num;i++){
//             if(i%2==1){
//                 iceCream[index++] = i;
//             }
//         }
//         for(int i=1;i<=num;i++){
//             if(i%2==0){
//                 iceCream[index++] = i;
//             }
//         }
//         System.out.println(iceCream[k-1]);
//     }
// }
// Ice Cream using Arrays