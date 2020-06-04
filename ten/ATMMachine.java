package homework.ten;

import homework.nine.Account;

import java.util.Scanner;

public class ATMMachine {
    int inputId;
    public static void main(String[] args) {
        Account[] accounts=new Account[10];
        faccount(accounts);
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an id:");
        int inputId=input.nextInt();
        while (inputId<0||inputId>10){
            System.out.println("Please enter a right id");
            inputId=input.nextInt();
        }
        menu(accounts,inputId);

    }
    public static void menu(Account[] accounts,int id){
        System.out.println("Main menu");
        System.out.println("1:check balance");
        System.out.println("2:withdraw");
        System.out.println("3:deposit");
        System.out.println("4:exit");
        choice(accounts,id);
    }
    public static void menu(Account[] accounts){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an id:");
        int inputId_=input.nextInt();
//        System.out.println("Main menu");
//        System.out.println("1:check balance");
//        System.out.println("2:withdraw");
//        System.out.println("3:deposit");
//        System.out.println("4:exit");


        menu(accounts,inputId_);
    }

    public static void choice(Account[] accounts,int id){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a choice:");
        int choice=input.nextInt();
        int withdraw=0;
        int deposit=0;
        switch (choice){
            case 1:
                System.out.println("The balance is "+accounts[id].getBalance());
                System.out.println();
                menu(accounts,id);
                break;
            case 2:
                System.out.print("Enter an amount to withdraw: ");
                withdraw=input.nextInt();
                accounts[id].withDraw(withdraw);
                System.out.println();
                menu(accounts,id);
                break;
            case 3:
                System.out.print("Enter an amount to deposit: ");
                deposit=input.nextInt();
                accounts[id].deposit(deposit);
                System.out.println();
                menu(accounts,id);
                break;
            case 4:
                System.out.println();
                menu(accounts);
            default:break;
        }
    }

    public static Account[] faccount(Account[] account){
        //初始化账户
        for(int i=0;i<account.length;i++) {
            account[i] = new Account();
            account[i].setId(i);
            account[i].setBalance(100);
        }
        return account;
    }
}
