import java.util.Scanner;
public class bigNoQsn3 {
    public static void Big(int a, int b)
    {
        System.out.println("===:Square Bigger No:===");
        if(a>b){
            System.out.println("Square Bigger No Between " +a +" and " + b + " is : --> " +a*a);
        }else{
            System.out.println("Square Bigger No Between of " +a +" and " +b+ " is : --> " +b*b);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=====:Square Big No Calculator:=====");
        System.out.println();
        System.out.print("Enter Your 1st value : "  ); 
        int x = sc.nextInt();
        System.out.print("Enter Your 2nd value : "  ); 
        int y = sc.nextInt();
        bigNoQsn3.Big(x, y);

    }
}