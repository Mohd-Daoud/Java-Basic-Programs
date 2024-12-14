import java.util.Scanner;
public class D2BDriver
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decimal2BinaryConversion b1 = new Decimal2BinaryConversion();
        System.out.print("Enter A valid Binary Number : ");
        int number = sc.nextInt();
        System.out.println(b1.BinaryToDecimal(number));
    }
}