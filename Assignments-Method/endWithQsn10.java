import java.util.Scanner;
public class endWithQsn10 {
    public static void endWith8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int z = sc.nextInt();
        int x = z%10;
        if (x==8) {
            System.out.println(" Entered Number End With 8");
        }else
        {
            System.out.println(" Entered Number Is Not End With 8");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==========:Number is ends with 8 or not:==========");
        endWithQsn10.endWith8();
    }
}
