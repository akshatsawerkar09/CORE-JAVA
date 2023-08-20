package com.app.core;

import java.util.Date;
import static utils.EmpValidationConstraints.sdf;

public class Emp {

	private int id;
	private String name;
	private double salary;
	private Date joinDate;
	// dept
	private Department dept;
	// one to one association between emp and adharCard : composition
	private AdharCard card;

	public Emp(int id, String name, double salary, Date joinDate, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", joinDate=" + sdf.format(joinDate)
				+ ", dept=" + dept + ", card=" + card + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("In emp equals");
		if (o instanceof Emp) {
			Emp e = (Emp) o;
			return this.id == e.id && this.name.equals(e.name);
		}
		return false;

	}

	// getter for card creation date
	public Date getCreationDate() {
		return card.creationDate;
	}

	// add a method to link adhar card details to emp
	public void linkAdharCard(String cardNo, Date creationDate, String location) {
		this.card = new AdharCard(cardNo, creationDate, location);
	}

	// non static nested class : inner class
	private class AdharCard {

		private String cardNo;
		private Date creationDate;
		private String location;

		public AdharCard(String cardNo, Date creationDate, String location) {
			super();
			this.cardNo = cardNo;
			this.creationDate = creationDate;
			this.location = location;
		}

		@Override
		public String toString() {
			return "AdharCard [cardNo=" + cardNo + ", creationDate=" + sdf.format(creationDate) + ", location="
					+ location + "]";
		}

	}

}
