package homework.ten;

public class TestString {
    public static void main(String[] args) {
     String s=new String("ab#12#453");
     String[] s2=split(s,"#");
     for (int i=0;i<s2.length;i++)
         System.out.println(s2[i]);
    }
    public static String[] split(String s,String regex){
        int[] t=new int[s.length()];
        int j=1;
        for (int i=0;i<s.length();i++){
            if (regex.equals(s.charAt(i))){
                t[j]=i;
                j++;
            }
        }
        String[] strings=new String[t.length];
        for (int k=1;k<t.length;k++){
            strings[k-1]=s.substring(t[k-1],t[k]);
        }
        return strings;
    }
}
