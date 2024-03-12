import java.util.Scanner;

public class keydoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int door = sc.nextInt();
        int bin=0,u=1;
        int k=1;
        do {
            int n=k;bin=0;u=1;
            while (n!=0) {
            bin+=(n&1)*u;
            n>>=1;
            u*=10;
        } 
        k++;
        } while ((bin*9)%door!=0);
        System.out.println((bin*9));
    }
}