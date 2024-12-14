import java.util.Scanner;

class triangle {
    public static void main(String[] args) {
        System.out.println("===This Program is use to To Check Triangle is valid Or not===");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter 1st Side Of your Triangle : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd Side Of your Triangle : ");
        int y = sc.nextInt();
        System.out.print("Enter 3rd Side Of your Triangle : ");
        int z = sc.nextInt();
        String a = "It Will Be Valid Triangl ";
        String b = "It Will No Be Valid Triangl ";
        System.out.println((x+y)>z?a:((y+z)>x?a:((x+z)>y?a:b)));


    }
}
