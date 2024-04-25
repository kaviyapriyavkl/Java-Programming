import java.util.*;
public class letter_frequency
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "anitha";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<Character> keyval = new ArrayList<>(map.keySet());

        Collections.sort(keyval);

        for(char i: keyval)
        {
            System.out.println(i+" "+map.get(i));
        }

    }
}