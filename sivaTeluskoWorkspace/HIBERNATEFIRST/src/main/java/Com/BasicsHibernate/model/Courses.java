package Com.BasicsHibernate.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Courses {
	
@Id
@GeneratedValue( generator = "course", strategy = GenerationType.IDENTITY)
@SequenceGenerator(name = "course",sequenceName = "course_my_seq",initialValue = 100,allocationSize = 1)
private Integer courseId;
private String courseName;
private String courseAmount;
@ManyToMany(cascade = CascadeType.ALL)
private Set<Students> studentSet;
public Integer getCourseId() {
	return courseId;
}
public void setCourseId(Integer courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseAmount() {
	return courseAmount;
}
public void setCourseAmount(String courseAmount) {
	this.courseAmount = courseAmount;
}
public Set<Students> getStudentSet() {
	return studentSet;
}
public void setStudentSet(Set<Students> studentSet) {
	this.studentSet = studentSet;
}

}
