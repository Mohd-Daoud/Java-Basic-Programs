import java.util.Scanner;

public class O2DDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        O2DConversion b1 = new O2DConversion();
        System.out.print("Enter A valid Octal Number : ");
        int number = sc.nextInt();
        System.out.println(b1.OctalToDecimal(number));
    }
}
