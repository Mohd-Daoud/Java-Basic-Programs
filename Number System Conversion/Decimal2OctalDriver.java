import java.util.Scanner;
public class Decimal2OctalDriver
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        D2OConversion b1 = new D2OConversion();
        System.out.print("Enter A valid Decimal Number : ");
        int number = sc.nextInt();
        System.out.println(b1.DecimalToOctal(number));
    }
}