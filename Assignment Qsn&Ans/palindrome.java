public class palindrome {
    int OrignalNo;
    int ReversNo;
    static int Count=0;
    String DigitString = "";
    public int Revers(int OrignalNo)
    {
        while (OrignalNo>0) {
            int LastDigit = OrignalNo%10;
            DigitString = DigitString + LastDigit;
            OrignalNo = OrignalNo/10;
            Count++; 
        }
        int ReversNo = Integer.valueOf(DigitString);
        //System.out.println("Total Digit : "+Count);

    return ReversNo;
    }
}