package com.folders.hrdb;

import com.folders.hrdb.service.HrService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//@SpringBootApplication
public class HrdbApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HrdbApplication.class, args);

		HrService hrService = new HrService();

		Scanner inSurname = new Scanner(System.in);
		System.out.println("enter a surname");
		String surnameScan = inSurname.next();
		Scanner inFirstname = new Scanner(System.in);
		System.out.println("enter a firstname");
		String firstnameScan = inFirstname.next();
		Scanner inCompany = new Scanner(System.in);
		System.out.println("enter a company");
		String companyScan = inCompany.next();
		Scanner inTelefon = new Scanner(System.in);
		System.out.println("enter a telefon");
		String telefonScan = inTelefon.next();

		String[] arrayHrData = new String[4];
		arrayHrData[0] = surnameScan;
		arrayHrData[1] = firstnameScan;
		arrayHrData[2] = companyScan;
		arrayHrData[3] = telefonScan;

		hrService.creatHrData(arrayHrData);
	}
}
