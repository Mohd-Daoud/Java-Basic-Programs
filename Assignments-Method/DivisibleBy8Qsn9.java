import java.util.Scanner;
public class DivisibleBy8Qsn9 {
    public static void By8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your value : "  ); 
        int a = sc.nextInt();

        if(a%8 == 0){
            System.out.println("Entered value is Divisible by 8");
        }else{
            System.out.println("Opp! Entered value is Not Divisible by 8 ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======: Number is Divisible by 8 or not :=======");
        DivisibleBy8Qsn9.By8();
        
    }
}
