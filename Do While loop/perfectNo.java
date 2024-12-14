import java.util.Scanner;
public class perfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int a = sc.nextInt();
        int i = 1;
        int result = 0;
        do
        {
            if (a%i==0) {
                result+=i;
            }
            i++;
        }while(i<=a/2);
        if (result==a) {
            System.out.println(a+" is perfect no");
        }else{
            System.out.println(a+ " is not a perfect no");
        }
    }
}
