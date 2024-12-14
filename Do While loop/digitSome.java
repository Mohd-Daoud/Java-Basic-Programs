import java.util.Scanner;

public class digitSome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int a = sc.nextInt();
        int result = 0;
        int noCount = 0;
        int b = a;
        while (a!=0) {
            a=a/10;
            ++noCount;
        }
        int i = noCount;
        System.out.println(noCount+" Digit No ");
        do
        {
            result+=b%10;
            b=b/10;
            noCount--;
        }while(noCount>0);
        System.out.println("Your Entered "+i+" numbers");
        System.out.println();
        System.out.println("Some Of "+i+" Individual Numbers: "+result);
        System.out.println();
        System.out.println("Program End");
        
    }
}
