package InputAndOutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Reading the data in the form of Character
//Disadvantage ->Number of hits to the harddisk is high
public class readDataFromExistingFile {

	public static void main(String[] args) throws IOException {
		String path="D:\\SivaLearn\\File\\InputOutput\\firstFile.txt";
		FileReader reader=null;
try {
	File file1=new File(path);
	reader=new FileReader(file1);
	//From File Reader we can read character by character
	char ch[]=new char[(int) file1.length()];//file 1 .length will provide long so we downCasting to int
	reader.read(ch);//all the character in the file will stored in ch[]
	
	for(char c:ch) {
		System.out.println(c);
	}
	
	
}catch(Exception e) {
	
}finally {
	reader.close();
}
	}

}
