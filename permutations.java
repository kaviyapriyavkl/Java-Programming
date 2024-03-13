import java.util.*;
public class permutations {
    
    public static ArrayList<String> permu(String str,String ans)
    {
        ArrayList<String> ad =new ArrayList<String>();
        if(str.length()==0)
        {
            ad.add(ans);
        }
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            
            ad.addAll(permu(ros, ans + ch));
        }
        return ad;
    }
    
    
    public static int findRank(String A) {
        
        String ans="";
        ArrayList<String> arr = new ArrayList<String>();
        
        arr =  permu(A,ans);
        System.out.print(arr);
        Set<String> st =new HashSet<String>(arr);
        ArrayList<String> res = new ArrayList<String>(st);
        Collections.sort(res);
        return res.indexOf(A)+1;
    }

    public static void main(String[]args)
    {
        String A="sakfjn";
        int rank = findRank(A);
        System.out.print("\n"+"Rank : "+rank);
    }
}
        // for (int i = 2; i <= n; i++) {
        //     if (n % i == 0) {

        //         if (Math.sqrt(i) == Math.floor(Math.sqrt(i))) {

        //             continue;
        //         } else {
        //             // int temp = i;
        //             boolean isSquareFree = true;
        //             for (int j = 2; j * j <= i; j++) {
        //                 if (i % (j * j) == 0) {
        //                     isSquareFree = false;
        //                     break;
        //                 }
        //             }
        //             if (isSquareFree) {
        //                 count++;
        //                 System.out.print(i + " ");
        //             }
        //         }
        //     }
        // }

        // System.out.println("\nResult: " + count);

        // import java.util.*;
// public class squarefree {
// public static void main(String[] args)
// {
// int n=20;
// int count = 0;
// for(int i=2;i<=n;i++)
// {
// if(n%i==0){
// int perf = 1;
// if(Math.sqrt(i)==Math.floor(Math.sqrt(i)))
// { perf = i;

// continue;
// }

// else if(n%i==0 && perf!=1){
// continue;}

// else{count++;}
// System.out.print(i+" ");
// }

// }
// System.out.print(count);
// }
// }