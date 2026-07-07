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

//Deserialization is
//These bytes can later be converted back into the same object, which is called Deserialization.
public class deserialization {

	public static void main(String[] args) {
		String path="D:\\SivaLearn\\File\\InputOutput\\serializeStudentData.txt";
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		File file1=new File(path);
		try {
			
			fis=new FileInputStream(file1);
			bis=new BufferedInputStream(fis);
			ois=new ObjectInputStream(bis);
			Student st;
			while((st=(Student)ois.readObject())!=null) {
				System.out.println("After deserialization the exact student details from file  ");
                st.display();
			}
			ois.close();
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
