/*
 * 	Josh Stone
 * 	3/32/2025
*/

package com.example.speedsters1_0;

import java.util.ArrayList;

interface AccountInterface {
	
	void removeAccount(Account account);
	ArrayList<Account> getAccountList();
	void updateEmail(String email);
	void updatePhoneNum(String phoneNum);
	void addAccount(Account account);
	void changePW(String password);
	void changeUN(String username);
	void changeName(String name);
	void deleteAccount();
	void mergeAccounts();

	String getUsername();

	String getPassword();
	boolean verifyCredentials(String username, String password);
}

public class Account implements AccountInterface{

	String Name = "";
	String Email = "";
	String UserName = "";
	String Password = "";
	String PhoneNum = "";
	//Address myAddress = null;
	ArrayList<Account> AccountList = new ArrayList<>();


	@Override
	public ArrayList<Account> getAccountList() {
		return AccountList;
	}

	//Constructor
	public Account() {

	}

	@Override
	public void addAccount(Account account) {
		AccountList.add(account);
	}

	@Override
	public void removeAccount(Account account) {
		AccountList.remove(account);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyCredentials(String username, String password) {

		for (Account accounts : AccountList) {
			if (accounts.getUsername().equals(username) && accounts.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void changePW(String password) {
		// TODO Auto-generated method stub
		Password = password;
	}

	@Override
	public void changeUN(String username) {
		// TODO Auto-generated method stub
		UserName = username;
	}

	@Override
	public void changeName(String name) {
		// TODO Auto-generated method stub
		Name = name;
	}

	@Override
	public void updateEmail(String email) {
		Email = email;
	}

	@Override
	public void updatePhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		//remove account
	}

	@Override
	public void mergeAccounts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUsername() {
		return UserName;
	}

	@Override
	public String getPassword() {
		return Password;
	}

	

}
