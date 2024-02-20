// In the theory of numbers, square free numbers have a special place.  A square free number is one that is not divisible by a perfect square (other than 1).  Thus 72 is divisible by 36 (a perfect square), and is not a square free number, but 70 has factors 1, 2, 5, 7, 10, 14, 35 and 70.  As none of these are perfect squares (other than 1), 70 is a square free number.

// For some algorithms, it is important to find out the square free numbers that divide a number.  Note that 1 is not considered a square free number. 

// In this problem, you are asked to write a program to find the number of square free numbers that divide a given number.

import java.util.*;

public class squarefree {
    public static void main(String[] args) {
        int n = 9690;
        int count = 0;


    int[] arr = {2,3,5,7,11,13,17,19};
    for(int i:arr)
    {
        if(n%i==0)
        {count++;}
    }
    
   System.out.print((int)Math.pow(2,count)-1);
    }
}


