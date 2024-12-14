// Octal to decimal
import java.util.Scanner;
public class ByString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ByString b = new ByString();
        System.out.print("Enter A valid Octal Number : ");
        String number = sc.nextLine();
        System.out.println(b.OctalToDecimal(number));
    }
    public static String OctalToDecimal(String number) 
    {
        int dec = 0;    int eightmul = 1;
        for (int i = number.length()-1;i>=0; i--) {
            char c = number.charAt(i);
            if (c>'7') return "This is note a valid Octal Number";
            dec = dec + (c-48)*eightmul;

            eightmul*=8;
        }

        return "The Decimal Value is "+dec;
    }
}
