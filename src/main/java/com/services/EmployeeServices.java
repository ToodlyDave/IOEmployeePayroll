package com.services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.entities.EmployeePayroll;

public class EmployeeServices {

	public static void main(String[] args) {

		EmployeePayroll employee = new EmployeePayroll();
		Scanner scan = new Scanner(System.in);

		System.out.print(" Please enter the name of the employee: ");
		String name = scan.next();

		System.out.print(" Please enter the id of the employee: ");
		int id = scan.nextInt();

		System.out.print(" Please enter the salary of the employee: ");
		double salary = scan.nextDouble();

		employee.setName(name);
		employee.setId(id);
		employee.setSalary(salary);

		try {
			FileWriter write = new FileWriter("src/main/resources/output.txt");
			write.write(employee.toString());
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scan.close();

	}
}
