import java.util.Scanner;
public class pelidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A No : ");
        int no = sc.nextInt();
        int temp = no;
        int rev = 0;
        while (no>0) {
            rev = (rev*10)+no%10;
            no = no/10;
        }
        if(temp==rev)
        {
            System.out.println(temp +" is pelindrome");
        }else
        {
            System.out.println(temp +" is Not a pelindrome");
        }
    }
}
