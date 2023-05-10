package org.add;

import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter yout ID: ");
		int d=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your Name ");
		String d1=scanner.nextLine();
		System.out.println("Enter your Email");
		String d2=scanner.nextLine();
		System.out.println("Enter your Mobileno:");
		long d3=scanner.nextLong();
		System.out.println("Enter your salary:");
		int d4=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your Gender:");
		String d5=scanner.nextLine();
		System.out.println("Enter your City:");
		String d6=scanner.nextLine();
		System.out.println("empID:"+d);
		System.out.println("empName:"+d1);
		System.out.println("empEmail:"+d2);
		System.out.println("empPhone:"+d3);
		System.out.println("empsalary:"+d4);
		System.out.println("empGender:"+d5);
		System.out.println("empcity:"+d6);
	}

}
