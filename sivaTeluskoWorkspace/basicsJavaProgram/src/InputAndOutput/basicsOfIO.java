package InputAndOutput;
//When executing Java code, the JVM stores variables and method calls in the Stack,
//and objects are stored in the Heap. The Heap and Stack are both parts of RAM,
//so the data stored there is temporary.

//After the execution of a method is completed, the Stack frame is removed.
//Objects in the Heap are removed later by the Garbage Collector,
//but only if they are no longer referenced. JVM does NOT immediately delete
//all objects after execution — garbage collection happens automatically.

//If we want our Java program to store data permanently (not in RAM),
//such as saving to a Hard Disk or interacting with a database (DBMS),
//we need to use IO mechanisms.

//For file operations, we use the classes inside the java.io package
//(and also java.nio package in modern Java).

//Using IO, we can write data to a file located on the Hard Disk,
//and whenever needed, we can read that data back into our program.
public class basicsOfIO {

	public static void main(String[] args) {

	}

}
