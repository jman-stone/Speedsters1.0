/*
 * 	Josh Stone
 * 	3/32/2025
*/

package com.example.speedsters1_0;

interface AccountInterface {
	
	 String name;
	 String email;
	 String username;
	 String password;
	 int phoneNumber;
	 int id;
	//Address myAddress = null;
	
	String changePW(String p);
	String changeUN(String u);
	String changeName(String u);
	String changeEmail(String u);
	int changePhoneNumber(int x);
	void deleteAccount();
	void mergeAccounts();
	
}

public class Account implements AccountInterface{
	private int id;
	private String name;
	private String password;
	private String email;
	private String username;
	private int phoneNumber;
	//Constructor
	public Account(String name, String password, String email, String username, int phoneNumber) {
		this.id = //someway to generate unique ids
		this.name = name;
		this.password = password;
		this.email = email;
		this.username = username;
		this.phoneNumber = phoneNumber;
	}

	int getId(){
		return id;
	}
	String getUsername(){
		return username;
	}
	String getName(){
		return name;
	}
	String getEmail(){
		return email;
	}
	int getPhoneNumber(){
		return phoneNumber;
	}

	@Override
	public String changePW(String newPassword) {
		this.password = newPassword;
		return null;
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
	}
	@Override
	public int changePhoneNumber(int newPhoneNumber){
		this.phoneNumber = newPhoneNumber;
	}

	@Override
	public void deleteAccount() {
		//
		
	}

	//@Override dont think we need this in the account section but we will see
	//public void mergeAccounts() {
	//	// TODO Auto-generated method stub
		
	//}

}
