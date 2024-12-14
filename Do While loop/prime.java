import java.util.Scanner;
public class prime {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int a = sc.nextInt();
        int i = 1;
        do{
            if (a%i==0) {
                count++;
            }
            i++;
        }while(i<=a/2);
        if (count>1) {
            System.out.println("a Is not a prime No ");
        }else{
            System.out.println("a Is a prime No ");
        }
        /*for(int i = 1; i<=a/2; i++)
        {
            if (a%i==0) {
                count++;
            }
        }
        if (count>1)
            System.out.println("a Is Not a prime No ");
        else
            System.out.println("a Is a prime No ");
        */
    }
}