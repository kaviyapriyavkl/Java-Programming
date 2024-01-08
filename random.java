import java.lang.Math;
import java.util.Scanner;
public class random {
    public static void main(String []args)
    {
        int max=100;
        int min=1;
    Scanner sc =new Scanner(System.in);
     int a=(int)(Math.random()*max-min+1)+min;
     System.out.println("guess num btw 1-100");
     //System.out.println(a);
     int b=0;
    for(int i=0;i<5;i++)
    {
     b=sc.nextInt();
    if(b>a)
    {
        System.out.println("TOO LARGE!!!");
    }
    else if(b<a){
         System.out.println("TOO SMALL!!!");
    }
    if(a==b){
        System.out.println("YOU WON THE GAME!!🥳");
        break;
    }

    }
    if(a!=b)
    {
System.out.println("Better luck next Time !!!🥲");
    }

  sc.close();  
}
}
