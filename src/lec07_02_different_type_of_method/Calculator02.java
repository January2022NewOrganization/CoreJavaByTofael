package lec07_02_different_type_of_method;

public class Calculator02 {
	// Global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 54;
	int b = 21;
	
	// return type method
	public int addition() {
		int total1 = a+b;
		System.out.println("Addition of a and b is: "+total1);
		return total1;
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}

	

}
