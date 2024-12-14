public class Facinating {
    public static boolean checkFac(int number)
    {
        String NUM = number+ ""+number*2+""+number*3;
        if (NUM.length()!=9) return false; 
        for(char c = '1'; c<='9'; c++)
        {
            int j;
            for(j=0; j<NUM.length(); j++)
            {
               char p = NUM.charAt(j);
               if(p==c) break;
            }
            if(j==NUM.length())return false;
        }
        return true;
    }
}
