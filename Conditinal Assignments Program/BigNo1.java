import java.util.Scanner;
class BigNo1
{
	public static void main(String[] args)
	{
		System.out.println("=====:BigNo Using Conditional  O/P:=====");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A No To Find Big no : ");
		int x = sc.nextInt();
		System.out.println();
		System.out.print("Enter Your 2nd Value to find Big No : ");
		int y = sc.nextInt();
		System.out.println();
		System.out.print("Begest No Between "+x+ " And "+y+" is : ");
		System.out.print(x>y?x:y);
		System.out.println();
		
	}

}