package com.greatlearning.model;

public class DriverClass {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();

		System.out.println("Welcome to Admin Department");
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.print("\n");

		HrDepartment hr = new HrDepartment();

		System.out.println("Welcome to Hr Department");
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.print("\n");

		TechDepartment tech = new TechDepartment();

		System.out.println("Welcome to Tech Department");
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}
}
