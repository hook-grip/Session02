package com.busyqa.inheritance;

class Parent{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}

class Child extends Parent{

	Child(){
		super();
	}
	@Override
	public void setAge(int age) {
		
	}	
	
	public void doSomething() {
		super.setAge(4);
	}
	
	public static void main(String[] args) {
		
	}
	
}

class Child2 extends Parent{
	
	
}


public class single {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.setName("busyQA");
	}
}
