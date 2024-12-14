public class Octal2DecimalConversion {
    public static String OctalToDecimal(int number)
    {
        int Dec = 0; int numMul = 1;
        while (number>0) {
            int lastDigit = number%10;
            if (lastDigit>7) return "This is not a valid number"; 
            Dec = Dec+lastDigit*numMul;
            number/=10;
            numMul *=8;
        }
        return "Is Decimanl Number "+Dec;
    }
}
