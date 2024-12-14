import java.util.Scanner;
public class sqrLastTwoGigitQsn2 {
    public static void pritSQR(int a, int b)
    {
        double sum = a*a+b*b;
        System.out.println("Sum of squares of last two digit of your Given number : "+sum );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=====:Enter A Number:=====");
        int z = sc.nextInt();
        int x = z%10;
        z=z/10;
        int y = z%10;
        System.out.println(" Your 1st and 2nd Number is "+y+""+x);
        System.out.println();
        sqrLastTwoGigitQsn2.pritSQR(y,x);
        System.out.println();
        
    }
}
