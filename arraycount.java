// import java.util.*;
// public class arraycount {

    
// public static void main(String[]args)  {
//     int[] arr={0,-1,2,4,-1,-1,1,2};

//     // HashSet<Integer> st =new HashSet<Integer>(Arrays.asList());

//     List<List<Integer>> lt =new ArrayList<>();
    
//     int[] in =new int[3];
//     Arrays.sort(arr);
//     // for(int i=0;i<arr.length;i++)
//     // {
//     //     System.out.print(arr[i]+" ");
//     // }
//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length-1;j++)
//         {
//             for(int k=j+1;k<arr.length-2;k++)
//             {
//                 if(arr[i]+arr[j]+arr[k]==0)
//                 {
                    // List<Integer> inner = Arrays.asList(arr[i], arr[j], arr[k]);
//                     
//                     // Collections.sort(inner);
//                     if(!(lt.contains(inner))){ lt.add(inner);}
//                     // lt.add(inner);

                    
//                 }
//             }
//         }
//     }
//     System.out.print(lt);

//  }

// }


import java.util.*;
public class arraycount {

    
public static void main(String[]args)  {
    int[] arr={0,-1,2,4,-1,-1,1,2}; 

    // HashSet<Integer> st =new HashSet<Integer>(Arrays.asList());

    List<List<Integer>> lt =new ArrayList<>();
   
    int[] in =new int[3];
    Arrays.sort(arr);
    // for(int i=0;i<arr.length;i++)
    // {
    //     System.out.print(arr[i]+" ");
    // }
    for(int i=0;i<arr.length-2;i++)
    {
        for(int j=i+1;j<arr.length-1;j++)
        {
            for(int k=j+1;k<arr.length;k++)
            {System.out.print(arr[i]+arr[j]+arr[k]+" ");
                if(arr[i]+arr[j]+arr[k]==0)
                { List<Integer> inner = new ArrayList<Integer>();
                    inner.add(arr[i]);
                    inner.add(arr[j]);
                    inner.add(arr[k]);
                    
                    // Collections.sort(inner);
                    if(!(lt.contains(inner))){ lt.add(inner);}
                    // lt.add(inner);

                    
                }
            }
        }
    }
    System.out.print(lt);

 }

}











