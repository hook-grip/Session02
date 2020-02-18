package com.busyqa.object;

class Employee {
	
	int eid;
	String ename;
	double sal;
	String job;
	
	public Employee() {
	}
	
	public Employee(int eid, String ename, double sal,String job) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.job = job;	
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(job);
	}

	void bonus() {
		System.out.println((sal * 10) / 100);
	}
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee(1030,"John2",90000,"Manager2");
		
		emp1.setEid(1020);
		
		emp1.ename="John";
		emp1.sal=80000;
		emp1.job="Manager";

		//emp1.display();
		emp2.display();

	}
}
