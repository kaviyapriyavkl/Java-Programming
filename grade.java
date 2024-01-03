import java.util.*;
public class grade
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter grade");
        int grade=sc.nextInt();
        if(grade<40)
        {
            if(grade==38){
                System.out.print(grade+2);
            }
            else if(grade==39){
                System.out.print(grade+1);
            }
            else{
                 System.out.print(grade);
            }
            
        }
        
        else if(grade > 40 && ((grade+2)%5==0))
        {
           System.out.println(grade+2); 
        }
        else if(grade >40 &&  ((grade+1)%5==0))
        {
           System.out.println(grade+1); 
        }
        else
        {
            System.out.println(grade);
        }
    }
}