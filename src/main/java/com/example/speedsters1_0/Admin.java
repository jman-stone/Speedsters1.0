package com.example.speedsters1_0;

interface AdminInterface{
	
	int adminLevel = 0;
	
	void mergeAccounts();
}

public class Admin extends Account implements AdminInterface {

	//Constructor
	public Admin() {
		
	}
	
	@Override
	public void mergeAccounts() {
		// TODO Auto-generated method stub
		
	}
	
}
