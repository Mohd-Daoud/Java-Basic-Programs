import java.util.Scanner;
public class offerQsn79 {
    public double Offer(double price, double off )
    {
        System.out.println();
        double finalRate = price - (price*off/100);
    return finalRate;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===========: Welcome To Offer Zone :===========");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Actual Price : ");
        double x = sc.nextInt();
        System.out.print("Enter Offer Price in % : ");
        double y = sc.nextInt();
        offerQsn79 obj = new offerQsn79();
        System.out.println("Congratulation After "+y+"% Discount your Product Final Value Is "+obj.Offer(x,y));
        System.out.println();

        
    }
}
