
public class max1_3 {

    static boolean isSpecial(char s)
    {
        if(!Character.isLetterOrDigit(s)&&!Character.isWhitespace(s))
        return true;
        else 
        return false;
    }
    
    static int specialLen(String a)
    {
        int noOfSpecial = 0;
        for(int i=0; i<a.length(); i++)
            if(isSpecial(a.charAt(i)))
                noOfSpecial++;
        return noOfSpecial;
    }

    static String maxSpecialCharecters(String s[])
    {
        String maxString = "";
        for(int i=0; i<s.length; i++)
        {
            if(specialLen(s[i])>specialLen(maxString))
            maxString = s[i];
        }
        return maxString;
    }

    public static void main(String[] args) {
        System.out.println(maxSpecialCharecters(args));
    }
}
