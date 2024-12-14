import java.util.Scanner;

public class rangePDriver {
    static int Count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rangePalindrome p = new rangePalindrome();
        System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();
        System.out.println();
        for(int i = start; i <= end; i++)
        {
            if ((p.ReversNo(i)) == i)
            {
                System.out.print(i+" ");
                Count++;
            }
            
        }
        System.out.println("\nTotal Palindrome Numbers Found : "+Count);
        System.out.println("Program End");
    }
}