package MVC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
private String name;
private int mobileNumber;
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}

private String email;
private String city;
private String password;
private Connection connect=null;
private PreparedStatement pstmt;
private int rowAffected;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public int register() {
	try {
		connect=jdbcUtil.getConnection();
		String sqlQueryInsert="INSERT INTO REGISTERUSERDTAILS(NAME,EMAIL,MOBILE,PASSWORD,CITY) VALUES (?,?,?,?,?)";
		pstmt = connect.prepareStatement(sqlQueryInsert);
		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setInt(3, mobileNumber);
		pstmt.setString(4, password);
		pstmt.setString(5, city);
		rowAffected=pstmt.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return rowAffected;
}

}
