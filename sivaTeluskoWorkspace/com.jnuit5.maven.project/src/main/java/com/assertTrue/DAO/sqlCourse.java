package com.assertTrue.DAO;

public class sqlCourse implements Courses{

	@Override
	public boolean purchasedCourse() {
		System.out.println("Sql Course Purchased");
		return true;
	}

}
