package COM.JDBC.LEARNING;

public class differenceBetweenStatementAndPrepareStatement {
	// 1) Statement is the parent interface of PreparedStatement

	// 2) While creating a Statement, we do NOT require a SQL query
//	    Example: Statement stmt = connection.createStatement();

	// 3) While creating a PreparedStatement, we MUST provide a SQL query
//	    Example: PreparedStatement ps = connection.prepareStatement("SELECT * FROM emp WHERE id = ?");

	// 4) Statement: You write a new question every time (SQL changes each execution)

	// 5) PreparedStatement: Question is already printed, you only fill answers (values)

	// 6) Statement is slow because every time:
//	    - SQL is parsed
//	    - SQL is compiled
//	    - SQL is executed
//	    If executed 100 times → 100 compilations + 100 executions

	// 7) In Statement, SQL Injection is possible because values are hardcoded
//	    Example:
//	    SELECT * FROM student WHERE id = 1 OR 1=1

	// 8) PreparedStatement is fast because:
//	    - SQL is compiled only once
//	    - Execution happens multiple times
//	    If executed 100 times → 1 compilation + 100 executions

	// 9) In PreparedStatement, SQL Injection is NOT possible
//	    because values are passed dynamically using setters

	// 10) Statement can execute multiple different SQL queries

	// 11) PreparedStatement is tied to ONE SQL structure
//	     but can be executed multiple times with different parameter values
	
//Interviewer OneLine answer(Peffect)
	//Statement executes dynamic SQL strings with repeated compilation,
    //whereas PreparedStatement executes a precompiled SQL structure multiple times with different values, 
	//improving performance and security.
	
}
