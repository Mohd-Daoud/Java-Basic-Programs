import java.util.Scanner;

class vowel {
    public static void main(String[] args) {
        System.out.println("===This Program is use to To Check Character is vowel Or not===");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---:Please Enter A Character===:---");
        char ch = sc.next().charAt(0);
        int x = ch;
        String a = "your Entered Value " + ch + " is a Vowel ";
        String b = "your Entered Value " + ch + " is Not a Vowel ";
        System.out.println((x == 65 || x == 69 || x == 73 || x == 79 || x == 85 || x == 97 || x == 101 || x == 105
                || x == 111 || x == 117) ? a : b);
    }
}
