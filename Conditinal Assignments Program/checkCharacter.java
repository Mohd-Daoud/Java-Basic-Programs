import java.util.Scanner;
public class checkCharacter {
    public static void main(String[] args) {
        System.out.println("===This Program is use to To Check Given User Input Is Character Or not===");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---:Please Enter A Character===:---");
        char ch = sc.next().charAt(0);
        int x = ch;
        if (x>=97 && x<=122) {
            System.out.println("your Entered Value "+ch+ " is a character in lovercase ");
        }else
        {
            System.out.println("Your Entered Value "+ch+" Is Not A Character in lovercase");
        }
        System.out.println();
    }
}
