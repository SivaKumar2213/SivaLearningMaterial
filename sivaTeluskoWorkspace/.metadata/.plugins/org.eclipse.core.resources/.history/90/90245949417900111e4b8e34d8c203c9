package Com.BasicsHibernate.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name="STUDENTDETAILSTABLE")
public class StudentTable {
	
	public StudentTable() {
		
	}
@Id
@GeneratedValue(generator="mySeq",strategy = GenerationType.IDENTITY)//Generate the unique number (Auto Increment) strategy=Identity for Mysql And Sequence for Oracle if we dont know the Database then auto 
@SequenceGenerator(name="mySeq" ,sequenceName="MyOWN_Sequence",initialValue = 100,allocationSize = 200)//IN THIS WE CAN CREATE OUR OWN SEQUENCE LOGIC,name should be mapped with generatedvalue annotation generator
                                                                                                       //sequenceName hibernate will create an table and from the initial value it will increment with the allocation size and insert as 300 in the column
@Column(name="StudentID")                                                                              //Each time it will update the sequence table with addition of 200 if we run second time 500 and if we run third time 700

private Integer Id;
public Integer getId() {
	return Id;
}
@Override
public String toString() {
	return "StudentTable [Id=" + Id + ", name=" + name + ", city=" + city + ", dateOfBirth=" + dateOfBirth + ", age="
			+ age + "]";
}
public void setId(Integer id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
@Column(name="StudentName")
private String name;
@Column(name="StudentCity")
private String city;
@Column(name="StudentDateOfBirth")
private Date dateOfBirth;
@Column(name="StudentAge")
private Integer age;


}
