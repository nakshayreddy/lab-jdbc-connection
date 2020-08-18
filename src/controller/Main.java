package controller;


import utility.ConnectionManager;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String args[])  throws Exception {
		
		ConnectionManager cm=new ConnectionManager();
		ConnectionManager.getConnection();
		if(cm!=null)
		{
			System.out.println("Connection Established.");
		}
		else
		
		{
			System.out.println(" Check your Connection.");
		}
		
		
		
	// Fill your code
		
	}
}
