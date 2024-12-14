public class rangePalindrome {
    //static int Count=0;
    public int ReversNo(int OrignalNo)
    {
        String DigitString = "";
        while (OrignalNo>0) {
            int LastDigit = OrignalNo%10;
            DigitString = DigitString + LastDigit;
            OrignalNo = OrignalNo/10;
        }
        int ReversValue = Integer.valueOf(DigitString);
    return ReversValue;
    }
    
}