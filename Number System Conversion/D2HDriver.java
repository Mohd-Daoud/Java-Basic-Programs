import java.util.Scanner;
public class D2HDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        D2HConversion d1 = new D2HConversion();
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        System.out.println(d1.DecimalToHexadecimal(number));
    }
}
