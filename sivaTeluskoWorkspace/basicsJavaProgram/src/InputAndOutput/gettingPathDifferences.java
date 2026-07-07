package InputAndOutput;
//Symbol	Meaning
//.	        current directory
//..	    parent directory

//EASY MEMORY TRICK
//Method	             Meaning	                     SimpleExplanation
//getPath()	             What you typed	                Returns same string
//getAbsolutePath()	     Full location	                Adds C:\… but keeps messy parts
//getCanonicalPath()	 Real Clean Path	            Removes .. & . → final true path
import java.io.File;
import java.io.IOException;

public class gettingPathDifferences {

	public static void main(String[] args) throws IOException {
		File f = new File("docs/../test.txt");
		System.out.println(f.getPath());
		
		File f1 = new File("docs/../test.txt");
		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("docs/../test.txt");
		System.out.println(f2.getCanonicalPath());
		
	}

}
