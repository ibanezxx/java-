package homework.ten;

public class MyString2{
    private String string;
    private char[] chars;

    public MyString2(String string) {
        this.string = string;
        chars=string.toCharArray();
    }

    public int compare(String s){
        if (string.equals(s))
            return 1;
        else return 0;
    }

    public MyString2 substring(int begin){
        String s=string;
        String s2="";

        if (begin==0)
            return new MyString2(s);

        while (begin<=s.length()-1){
            s2=s2+String.valueOf(s.charAt(begin));
            begin++;
        }
        return new MyString2(s2);
    }

    public MyString2 toUpperCase(){
        for (int i=0;i<chars.length;i++){
            if (chars[i]>=97&&chars[i]<=122)
                chars[i]-=32;
        }
        String s=String.valueOf(chars);
        return new MyString2(s);
    }

    public char[] toChars(){
        return chars;
    }

    public static MyString2 valueOf(boolean b){
        return b ? new MyString2("true") : new MyString2("false");
    }

    @Override
    public String toString() {
        return  string ;
    }
}
