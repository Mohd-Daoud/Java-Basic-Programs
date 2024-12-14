import java.util.Scanner;
public class smallerNoQsn4and5 {
    public static void Small()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===:Smaller No:===");
        System.out.println();
        System.out.print("Enter Your 1st value : "  ); 
        int a = sc.nextInt();
        System.out.print("Enter Your 2nd value : "  ); 
        int b = sc.nextInt();
        System.out.println();
        if(a<b){
            System.out.println("Smaller No Between " +a +" and " + b + " is : --> " +a);
        }else{
            System.out.println("Smaller No Between " +a +" and " +b+ " is : --> " +b);
        }
        System.out.println();
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
        if(a<b && a<c){
            System.out.println("Smaller No Between " +a +" and " + b +" and " +c+ " is : --> " +a);
        }else if(b<a && b<c){
            System.out.println("Smaller No Between " +a +" and " + b +" and " +c+ " is : --> " +b);
        }else{
            System.out.println("Smaller No Between " +a +" and " + b +" and " +c+ " is : --> " +c);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=====:Small No Calculator:=====");
        System.out.println();
        System.out.print(" How Many No You Have 2 or 3 : ");
        int number = sc.nextInt();
        switch (number) {
            case 2:
                smallerNoQsn4and5.Small();
                break;
            case 3:
                smallerNoQsn4and5.SmallInThree();
                break;
            default:
                System.out.println("invalid No");
                break;
        }
    }
}