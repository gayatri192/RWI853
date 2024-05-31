package com.modifier;

public class AccessModifier {
	
	// Private variable: accessible only within this class
    private int privateVar = 10;

    // Default (package-private) variable: accessible within the same package
    int defaultVar = 20;

    // Protected variable: accessible within the same package and subclasses
    protected int protectedVar = 30;

    // Public variable: accessible from any other class
    public int publicVar = 40;

    // Private method: accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    // Default (package-private) method: accessible within the same package
    void defaultMethod() {
        System.out.println("Default Method: " + defaultVar);
    }

    // Protected method: accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }

    // Public method: accessible from any other class
    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }

    public static void main(String[] args) {
    	AccessModifier demo = new AccessModifier();

        // Accessing variables
        // demo.privateVar; // Error: privateVar has private access in AccessModifier
        System.out.println("Default Variable: " + demo.defaultVar);
        System.out.println("Protected Variable: " + demo.protectedVar);
        System.out.println("Public Variable: " + demo.publicVar);

        // Calling methods
        // demo.privateMethod(); // Error: privateMethod() has private access in AccessModifier
        demo.defaultMethod();
        demo.protectedMethod();
        demo.publicMethod();
    }
}


