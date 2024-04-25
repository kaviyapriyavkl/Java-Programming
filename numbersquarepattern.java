import java.util.*;
public class numbersquarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rows = num*2-1;
        int cols = num*2-1;
        int mid = rows / 2; // Gives the 0 based index of middle row
        int max = mid + 1;
        for (int i = 0; i < rows; i++) {
            int diff = mid - i;
            int maxNum = max - Math.abs(mid - i);
            for (int j = 0; j < cols; j++) {
                int dta = Math.abs(j - mid);
                if (max - dta > maxNum) {
                    System.out.print(maxNum);
                } else {
                    System.out.print(max - dta);
                }
            }
            System.out.println();
        }
    }
}
