package org.test;

public class HDFCBank implements Bank {
	public void savingAcct()
	{
		System.out.println("6%");
	}
	public void currentAcct() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		Bank b=new HDFCBank();
		b.savingAcct();
		b.currentAcct();
	}

}
