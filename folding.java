import java.util.*;
public class folding {

static long power(long b,long e){        //if not mentioned it as static we need obj to call the function
    long pow=1,i=0; 
    while(e!=0) { 
    if((e&1)==1) {pow = (pow*b)%(long)1e9; }
   
    b=(b*b)%(long)1e9; 
    e>>=1; 
    i++; 
   } 
    System.out.println(i); 
    return pow; 
    
}
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt(),f=sc.nextInt();
        long pow=1;
        System.out.println(t*(power(2, f))%(long)1e9); 

    }
}
