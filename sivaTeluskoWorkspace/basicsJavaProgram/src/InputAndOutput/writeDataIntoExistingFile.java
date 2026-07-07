package InputAndOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//Writting the data in the form of Character
//Dis advantage ->Number of hits to the harddisk is high
public class writeDataIntoExistingFile {

	public static void main(String[] args) throws IOException {
String path="D:\\SivaLearn\\File\\InputOutput\\firstFile.txt";
String path1="D:\\SivaLearn\\File\\InputOutput\\secondFile.txt";
		FileWriter writer=null;
		FileWriter writer1=null;
		try {
			File file1=new File(path);
			writer=new FileWriter(file1);//if we pass true here it will not replace 
                                           //the existing content in the file
                                           //like file 2
			 
			writer.write("Siva is First File written");
			writer.write("\n");//to write the value in the next line
			char ch[]= {'b','y'};
			writer.write(ch);
			writer.write("\n");
			writer.write(97);//it will convert the 97 to small a
			writer.write("\n");
			writer.write("java program");
			
			System.out.println("In second file in writer 1 object if we pass true ,if we are trying");
			System.out.println("to change any content it will not change the existing one");
			System.out.println("First time i am running with the content Java Program");
			System.out.println("after that i will change  the content to Java Programming");
			File file2=new File(path1);
			writer1=new FileWriter(file2,true);
			writer1.write("\n");
			writer1.write("Siva is Second File written");
			writer1.write("\n");//to write the value in the next line
			char ch1[]= {'b','y'};
			writer1.write(ch1);
			writer1.write("\n");
			writer1.write(97);//it will convert the 97 to small a
			writer1.write("\n");
			writer1.write("java programming");
			
		}catch(Exception e) {
			
		}finally {
			writer.close();
			writer1.close();
		}
	}

}
