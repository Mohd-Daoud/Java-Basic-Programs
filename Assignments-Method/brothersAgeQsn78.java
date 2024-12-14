import java.util.Scanner;
public class brothersAgeQsn78 {
    public static void Three()
    {
        Scanner sc = new Scanner(System.in);
        String tittu = "Tittu";
        String sittu = "Sittu";
        String littu = "Littu";
        System.out.print("Enter Tittu Age : "  ); 
        int a = sc.nextInt();
        System.out.print("Enter Sittu Age : "  ); 
        int b = sc.nextInt();
        System.out.print("Enter Littu Age : "  ); 
        int c = sc.nextInt();

        if(a>b && a>c && c>b){
            System.out.println("According To Your Entered Age Where Tittu Age : " + a +" Sittu Age : " + b +" and Littu Age :  "+c );
            System.out.print(tittu+ " is Oldest One and "+ sittu +" Is Middle One "+" Littu Is Youngest One Brother");
        }else if (b>a && b>c && c>a) {
            System.out.println("According To Your Entered Age Where Tittu Age : " + a +" Sittu Age : " + b +" and Littu Age :  "+c );
            System.out.print(sittu+ " is Oldest One and "+ littu +" Is Middle One "+" Tittu Is Youngest One Brother");
        }else{
            System.out.println("According To Your Entered Age Where Tittu Age : " + a +" Sittu Age : " + b +" and Littu Age :  "+c );
            System.out.print(littu+ " is Oldest One and "+ tittu +" Is Middle One "+" Sittu Is Youngest One Brother");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======:Find Here Which Which One Elder and Tunger and Middle three Brothers:=======");
        brothersAgeQsn78.Three();
    }
    
}
