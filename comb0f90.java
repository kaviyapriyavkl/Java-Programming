import java.util.Scanner;

public class comb0f90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int amt = sc.nextInt();
        int befAmt = amt/9;
        int remAmt = amt%9;
        for(int i=1;i<=befAmt;i++,remAmt=(remAmt*10)+9);
        System.out.println(remAmt);
    }
}