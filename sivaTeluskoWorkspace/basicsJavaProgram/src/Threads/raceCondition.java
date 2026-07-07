package Threads;
//If two threads are working on same variable and same method we will loose some data
//That is called Thread + Mutation
//Join --> will ask the main thread to wait until the t1 and t2 to complete 
//but at that time also it wont print 2000 because two threads can execute the same method at the same time
//at the time iteration will be done two times but increment will done only once
//same thing we had done in the other class but used synchronized
//synchronized ,only one thread can access at the same time
public class raceCondition {

	public static void main(String[] args) throws InterruptedException {
		counter c=new counter();
		counter1 c1=new counter1();
		
		Runnable obj1 =()->{
			for(int i=0;i<10000;i++) {
				c.increment();
			}
		};
		Runnable obj2 =()->{
			for(int i=0;i<10000;i++) {
				c.increment();
			}
			
		};
		
		Runnable obj3 =()->{
			for(int i=0;i<10000;i++) {
				c1.increment1();
			}
		};
		Runnable obj4 =()->{
			for(int i=0;i<10000;i++) {
				c1.increment1();
			}
			
		};
		
		  Thread t1=new Thread(obj1); 
		  Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		Thread t4=new Thread(obj4);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		System.out.println("without synchronized"+c.count);
		System.out.println("with synchronized"+c1.count);
	}

}
class counter{
	int count;
	public void increment() {
		count++;
	}
}
class counter1{
	int count;
	public synchronized void increment1() {
		count++;
	}
}