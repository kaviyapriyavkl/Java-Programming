import java.util.*;
public class tile {

    static int tiles(int n,int m)
    {   
       if(n==m){return 2;}
       if(n<m){return 1;}
       return tiles(n-1,m)+tiles(n-m,m);
        } 
    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        // int count=0;
        // if(n==m){count=2;}
        // if(n<m){count=1;}
        // if(n>m){
        //     count=tiles(n,m);
        // }
        System.out.println(tiles(n,m));

    }
}
