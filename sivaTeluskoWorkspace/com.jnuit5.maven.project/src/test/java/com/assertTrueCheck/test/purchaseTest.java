package com.assertTrueCheck.test;
//assertTrue -> True -->pass
//assertTrue -> False -->Fail

//assertFalse -> True -->Fail
//assertTrue -> False -->Pass

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.assertTrue.DAO.javaCourse;
import com.assertTrue.DAO.junitCourse;
import com.assertTrue.DAO.sqlCourse;
import com.assertTrue.Service.PurchasedCourse;

class purchaseTest {

	@Test
	void test() {
		PurchasedCourse pc=new PurchasedCourse();
		assertTrue(pc.coursePurchased(new javaCourse()));
		assertTrue(pc.coursePurchased(new sqlCourse()));
		assertTrue(pc.coursePurchased(new junitCourse()));
		
		System.out.println("By using Assert False");
		
		assertFalse(pc.coursePurchased(new javaCourse()));//once the test is failed it will stop executing the remaining statement
		assertFalse(pc.coursePurchased(new sqlCourse()));
		assertFalse(pc.coursePurchased(new junitCourse()));
		
	}

}
