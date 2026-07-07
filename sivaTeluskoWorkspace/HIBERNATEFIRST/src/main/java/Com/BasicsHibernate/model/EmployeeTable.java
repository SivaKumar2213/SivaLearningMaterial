package Com.BasicsHibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class EmployeeTable {
@Id
private Integer EmpId;
private String EmpName;
private Integer EmpAge;
private String EmpSalary;
@Transient   //Annotation is used to Tell hibernate the field is not for database ,The field only ecists in the java object
private String EmpCity;

public EmployeeTable() {
	System.out.println("Zero parametrized Constructor --> Hibernate will create an object internally");
}

public String getEmpCity() {
	return EmpCity;
}
@Override
public String toString() {
	return "EmployeeTable [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge + ", EmpSalary=" + EmpSalary
			+ ", EmpCity=" + EmpCity + "]";
}
public void setEmpCity(String empCity) {
	EmpCity = empCity;
}
public Integer getEmpId() {
	return EmpId;
}
public void setEmpId(Integer empId) {
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public Integer getEmpAge() {
	return EmpAge;
}
public void setEmpAge(Integer empAge) {
	EmpAge = empAge;
}
public String getEmpSalary() {
	return EmpSalary;
}
public void setEmpSalary(String empSalary) {
	EmpSalary = empSalary;
}

}
