package homework.eleven;
import homework.nine.Account;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : SavingAccount.java
//  @ Date : 2020/4/20
//  @ Author : 
//
//




public class SavingAccount extends Account {
	public SavingAccount(int id, double balance) {
		super(id, balance);
	}

	public void noOverdraft(){
		if (getBalance()==0){
		System.out.println("余额不足");
		}
	}
	@Override
	public String toString() {
		return "SavingAccount{id="+ getId()+
				", annualInterestRate=" + getAnnualInterestRate()+
				", dateCreated=" + getDateCreated() +
				"no overdraftAmount"+'}';
	}


}
