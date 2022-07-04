package com.greatlearning.gradedassesment1;

public class HRDepartment extends SuperDepartment {
		public String departmentName() {
			return "Hr Department ";
		}
		public String getTodaysWork() {
			return "Fill today's worksheet and mark your attendance";
		}
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		public String isTodayAHoliday() {
			return super.isTodayAHoliday();
		}
		
		public String doActivity() {
			return "team Lunch";
		}

}
