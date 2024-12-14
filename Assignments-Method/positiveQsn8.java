import java.util.Scanner;
public class positiveQsn8 {

    public static void numberType()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your value : "  ); 
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("Given value is a +ve ");

        }else if(a < 0){
            System.out.println("Given value -ve ");
        }else{
            System.out.println("Given value 0 ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=======: Number Type :=======");
        positiveQsn8.numberType();
    }
}
    
