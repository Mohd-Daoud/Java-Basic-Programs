import java.util.Scanner;
public class returnSumQsn710 {
    public int sum(int a, int b, int c)
    {
        int result = a+b+c;

    return result;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=====:Enter A Three Digit Number:=====");
        int v = sc.nextInt();
        int x = v%10;
        v=v/10;
        int y = v%10;
        v=v/10;
        int z = v%10;
        System.out.println();
        System.out.println();
        returnSumQsn710 obj = new returnSumQsn710();
        System.out.println("Sum Of your values "+z+" "+y+" "+x+" : "+obj.sum(x,y,z));
        
    }
}
