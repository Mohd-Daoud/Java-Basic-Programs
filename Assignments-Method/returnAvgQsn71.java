import java.util.Scanner;
public class returnAvgQsn71 {
    public static double Avgrage(int a, int b, int c)
    {
        double avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("==========:Enter three Values To find Avg:==========");
        System.out.println();
        System.out.println("Enter your 1st value");
        int x = sc.nextInt();
        System.out.println("Enter your 2nd value");
        int y = sc.nextInt();
        System.out.println("Enter your 3rd value");
        int z = sc.nextInt();


        System.out.println("Avrage Vlaue is : "+returnAvgQsn71.Avgrage(x, y, z));

    }  
}
