package com.app.core;

import java.time.LocalDate;

public class Student {

	/*
	 * 1. Create a Student class with following
	 * studentId(int),course(string),name,marks,birthDate(LocalDate)
	 */

	private int studentId;
	private String course, name;
	private int marks;
	private LocalDate birthDate;

	public Student(int studentId, String course, String name, int marks, LocalDate birthDate) {
		super();
		this.studentId = studentId;
		this.course = course;
		this.name = name;
		this.marks = marks;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", course=" + course + ", name=" + name + ", marks=" + marks
				+ ", birthDate=" + birthDate + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in equals");
		if (o instanceof Student) {
			Student s = (Student) o;
			return this.studentId == s.studentId && this.birthDate.equals(s.birthDate) && this.course.equals(s.course);
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("in hashcode");
		return this.course.hashCode() + this.birthDate.hashCode();
	}

}
