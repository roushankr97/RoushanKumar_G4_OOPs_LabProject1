package com.gl.rk.main;

import java.util.Scanner;

import com.gl.rk.service.CredentialService;

public class Applicaton {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String department = null;
		String company = "companyName";
		Scanner employee = new Scanner(System.in);
		System.out.println("enter your first name");
		firstName = employee.next();
		System.out.println("enter your last name");
		lastName = employee.next();
		System.out.println("Please enter the department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HumanResource");
		System.out.println("4. Legal");
		// TODO Auto-generated method stub
		int option = 0;
		Scanner dept = new Scanner(System.in);
		option = dept.nextInt();
		do {
			switch (option) {
			case 1:
				department = "Technical";
				break;
			case 2:
				department = "Admin";
				break;
			case 3:
				department = "Human Resource";
				break;
			case 4: 
				department = "Legal";
				break;
			default : 
				option = 0;
			}
		}
		while (option==0) ;
		CredentialService credentialService = new CredentialService(); 
		credentialService.generateEmailAddress(firstName,lastName,department,company);
		credentialService.generatePassword();
		credentialService.showCredentials();
	}
}



