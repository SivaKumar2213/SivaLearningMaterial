package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Finally ,we need to use finally to close the resources 
//irrespective if we get exception or not it will execute finally block
//java 1.8 version made one channge ,if we create the resources inside try block it will close automatically
//for declaring inside the try ,that should be of AutoClosable interface
public class tryWithResources {

	public static void main(String[] args) throws NumberFormatException, IOException {
int num=0;

BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
try {
num=Integer.parseInt(bf.readLine());
}finally {
	bf.close();
}

System.out.println("In java 1.8 onwards");
try(BufferedReader bf1=new BufferedReader(new InputStreamReader(System.in));){
	num=Integer.parseInt(bf.readLine());
}
	}

}
