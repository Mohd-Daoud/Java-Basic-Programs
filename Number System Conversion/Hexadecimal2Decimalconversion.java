public class Hexadecimal2Decimalconversion {

    public static String HexadecimalToDecimal(String number)
    {
        int Dec = 0 ; int sexteenMul = 1;
        for(int i = number.length() - 1;i>=0;i--)
        {
            char c = number.charAt(i);
            if (c>=48 && c<=57) 
                Dec = Dec + (c-48)*sexteenMul;
            else if (c>='A' && c<='F')
                Dec = Dec + (c-55)*sexteenMul;
            else if (c>='a' && c<='f')
                Dec = Dec + (c-87)*sexteenMul;
            else return number + "Is Not A Valid Decimal Number";
            sexteenMul *=16;
        }
        return Dec +" Is Decimal Value ";
    }
}
