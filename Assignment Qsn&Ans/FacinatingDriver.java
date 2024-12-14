import java.util.Scanner;
public class FacinatingDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        boolean result = Facinating.checkFac(number);
        if (result)
            System.out.println(number + " is A Facinating Number");
        else
            System.out.println(number + " is Not A Facinating Number");
    }
}