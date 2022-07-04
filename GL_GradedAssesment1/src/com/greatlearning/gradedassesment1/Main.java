package com.greatlearning.gradedassesment1;

public class Main {

	public static void main(String[] args) {
		AdminDepartment adminDept = new AdminDepartment();
		System.out.println(" Welcome to "+adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());

		HRDepartment hrDept = new HRDepartment();
		System.out.println("\n Welcome to "+hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		TechDepartment techDept = new TechDepartment();
		System.out.println("\n\n Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(" "+techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
	}
}
