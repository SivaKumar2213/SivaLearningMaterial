package com.annotation.beforeAndAfterinJunit;
//We are having an annotation like @BeforeAll,@AfterAll,@BbeforeEach and @AfterEach
//@BeforeAll -->JUnit 5 annotation --> Equivalent to @BeforeClass in JUnit 4
//Must be static (by default),Executes only once
//Runs before all test methods in the class
//Used for one-time setup (DB connection, configuration, etc.)

//@AfterAll --> JUnit 5 annotation-->Equivalent to @AfterClass in JUnit 4
//Must be static (by default) --> Executes only once -->we can use non static refer (TestInstanceDemo program)
//Runs after all test methods in the class
//Used for cleanup (closing DB, releasing resources)

//@BeforeEach-->JUnit 5 annotation-->Equivalent to @Before in JUnit 4
//Does NOT need to be static,Executes before each test method
//Used to prepare fresh test data

//@AfterEach-->JUnit 5 annotation-->Equivalent to @After in JUnit 4
//Does NOT need to be static,Executes after each test method
//Used to reset or clean up after each test

//we cannot create object inside static method because of below reason ,It applies for core java also
//instance methods work without writing this because Java secretly passes it.
//Static methods cannot use instance data because Java does not pass this.
//One-line interview answer
//this is implicitly available only in instance methods; 
//static methods have no this, so they cannot access instance members.



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTestbyBeforeAndAfter {
	Car car;
@BeforeAll	
static void beforeAllMethod() {
	System.out.println("Before All method execute");
}
@AfterAll
static void AftereAllMethod() {
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
	void test_displayCarName() {
		car.displayCarName("Honda");
	}
	@Test
	void test_getManufacturedYear() {
		car.getManufacturedYear("2025");
	}

}
