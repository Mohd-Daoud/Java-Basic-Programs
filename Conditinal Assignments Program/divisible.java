import java.util.Scanner;
public class divisible {
    public static void main(String[] args)
    {
        System.out.println("========:Software to check No is Divible by 5 and 11 or not:========");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Value : ");
        int x = sc.nextInt();
        System.out.println();
        System.out.println((x%5 == 0 || x%11 == 0)?("Your Entered Value is "+x+" Which Is Divisible by 5 or 11"):("Your Entered Value is "+x+" Which Is NOT Divisible by 5 or 11"));
        

    }
}
