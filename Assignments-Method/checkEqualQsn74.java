import java.util.Scanner;
public class checkEqualQsn74 {
    public static int equal(int a)
    {
        if(a==5)
        {
            System.out.println(a+ " is Equal to 5");
        }else
        {
            System.out.println(a+ " is Equal Not To 5");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("==========:Enter Any One Values To find Values Is Equal To 5 Or Not:==========");
        System.out.println();
        System.out.println("Enter A Value");
        int x = sc.nextInt();

        checkEqualQsn74.equal(x);

    }  
}

