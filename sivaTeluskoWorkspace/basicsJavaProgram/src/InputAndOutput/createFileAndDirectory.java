package InputAndOutput;

import java.io.File;

public class createFileAndDirectory {

	public static void main(String[] args) {
		try {
System.out.println("To Create A Folder Inside The D:\\SivaLearn\\File as InputOutput");
System.out.println("To Create A Folder or File we need to use the File Class with existing method");
File folder=new File("D:\\SivaLearn\\File\\InputOutput");//If InputOutput is already there the folder will be refered to that
System.out.println("To check the InputOutput folder is present or not : "+ folder.exists());
if(!folder.exists()) {
	folder.mkdir();//this will create the folder
}
System.out.println("To check the InputOutput folder is present or not after mkdir executed : "+ folder.exists());
System.out.println("File Creation Started");	
System.out.println("To Create the text file inside the InputOutput folder");
	
File file1=new File("D:\\SivaLearn\\File\\InputOutput\\firstFile.txt");
System.out.println("To check the firstFile.txt is present or not : "+ file1.exists());
if(!file1.exists()) {
	file1.createNewFile();//this will create the new file
}
System.out.println("To check the firstFile.txt is present or not after createNewFile executed : "+ folder.exists());

		}catch(Exception e) {
			System.out.println("Something wengt wrong");
		}
	}

}
