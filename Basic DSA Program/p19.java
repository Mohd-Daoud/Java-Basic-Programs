import java.util.Scanner;
public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter A Number : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++ )
        {
            for(int j = 1; j<=i; j++)
            {
                int sum = (i+j)%2;
                if(sum == 0 )
                {
                    System.out.print("1");
                }else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}