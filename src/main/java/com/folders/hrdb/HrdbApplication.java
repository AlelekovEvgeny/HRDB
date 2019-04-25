package com.folders.hrdb;

import com.folders.hrdb.entity.Hr;
import com.folders.hrdb.service.HrService;

import java.util.Scanner;

public class HrdbApplication {

	public static void main(String[] args) {
		HrService hrService = new HrService();

		Scanner inSurname = new Scanner(System.in);
		System.out.println("enter a surname");
		String surnameScan = inSurname.next();
		Scanner infirstName = new Scanner(System.in);
		System.out.println("enter a firstName");
		String firstNameScan = infirstName.next();
		Scanner inCompany = new Scanner(System.in);
		System.out.println("enter a company");
		String companyScan = inCompany.next();
		Scanner intelephone = new Scanner(System.in);
		System.out.println("enter a telephone");
		String telephoneScan = intelephone.next();

		Hr hr = new Hr(surnameScan,firstNameScan,companyScan,telephoneScan);
		hrService.saveHr(hr);
	}
}