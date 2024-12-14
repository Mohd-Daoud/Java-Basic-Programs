
public class D2HConversion {
    public String DecimalToHexadecimal(int number)
    {
        String Hex = ""; 
        while (number>0) {
            
            int rem = number%16;
            if (rem <= 9) Hex = rem + Hex;
            else Hex = (char)(rem+55) + Hex;
            number/=16;
        }
        return Hex+" Is A Converted value";
    }
}
