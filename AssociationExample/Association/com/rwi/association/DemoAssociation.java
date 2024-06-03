package com.rwi.association;

import java.util.ArrayList;
import java.util.List;

class Mobile{
	private long mobileno;
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Mobile [mobileno=" + mobileno + "]";
	}
}

class EmployeeDetails{
	 private String name;
	 List<Mobile> mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + "]";
	}  }


public class DemoAssociation {

	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		 emp.setName("Mohini Gorane\n");
		  Mobile num=new Mobile();
		  num.setMobileno(957961494);
		  Mobile num1=new Mobile();
		  num1.setMobileno(879654903);
		   
		   List<Mobile>numlist=new ArrayList<Mobile>();
		   numlist.add(num);
		   numlist.add(num1);
		    emp.setMobile(numlist);  
		   System.out.println(emp.getName()+""+ emp.getMobile());
		    
	}
}


