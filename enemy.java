import java.util.*; 

public class enemy { 

 public static void main(String[] args) { 

 Scanner sc = new Scanner(System.in); 

 int n = sc.nextInt(), a[] = new int[n], sumbe=0, sum=0,i; 

 for(i=0;i<n; a[i++] = sc.nextInt());//Input 

  

for(i=0;i<n;sum+=a[i++]);// Sum of powers 

 Arrays.sort(a); 

 sum /= 2;  

 

for(i=0 ; sumbe<=sum ; sumbe+=a[(a.length-1)-i++]);  

 

System.out.println(i); 

 } 

} 






// import java.util.*;
// public class enemy {
//     public static void main(String [] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int[]arr=new int[n];
//         int num1=0,num2=0,count=0;
//         Arrays.sort(arr);
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++)
//         {   num1+=arr[i];
//             for(int j=i+1;j<n;j++)
//             {
//                 num2+=arr[j];
//             }
//             if(num1<num2)
//             {
//                 num2=0;
//             }
//             else{count++;}
//         }
//         System.out.println(count);
//     }
// }
