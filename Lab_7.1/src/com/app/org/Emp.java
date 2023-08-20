package com.app.org;

public abstract class Emp {

	/*
	 * 3.1 Emp state--- id(int), name, deptId , basic(double) Accept all of above in
	 * constructor arguments. Behaviour ---1. get emp details -- override toString.
	 * 2. compute net salary ---ret 0 (eg : public double computeNetSalary(){return
	 * 0;})
	 */

	private int id;
	private String name, deptId;
	private double basic;

	public Emp(int id, String name, String deptId, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}

	public double getBasic() {
		return basic;
	}

	public abstract double computeNetSalary();

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", deptId=" + deptId + ", basic=" + basic;
	}

}
