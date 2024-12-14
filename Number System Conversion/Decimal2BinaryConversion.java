public class Decimal2BinaryConversion {
    public static String BinaryToDecimal(int number)
    {
        int Dec = 0; int numMul = 1; 
        while (number>0) {
            int lastDigit = number%10;
            if (lastDigit>1) return "This is not a valid number"; 
            Dec = lastDigit + numMul;
            number/=10;
            numMul *=2;
        }
        return "Is Decimanl Number "+Dec;
    }
}
