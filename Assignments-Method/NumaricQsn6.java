import java.util.Scanner;
public class NumaricQsn6 {
    public static void Numaric(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Your Value : ");

        char c = sc.next().charAt(0);
        int asciiValue = (int)c;
        System.out.println("Ascii Value of " +c+ " is : "+asciiValue );
        if (asciiValue>=48 && 57<=asciiValue) {
            System.out.println("This is a Intger No ");
        }else{
            System.out.println("This Not A Intger No ");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===:Check value is Numaric Or Not:===");
        NumaricQsn6.Numaric();
    }
    
}
