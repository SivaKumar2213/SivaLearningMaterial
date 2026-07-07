package InputAndOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//BufferedReader is more efficient and faster compared to FileReader
//because it reduces the number of direct disk reads.
//
//FileReader reads characters directly from the file for every read() call,
//which leads to more I/O operations.
//
//BufferedReader reads a larger block of data into an internal buffer first,
//and then serves the data from memory, improving performance.
//
//We use BufferedReader on top of FileReader to get:
//- FileReader  → reads characters from the file
//- BufferedReader → adds buffering + readLine() support-->read all the character present in a one line
public class BufferedReaderWithFileReader {

	public static void main(String[] args) {
		String path="D:\\SivaLearn\\File\\InputOutput\\bufferWriterFirstFile.txt";
		FileReader reader=null;
		BufferedReader bfReader=null;
        try {
        	File file1=new File(path);
        	reader=new FileReader(file1);
        	bfReader=new BufferedReader(reader);
        	
        	String str=bfReader.readLine();
        	while(str!=null) {
        		System.out.println(str);
        		str=bfReader.readLine();
            	}
        }catch(Exception e) {
        	
        }finally {
        	
        }
	}

}
