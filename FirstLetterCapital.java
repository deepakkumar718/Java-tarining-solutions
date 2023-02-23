package selfpractice;
public class FirstLetterCapital {
    public static void main(String args[])
    {
        System.out.println(capitalize("welcome"));
    }
    //user-defined function to capitalize the first letter also check for null string
    public static final String capitalize(String str)
    {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

