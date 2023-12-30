import java.util.*;
import java.lang.Math;
public class numlock {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int door=sc.nextInt();
        int bin=0,unit=1;
        int k=1;
        do{
            int n=k;
            bin = 0;
            unit=1;
       while(n!=0)
       {
        bin+=(n&1)*unit;
        n>>=1;
        unit*=10;
        k++;
       }
       
       }while((bin*9)%door!=0);
    System.out.println((bin*9));
        }
    }

