package com.annotation.beforeAndAfterinJunit;
//@Test → By default, JUnit creates a NEW test class instance
//for EACH @Test method.
//Because by Default it will be -->@TestInstance(TestInstance.Lifecycle.PER_METHOD)

//If we want to change this behavior, we can use:
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)

//PER_CLASS → Only ONE instance of the test class is created
//and shared across ALL @Test methods.

//When we use PER_CLASS, @BeforeAll and @AfterAll
//can be NON-static methods as well.

//@DisplayName annotation --> we can provide the specific name to the annotation
//@Disable-->If we are working in a test driven development
 //         -->First we will write the test case then we will develop the code
          //-->At that conside we are having 50 Unit test case ,In that 5 are yet to develop we can use 
          //@Disable on top of that test case method so it wont consider for Test Runner and not execute
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestInstanceDemo {
	//class TestInstanceDemo {
	
	TestInstanceDemo(){//2 times will create without using this annotation to class level
		               //(@TestInstance(TestInstance.Lifecycle.PER_CLASS)
		               //Remove this to check
		System.out.println("TestInstanceDemo Instance Created");
	}

	Car car;
	@BeforeAll	
	 void beforeAllMethod() {
		System.out.println("Before All method execute");
	}
	@AfterAll
	 void AftereAllMethod() {
		System.out.println("After All method execute");
	}

	@BeforeEach	
	void beforeEachMethod() {
		 car=new Car();
		System.out.println("Before Each method execute");
	}
	@AfterEach
	void AftereeachMethod() {
		System.out.println("After Each method execute");
	}
		@Test
		@DisplayName(value = "Car Name Display")
		void test_displayCarName() {
			car.displayCarName("Honda");
		}
		@Test
		@Disabled()
		void test_getManufacturedYear() {
			car.getManufacturedYear("2025");
		}


}
