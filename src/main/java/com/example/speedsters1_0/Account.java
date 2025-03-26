/*
 * 	Josh Stone
 * 	3/32/2025
*/

package com.example.speedsters1_0;

interface AccountInterface {
	
	String Name = "";
	String Email = "";
	String UserName = "";
	String Password = "";
	int PhoneNum = 999999999;
	//Address myAddress = null;
	
	String changePW();
	String changeUN();
	String changeName();
	void deleteAccount();
	void mergeAccounts();
	
}

public class Account implements AccountInterface{
	
	//Constructor
	public Account() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String changePW() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeUN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mergeAccounts() {
		// TODO Auto-generated method stub
		
	}

}
