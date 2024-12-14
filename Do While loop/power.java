import java.util.Scanner;
class power
{
    double a ;
    double b ;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter No : ");
            double a = sc.nextDouble();
            System.out.println("Enter Power For "+a+ " : ");
            double b = sc.nextDouble();
            System.out.println("Solution : " +Math.pow(a, b));
            System.out.println("Solution 2 : " +getPower(a,b));
        }
        public static double getPower(double a , double b)
        {
            // Get Power Function
            int result = 1;
            while (b!=0){
                result *=a;
                b--;
            }
        return result;
        
    }
}