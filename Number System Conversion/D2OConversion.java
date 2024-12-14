public class D2OConversion {
    public String DecimalToOctal(int number)
    {
        String Oct = "";
        if (number<10) return "This No Is Not Is A Valid Number To Convert";
        while (number>0) {
            
            int rem = number%8;
            Oct = rem + Oct;
            number/=8;
        }

        return Oct+" Is A Converted value";
    }
}
