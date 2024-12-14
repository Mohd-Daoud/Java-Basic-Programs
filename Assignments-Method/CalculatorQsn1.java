import java.util.Scanner;
class CalculatorQsn1
{
    public static void Add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("======:Addition:======");
        System.out.println();
        System.out.println("----Enter Your 1st Values----");  
        int a = sc.nextInt();
        System.out.println("----Enter Your 2nd Values----");
        int b = sc.nextInt();
        double sum = a+b;
        System.out.println("Addition of " +a +" and " +b+ " is : --> " +sum);
        System.out.println();

    }
    public static void Sub()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----Enter Your 1st Values----");  
        int a = sc.nextInt();
        System.out.println("----Enter Your 2nd Values----");
        int b = sc.nextInt();
        if(a>b){
            double sum = a-b;
            System.out.println("======:Subtraction:======");
            System.out.println("Subtraction of " +a +" and " + b + " is : --> " +sum);
        }else{
            double sum = b-a;
            System.out.println("======:Subtraction:======");
            System.out.println("Subtraction of " +a +" and " +b+ " is : --> " +sum);
        }
        System.out.println();

    }
    public static void Mul()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("======:Multiplication:======");
        System.out.println();
        System.out.println("----Enter Your 1st Values----");  
        int a = sc.nextInt();
        System.out.println("----Enter Your 2nd Values----");
        int b = sc.nextInt();
        double sum = a*b;
        System.out.println("Multiplication of " +a +" and " +b+ " is : --> " +sum);
        System.out.println();

    }
    public static void Div()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("======:Division:======");
        System.out.println();
        System.out.println("----Enter Your 1st Values----");  
        int a = sc.nextInt();
        System.out.println("----Enter Your 2nd Values----");
        int b = sc.nextInt();
        if(a>b){
            double sum = a/b;
            System.out.println("======:Subtraction:======");
            System.out.println("Subtraction of " +a +" and " + b + " is : --> " +sum);
        }else{
            double sum = b/a;
            System.out.println("======:Division:======");
            System.out.println("Division of " +a +" and " +b+ " is : --> " +sum);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("==========={_Calculator Started_}===========");
        System.out.println();
        System.out.println("~~~~~Enter 1 Number Which Opration You Want to Perform~~~~~");
        System.out.println();
        //int number = 4;
        System.out.println("Addition        : 1 ");
        System.out.println("Subtraction     : 2 ");
        System.out.println("Multiplication  : 3 ");
        System.out.println("Division        : 4 ");
        System.out.println();
        System.out.print("Number : " );
        int number = sc.nextInt();
        switch (number) {
            case 1:
                CalculatorQsn1.Add();
                break;
            case 2:
                CalculatorQsn1.Sub();
                break;
            case 3:
                CalculatorQsn1.Mul();
                break;
            case 4:
                CalculatorQsn1.Div();
                break;
            default:
                System.out.println("Invalid No");
                break;
        }

    }
}