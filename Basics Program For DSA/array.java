import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====:Enter The Size Of Array:=====");
        int size = sc.nextInt();
        int number[]  = new int [size];
        //input
        for(int i = 0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print(" List of Your Array : ");
        for(int i = 0; i<size; i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        //ouput
        System.out.print("Enter the value you want to fund index number : ");
        int x = sc.nextInt();
        for(int i = 0 ; i<number.length; i++)
        {
            if(number[i] == x)
            {
                System.out.println("x is found at index : "+ i);
            }
        }
        
    }
}
