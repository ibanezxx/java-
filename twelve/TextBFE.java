package homework.twelve;

public class TextBFE {
    public static void main(String[] args) throws BinaryFormatException {
        System.out.println(bin2Dec("1100"));
        System.out.println(bin2Dec("123"));
    }
    public static String bin2Dec(String s) throws BinaryFormatException {
        int num=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1' || s.charAt(i) == '0') {
                num += Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(2, s.length() - 1 - i);
            }
            else {throw new BinaryFormatException(s);}
        }
        s=String.valueOf(num);
        return s;
    }
}
