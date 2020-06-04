package homework.ten;


public class Test {
    public static void main(String[] args) {
//        MyString2 m1=new MyString2("qwerty");
//        MyString2 m2=new MyString2("Qwerty");
//        System.out.println("比较"+m1.compare("qwerty"));
//        System.out.println("比较"+m1.compare("Qwerty"));
//        System.out.println("取子字符串"+ m1.substring(2));
//        System.out.println("大写"+m1.toUpperCase());
//        System.out.println("变成数组");
//        for (int i=0;i<m1.toChars().length;i++){
//            System.out.print(m1.toChars()[i]+" ");
//        }
//        System.out.println();
//        System.out.println(MyString2.valueOf(true));

        MyStringBuilder1 s=new MyStringBuilder1("123XGweASDW");
        System.out.println(s.toString());
        MyStringBuilder1 s1=new MyStringBuilder1("fs");
        System.out.println(s.append(s1));
        System.out.println(s.length());
        System.out.println(s.append(1));
        System.out.println(s.toLowerCase().toString());
        System.out.println(s.substring(3,6));
        }
    }
