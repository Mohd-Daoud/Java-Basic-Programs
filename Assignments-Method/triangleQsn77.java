import java.util.Scanner;
public class triangleQsn77 {
    public static void Three()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st value : "  ); 
        int a = sc.nextInt();
        System.out.print("Enter Your 2nd value : "  ); 
        int b = sc.nextInt();
        System.out.print("Enter Your 3rd value : "  ); 
        int c = sc.nextInt();

        if(a==b && b==c && c==a){
            System.out.println("According To Your Entered Value " + a +", " + b +" and "+c );
            System.out.println("=====:Will Perform Equilateral triangle:=====");
        }else if(a!=b && b!=c && c!=a){
            System.out.println("According To Your Entered Value " + a +", " + b +" and "+c );
            System.out.println("=====:Will Perform Scalene Triangle :=====");
        }else if(a==b  || c==a || b==c) {
            System.out.println("According To Your Entered Value " + a +", " + b +" and "+c );
            System.out.println("=====:Will Isosceles Triangle :=====");
        }else{
            System.out.println("It Is Not A Valid Triangle");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======:Find Here Which Type Of Triangle Will Made:=======");
        triangleQsn77.Three();
    }
    
}
