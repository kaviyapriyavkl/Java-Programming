import java.util.*;
public class twodarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int ran = sc.nextInt(),sum=0;
        int[][] arr = new int[ran][ran];
        for(int i=0;i<ran;i++){
            for(int j=0;j<ran;j++){
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        for(int i=0;i<ran;i++){
            System.out.println();
            for(int j=0;j<ran;j++){
                // System.out.print(arr[i][j]+" ");
                if(i==j||j==ran-i-1)
                {
                    sum+=arr[i][j];
                }
            }

        }
        System.out.print(sum);
    }
}