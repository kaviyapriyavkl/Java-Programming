import java.util.*;
public class goodmorning {
    public static void main(String []args){
    for(int i=1;i<=100;i++)
    {
        if(i%3==0 && i%5==0)
        {
            System.out.println("GoodMorning");
        }
        else if(i%3==0)
        {
            System.out.println("Good");
        }
        else if(i%5==0)
        {
            System.out.println("Morning");
        }
        else{System.out.println(i);}
    }
}
}