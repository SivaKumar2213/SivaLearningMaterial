package InputAndOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//transient is a keyword used in Java to tell the JVM:Do NOT serialize this variable.
//Serialization means converting an object into a stream of bytes (for saving into a file, sending over network, etc.).
//When you mark a variable as transient, Java skips that variable during serialization.
//We use transient to prevent serialization of fields that:
//1️)Contain sensitive data ->Example: passwords, bank PIN, security tokens
//We don't want these to be written into a file or transferred.
//2️) Are not required to be saved ->Example: temporary calculations, cache values
//They can be recomputed.
//3️)Are derived values->Example: age can be calculated from dob, so no need to store it.
//4️)Cannot be serialized->Example: fields of types like Thread, Socket, FileInputStream
//These classes do not implement Serializable, so marking them transient avoids an exception.
//transient only works during serialization.
//Default values are assigned to transient fields after deserialization:
//    object → null
//     int → 0
//    boolean → false
//     float → 0.0
// transientCan only be applied to variables, not methods or classes.
public class Transient {

	public static void main(String[] args) {
		String path="D:\\SivaLearn\\File\\InputOutput\\serializeStudentData.txt";
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream oos=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		File file1=new File(path);
		try {
			User user=new User(1234,"Siva","Siva@2025");
			fos=new FileOutputStream(file1);
			bos=new BufferedOutputStream(fos);
			oos=new ObjectOutputStream(bos);
			oos.writeObject(user);
			System.out.println("The User object is stored in file in form of Series of Bytes ");
			oos.close();
			bos.close();
			fos.close();
			System.out.println("Before Deserialization Printing the user objects");
			user.displayUser();
			System.out.println("Deserialization Starts to reterive the User Object");
			fis=new FileInputStream(file1);
			bis=new BufferedInputStream(fis);
			ois=new ObjectInputStream(bis);
			User us=(User)ois.readObject();
				System.out.println("After deserialization the exact user details from file but password will be null because of Transient keyword");
				us.displayUser();
			
			ois.close();
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
class User implements Serializable{
	private int userId;
	private String userName;
	transient private String password;
	public User(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public void displayUser() {
		System.out.println("User Id : "+userId);
		System.out.println("User Name : "+userName);
		System.out.println("User Password : "+password);

	}
}