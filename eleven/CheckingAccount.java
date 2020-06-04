package homework.eleven;//
import homework.nine.Account;
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : CheckingAccount.java
//  @ Date : 2020/4/20
//  @ Author : 
//
//




public class CheckingAccount extends Account {

	private int overdraftableAmount =10000;
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}

	public int getOverdraftableAmount() {
		return overdraftableAmount;
	}

	public void permitOverdraft(){
		if (getBalance()==0){
			System.out.println("您卡内余额为 0 的可透支金额为 "+ overdraftableAmount);
		}
		double overdraftAmount=overdraftableAmount - getBalance();
		if (getBalance()<0) {
			System.out.println("您卡内余额为 0 可透支金额为 " +overdraftAmount);
		}
	}

	@Override
	public String toString() {
		return "CheckingAccount{id=" + getId() +
				", balance=" + getBalance() +
				", annualInterestRate=" + getAnnualInterestRate()+
				", dateCreated=" + getDateCreated() +
				"overdraftableAmount=" + overdraftableAmount +
				'}';
	}
}
