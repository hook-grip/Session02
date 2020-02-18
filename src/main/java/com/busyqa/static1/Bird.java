package com.busyqa.static1;

public class Bird {

	static String name;
	String color;
	double weigth;
	
	static void changeName(String s){
		name = s;
		
	}
	
	 void changeName2(String s){
		name = s;
		Bird.changeName(s);
	}
	
	public static void main(String[] args) {
		name = "busyQA";
		changeName("1");
		
		Bird bird1 = new Bird();
		bird1.color = "blue";
		
		Bird bird2 = new Bird();
		bird2.name = "busyQA2";
		
		bird1.name = "busyQA";
		
		System.out.println(bird2.name);
		
		Bird.changeName("1");
		
	}
}
