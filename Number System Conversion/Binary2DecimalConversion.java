class Binary2DecimalConversion
{
    public String DecimalToBinaryCoversion(int number)
    {
        String bin = "";
        if (number<2) return "This No Is Not Is A Valid Number To Convert";
        while (number>0) {
            
            int rem = number%2;
            bin = rem + bin;
            number/=2;
        }

        return bin+" Is A Converted value";
    }
}