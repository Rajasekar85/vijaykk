package org.bank;

public class AxisBank extends BankInfo {
	
	

	public void deposit()
	
	{
		super.fixed();
System.out.println("deposit amount is 50000");
	}
	public static void main(String[] args) {
		AxisBank axe= new AxisBank();
		axe.saving();
		
		axe.deposit();
		
	}
}
