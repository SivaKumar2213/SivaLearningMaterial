package com.assertTrue.DAO;

public class junitCourse implements Courses{

	@Override
	public boolean purchasedCourse() {
		System.out.println("Junit Course Purchased");
		return true;
	}

}
