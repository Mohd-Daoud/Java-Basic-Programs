import java.util.Scanner;
public class LastDigitDivide6Qsb11 {
    public static void dividTwo(int x, int y)
    {
        
        System.out.println("Enter A Number ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=====:Check Number's Last Two Digit Id Divide By 6 Or not:=====");
        int a = sc.nextInt();
        int b = a%10;
        a=a/10;
        int c = a%10;
        System.out.println(" Your last 2 Numbers is "+c+""+b);
        System.out.println();
        LastDigitDivide6Qsb11.dividTwo(c,b);
        System.out.println();
        
    }
}
