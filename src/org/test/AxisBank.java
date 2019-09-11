package org.test;
 
public class AxisBank implements Bank {
	public void savingAcct() {
		System.out.println("5%");
	}
	public void currentAcct() {
		System.out.println("10%");
	}
	public static void main(String[] args) {
		Bank b=new AxisBank();
		b.savingAcct();
		b.currentAcct();
	}

}
