package homework.eleven;

import homework.nine.Account;

public class Test {

    public static void main(String[] args) {
        CheckingAccount checkingAccount=new CheckingAccount(1122,20000);
        checkingAccount.setAnnualInterestRate(4.5);
        checkingAccount.deposit(3000);
        checkingAccount.withDraw(2500);
        System.out.println("余额为: " + checkingAccount.getBalance());
        System.out.println("可透支的余额为："+checkingAccount.getOverdraftableAmount());
        System.out.println("月利息为: " + checkingAccount.getMonthlyInterestRate());
        System.out.println("账户的开户日期为: " + checkingAccount.getDateCreated());
        System.out.println(checkingAccount.toString());
        System.out.println("******************分割线***************");
        SavingAccount savingAccount=new SavingAccount(1,20000);
        savingAccount.setAnnualInterestRate(4.5);
        savingAccount.deposit(3000);
        savingAccount.withDraw(2000);
        System.out.println("余额为: " + savingAccount.getBalance());
        System.out.println("月利息为: " + savingAccount.getMonthlyInterestRate());
        System.out.println("账户的开户日期为: " + savingAccount.getDateCreated());
        System.out.println(checkingAccount.toString());





//        Triangle triangle=new Triangle(3,4,5);
//        triangle.setColor("红色");
//        triangle.setFilled(true);
//        System.out.println("三角形的面积: "+triangle.getArea());
//        System.out.println("三角形的周长: "+triangle.getPerimeter());
//        System.out.println("三角形的颜色: "+triangle.color);
//        System.out.println("三角形是否填充: "+triangle.isFilled());
//        System.out.println("创建时间"+triangle.getDateCreated());

//    Course course=new Course("java");
//    course.addStudent("张三");
//    course.addStudent("李四");
//    course.addStudent("王五");
//    System.out.print("选择"+course.getCourseName()+"的学生人数"+course.getNumberOfStudents()+" 学生姓名: "+course);
//    System.out.println();
//
//    course.dropStudent("张三");
//    System.out.print("选择"+course.getCourseName()+"的学生人数"+course.getNumberOfStudents()+" 学生姓名: "+course+"\n");
//
//    System.out.println(course);

    }

    }

