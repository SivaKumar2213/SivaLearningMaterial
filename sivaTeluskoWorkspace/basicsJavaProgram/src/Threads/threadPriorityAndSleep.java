package Threads;
//Thread Priority - is starts from 1 to 10
//1-Least Priority
//5-Normal or Default priority(which every threads has)
//10-Maximium priority
//By this we can just optimisa not control the threads
//it will always run based on the scheduler timings
//we can make the thread to sleep which will be in wait period
public class threadPriorityAndSleep {

	public static void main(String[] args) {
		Threads1 t1=new Threads1();
		Threads2 t2=new Threads2();
		t1.setPriority(Thread.MAX_PRIORITY-2);//8
		t1.start();
		try {
			t1.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
class Threads1 extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
		System.out.println("Thread 1 executes");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
class Threads2 extends Thread{
public void run() {
	for(int i=1;i<=20;i++) {
	System.out.println("Thread 2 executes");
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	}
}