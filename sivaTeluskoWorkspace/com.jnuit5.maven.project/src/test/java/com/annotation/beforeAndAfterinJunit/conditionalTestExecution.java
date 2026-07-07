package com.annotation.beforeAndAfterinJunit;
//@EnabledOnOs-->On which OS it should perform
//@EnabledOnJre -->It will execute only if it is a corresponding JRE
//@EnabledForJreRange-->Min and Max JRE version range we can provide

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class conditionalTestExecution {

	

Car car=new Car();

@Test
@DisplayName(value = "Car Name Display")
@EnabledOnOs(OS.WINDOWS)
//@EnabledOnJre(JRE.JAVA_13)
@EnabledForJreRange(min=JRE.JAVA_8,max=JRE.JAVA_21)
void test_displayCarName() {
car.displayCarName("Honda");
}
@Test

void test_getManufacturedYear() {
car.getManufacturedYear("2025");
}

}
