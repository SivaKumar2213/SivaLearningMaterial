package InputAndOutput;

import java.io.File;

//we can use many inbuilt methods of File Class
//1)isDirectory --> will return true if the specified path is Folder or false
//2)isFile -->will return true if the specified path is file or false
//3)path --> will return the complete path 
//4)absolutePath -->
//list --> will return the list of file present inside the path in String []
public class moreOnFileClass {

	public static void main(String[] args) {
		try {
		File file1=new File("D:\\SivaLearn\\File\\InputOutput\\secondFile.txt");
		File file2=new File("D:\\SivaLearn\\File\\InputOutput\\thirdFile.txt");
		if(!file1.exists()) {
			file1.createNewFile();//this will create the new file
		}
		if(!file2.exists()) {
			file2.createNewFile();//this will create the new file
		}
		System.out.println("Is File  : "+file1.isFile());
		System.out.println("Is Folder  : "+file1.isDirectory());
		System.out.println("Path : "+file1.getPath());
		System.out.println("Absolute Path : "+file1.getAbsolutePath());
		System.out.println("Absolute File : "+file1.getAbsoluteFile());
		System.out.println("Parent File : "+file1.getParent());
		System.out.println("Get the File Name  : "+file1.getName());
		File folder =new File("D:\\SivaLearn\\File\\InputOutput");

		String str[]=folder.list();
		int count=0;
		for(String name : str) {
			count++;
			System.out.println(name);
		}
System.out.println("Total Number of File present in folder is : "+count);
		
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}

}
