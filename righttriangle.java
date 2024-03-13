public class righttriangle {
    public static void main(String []args)
    {
        // String ch=;
        int num=4;
        // for(int i=0;i<num;i++)
        // {
        //     ch=ch+"*";
        //     // System.out.print(h);
        //     System.out.println(ch);

        // }
    
    //    int a=1;
    //    for(int i=1;i<=num*num;i++)
    //    {
    //     System.out.print("* ");
    //     if(i%num==0){
    //     System.out.println();
    //     i+=(a++);}
    //    }
       int j=num;
       for(int i=1;i<=num;i++)       
       {
         if(j>=i){
            System.out.print("* ");
            j--;
            i--;
        
         }
         else{System.out.println();j=num;}
       }


    }
}
