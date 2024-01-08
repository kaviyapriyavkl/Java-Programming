import java.util.*;
public class braket {
    public static void main (String []args)

    { 
      Scanner sc=new Scanner(System.in);
      char ch[]=sc.nextLine().toCharArray();
      Stack<Character> st=new Stack<>();
    
      for(int i=0;i<ch.length;i++)
      {
        if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
        {   
            st.push(ch[i]);
            
        }
       
        // st.isEmpty(){System.out.print("NO");
        else if(!st.isEmpty()&&((st.peek()=='{' && ch[i]=='}') || (st.peek()=='(' && ch[i]==')') || (st.peek()=='[' && ch[i]==']')))
        {
           st.pop();
        }
        else{
            st.push(ch[i]);
        }
         
    //   if(st.isEmpty())
    //   {
    //     System.out.println("YES");break;
    //   }
    //   else{System.out.print("NO");break;}

    }
      
      
      if(st.isEmpty())
      {
        System.out.println("YES");
      }
      else{System.out.print("NO");}
    
    } 
}