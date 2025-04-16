/*
 * 	Josh Stone
 * 	3/32/2025
*/

package com.example.speedsters1_0;

import java.util.ArrayList;

interface AccountInterface {

	void removeAccount(Account account);
	ArrayList<Account> getAccountList();
	//String updateEmail(String email);
	String changeEmail(String newEmail);
	String changePhoneNumber(String newPhoneNumber);
	//void updatePhoneNum(String phoneNum);
	void addAccount(Account account);
	void changePW(String password);
	String changeUN(String username);
	String changeName(String name);
	void deleteAccount();
	//void mergeAccounts();
	String getUsername();
	String getPassword();
	boolean verifyCredentials(String username, String password);

}

public class Account implements AccountInterface{
	private int id;
	private String name;
	private String password;
	private String email;
	private String username;
	private String phoneNumber;
	ArrayList<Account> AccountList = new ArrayList<>();
	//Constructor
	public Account(String name, String password, String username, String email, String phoneNumber) {
		this.id = 5;//someway to generate unique ids
		this.name = name;
		this.password = password;
		this.email = email;
		this.username = username;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public ArrayList<Account> getAccountList() {
		return AccountList;
	}
	int getId(){
		return id;
	}
	@Override
    public String getUsername(){
		return username;
	}
	String getName(){
		return name;
	}
	String getEmail(){
		return email;
	}
	String getPhoneNumber(){
		return phoneNumber;
	}

	@Override
	public void addAccount(Account account) {
		AccountList.add(account);
	}

	@Override
	public void removeAccount(Account account) {
		AccountList.remove(account);
	}

	public Account getAccountByCredentials(String username, String password) {
		for (Account account : AccountList) {
			if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
				return account;
			}
		}
		return null;
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
	public void changePW(String newPassword) {
		this.password = newPassword;

	}

	@Override
	public String changeUN(String newUsername) {
		this.username = newUsername;
		return username;
	}

	@Override
	public String changeName(String newName) {
		this.name = newName;
		return name;
	}
	@Override
	public String changeEmail(String newEmail){
		this.email = newEmail;
		return email;
	}
	@Override
	public String changePhoneNumber(String newPhoneNumber){
		this.phoneNumber = newPhoneNumber;
		return phoneNumber;
	}

//	@Override
//	public void updatePhoneNum(String phoneNum) {
//		PhoneNum = phoneNum;
//	}
	@Override
	public void deleteAccount() {
		//
		//remove account
	}

	//@Override dont think we need this in the account section but we will see
	//public void mergeAccounts() {
	//	// TODO Auto-generated method stub
		
	//}



	@Override
	public String getPassword() {
		return password;
	}



}
