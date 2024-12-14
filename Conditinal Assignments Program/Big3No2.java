import java.util.Scanner;
class Big3No2
{
    public static void main(String[] args)
    {
        System.out.println("========:Software to find Big No Between 3:========");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Value : ");
        int x = sc.nextInt();
        System.out.print("Enter your 2nd Value : ");
        int y = sc.nextInt();
        System.out.print("Enter Your 3rd Value : ");
        int z = sc.nextInt();
        System.out.println();

        System.out.print("Big Value Is : "+(x>y && x>z?x:(y>x && y>z?y:z)));

    }
}