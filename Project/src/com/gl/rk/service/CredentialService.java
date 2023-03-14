package com.gl.rk.service;

import java.util.Random;

public class CredentialService {
	private String Email;
	private String Password;
	public void generateEmailAddress(String firstName,String lastName,String department,String company) {
		this.Email = firstName+lastName+"@"+department+company+".com";
	}


	public  String generatePassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*()_+";
		String numbers = "0123456789";
		String password ="";
		Random random = new Random();
		password += capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password += capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password += lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password += lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password += numbers.charAt(random.nextInt(numbers.length()));
		password += numbers.charAt(random.nextInt(numbers.length()));
		password += specialCharacters.charAt(random.nextInt(specialCharacters.length())); 
		this.Password = password;
		return new String(password);
	}
	public void showCredentials() {
		System.out.println("Generated Credentials:");
		System.out.println("Email Address: " + Email);
		System.out.println("Password: " + Password);
	}

}








