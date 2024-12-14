import java.util.Scanner;
public class checkEqualQsn73 {
    public static double equal(int a, int b, int c)
    {

        if(a == b && b == c && c == a)
        {
            System.out.println("Your All Three values Are Equal");
        }else
        {
            System.out.println("Your All Three values Are Not Equal");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("==========:Enter three Values To find Values Is Equal Or Not:==========");
        System.out.println();
        System.out.println("Enter your 1st value");
        int x = sc.nextInt();
        System.out.println("Enter your 2nd value");
        int y = sc.nextInt();
        System.out.println("Enter your 3rd value");
        int z = sc.nextInt();
        System.out.println("");

        checkEqualQsn73.equal(x,y,z);

    }  
}
