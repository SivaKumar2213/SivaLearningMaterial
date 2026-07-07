package Threads;
//Runnable is an functional Interface
//which is being implemented by Thread class
//we can create a Thread with runnable interface also because ,if your scenario is like 
    //-->Your class want to extend another class so at the time we cant extend Thread class because multiple inheritance
  //so you can extend a class and implements runnable interface
//Instead of creating a separate class we are going to use anonymous class and lambda expression
public class runnable {
	public static void main(String[] args) {
Runnable obj1 =()->{
	for(int i=1;i<10;i++) {
		System.out.println("Thread 1 Execute");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
};
Runnable obj2 =()->{
	for(int i=1;i<10;i++) {
		System.out.println("Thread 2 Execute");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
};
new Thread(obj1).start(); // Start thread 1
new Thread(obj2).start(); // Start thread 2
	}

}
