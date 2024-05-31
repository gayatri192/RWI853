package com.meth;

public class JavaMethod {
	
// Instance Variable
	int x=25 ,y=20;
	
// Instance Method
	
	// method without return-type and without argument
	void addition() {
		System.out.println("10 +20 = "+(10+20));
	}
	
	// method with return-type and without argument
	int substraction() {
		return x-y;  // Instance Variables can directly access inside Instance Method
	}
	
	// method without return-type and with argument
	void multiplication(int x,int y) {
		System.out.println(x+" x "+y+" = "+(x*y));
	}
	
	// method with return-type and with argument
	float division(int x,int y) {
		return x/y;
	}
	
	// method call : instance method and static method
	void callInstanceStaticMethod() {
		addition(); // invoke instance method inside instance method directly
		//JavaMethods.addition();
		JavaMethod obj=new JavaMethod();
		obj.multiplication(x, y); // invoke instance method inside instance method using object
		
		staticMethod(); // invoke static method inside instance method directly
		JavaMethod.staticMethod(); // invoke static method inside instance method using class name
		obj.staticMethod(); // invoke static method inside instance method using class object
	}
	

// Static Method
	static void staticMethod() {
		System.out.println("Static Method");
		}
	

	public static void main(String[] args) {
		JavaMethod obj=new JavaMethod();
		
// call instance method inside static method using class object 
		obj.addition(); 
		int result=obj.substraction();
		System.out.println(obj.x+" - "+obj.y+" = "+result);
		obj.multiplication(result, 9);
		float divResult=obj.division(obj.x,obj.y);
		System.out.println(obj.x+" / "+obj.y+" = "+divResult);
	}
}
		

