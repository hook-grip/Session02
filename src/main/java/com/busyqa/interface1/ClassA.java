package com.busyqa.interface1;

interface InterfaceA {
	
	void doSomething();
}

class ClassX implements InterfaceA{

	
	public void hiddenMethod() {
		
	};
	
	@Override
	public void doSomething() {
	  //do something important
		int a = 4;
	}
}

public class ClassA {

	public static void main(String[] args) {
		
		InterfaceA a = new ClassX();
		
		a.doSomething();
		//a.hiddenMethod();
		
		ClassX b = new ClassX();
		b.hiddenMethod();
	}
}
