package homework.ten;

public class MyStringBuilder1 {
    private String s;

    public String getS() {
        return s;
    }

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s ;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        MyStringBuilder1 s1=new MyStringBuilder1(this.s+s);
        this.s=this.s+s;
        return s1;
    }

    public MyStringBuilder1 append(int i){
        String iToString=String.valueOf(i);
        MyStringBuilder1 s1=new MyStringBuilder1(this.s+iToString);

        return s1;
    }

    public int length(){
        return this.s.length();
    }

    public char charAt(int index){
        if (index<0)
            System.out.println("error");
        char[] chars=s.toCharArray();
        return chars[index];
    }

    public MyStringBuilder1 toLowerCase(){
        char[] chars=s.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]>=65&&chars[i]<=91)
                chars[i]+=32;
        }
        MyStringBuilder1 s1=new MyStringBuilder1(String.valueOf(chars));
        return s1;

    }

    public MyStringBuilder1 substring(int begin,int end){
        String s2="";
        while (begin<=end){
           s2=s2+String.valueOf(s.charAt(begin));
           begin++;
        }
        MyStringBuilder1 string=new MyStringBuilder1(s2);
        return string;
    }
}
