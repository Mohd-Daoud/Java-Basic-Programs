import java.util.Scanner;
public class Binary2DecimalDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B2DConversion b1 = new B2DConversion();
        System.out.print("Enter A Decimal Number : ");
        int number = sc.nextInt();    
        System.out.println(b1.DecimalToBinaryCoversion(number));
    }
}
