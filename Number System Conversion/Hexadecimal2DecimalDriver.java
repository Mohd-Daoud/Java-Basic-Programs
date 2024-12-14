import java.util.Scanner;
public class Hexadecimal2DecimalDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H2Dconversion d1 = new H2Dconversion();
        System.out.print("Enter A Number : ");
        String number = sc.nextLine();
        System.out.println(d1.HexadecimalToDecimal(number));

    }
}
