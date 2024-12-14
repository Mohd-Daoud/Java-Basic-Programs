import java.util.Scanner;
public class alphabet {
    public static void main(String[] args) {
        System.out.println("===This Program is use to To Check Given User Input Is Character Or not===");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---:Please Enter A Character===:---");
        char ch = sc.next().charAt(0);
        int x = ch;
        if (x>=65 && x<=122 ) {
            System.out.println("your Entered Value "+ch+ " is a Alphabet ");
        }else
        {
            System.out.println("Your Entered Value "+ch+" Is Not A Alphabet");
        }
        System.out.println();
    }
}
