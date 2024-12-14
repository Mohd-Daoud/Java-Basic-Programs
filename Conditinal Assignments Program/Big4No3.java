import java.util.Scanner;
class Big4No3
{
    public static void main(String[] args)
    {
        System.out.println("========:Software to find Big No Between 4:========");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Value : ");
        int x = sc.nextInt();
        System.out.print("Enter your 2nd Value : ");
        int y = sc.nextInt();
        System.out.print("Enter Your 3rd Value : ");
        int z = sc.nextInt();
        System.out.print("Enter Your 4th Value : ");
        int w = sc.nextInt();
        System.out.println();

        System.out.print("Big Value Is : "+((x>y && x>z && x>w )?x:((y>x && y>z && y>w)?y:(z>x && z>y && z>w)?z:w)));

    }
}