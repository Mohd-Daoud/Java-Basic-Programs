import java.util.Scanner;
public class PDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        palindrome p = new palindrome();
        System.out.println();
        if (p.Revers(number) == number)
            System.out.println("        "+number+" Is A Palindrome Number");
        else
            System.out.println("        "+number+" Is Not A Palindrome Number");
        
        System.out.println();
    }
}
