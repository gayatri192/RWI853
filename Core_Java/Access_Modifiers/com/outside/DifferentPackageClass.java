package com.outside;

import com.modifier.AccessModifier;

public class DifferentPackageClass {
	
	 public void accessPublicMember() {
	        AccessModifier demo = new AccessModifier();

	        // Accessing members
	        // System.out.println("Private Variable: " + demo.privateVar); // Error: privateVar is not accessible
	        // System.out.println("Default Variable: " + demo.defaultVar); // Error: defaultVar is not accessible
	        // System.out.println("Protected Variable: " + demo.protectedVar); // Error: protectedVar is not accessible
	        System.out.println("Public Variable: " + demo.publicVar);

	        // Calling methods
	        // demo.privateMethod(); // Error: privateMethod() is not accessible
	        // demo.defaultMethod(); // Error: defaultMethod() is not accessible
	        // demo.protectedMethod(); // Error: protectedMethod() is not accessible
	        demo.publicMethod(); // Only public method is accessible
	    }

	    public static void main(String[] args) {
	        DifferentPackageClass differentPackage = new DifferentPackageClass();
	        differentPackage.accessPublicMember();
	    }

}
