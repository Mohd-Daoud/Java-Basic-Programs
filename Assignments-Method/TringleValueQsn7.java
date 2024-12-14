import java.util.Scanner;
public class TringleValueQsn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======:Is Triangle ? :=======");
        TringleValueQsn7.SmallInThree();
    }
    public static void SmallInThree()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st value : "  ); 
        int a = sc.nextInt();
        System.out.print("Enter Your 2nd value : "  ); 
        int b = sc.nextInt();
        System.out.print("Enter Your 3rd value : "  ); 
        int c = sc.nextInt();
        int sum1 = a+b;
        int sum2 = a+c;
        int sum3 = b+c;

        if(sum1 > c){
            System.out.println("Sum of " +a +" and " + b +" is Grater then " +c);
            System.out.println("So that It Is A valid Triangle");
        }else if(sum2 > b){
            System.out.println("Sum of " +a +" and " + c +" is Grater then " +b);
            System.out.println("So that It Is A valid Triangle");
        }else if(sum3 > a){
            System.out.println("Sum of " +b +" and " + c +" is Grater then " +a);
            System.out.println("So that It Is A valid Triangle");
        }else{
            System.out.println("It Is Not A Valid Triangle");
        }
        System.out.println();
    }
}
