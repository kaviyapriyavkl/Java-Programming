import java.util.*;
public class findindex {
    public static void main(String[]args)
    {
    Integer[] arr={1,4,1,3,4,5,5,3,3};
        int key=2;
        
     
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        // Set<Integer> st=new HashSet<>(Arrays.asList(intarr));
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        if(key>Collections.max(arrayList)){System.out.print(arrayList.size());}
        if(arrayList.contains(key))
        {
            System.out.print(arrayList.indexOf(key));
        }
        else{
            for(int i=0;i<arrayList.size();i++)
            {
               if(arrayList.get(i)>key){System.out.print(i);break;}
            }
        }
            

     
    }}

