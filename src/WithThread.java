import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

public class WithThread extends Thread{
	
	public void count() {
		Hashtable <Character,Integer> wordCount = new Hashtable <Character, Integer>();
		long startTime = System.nanoTime();
		Thread1 t1 = new Thread1(wordCount);
		t1.start();
		Thread2 t2 = new Thread2(wordCount);
		t2.start();
		Thread3 t3 = new Thread3(wordCount);
		t3.start();
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		try { TimeUnit.SECONDS.sleep(1); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println("\tElapsed nanoseconds: " + executionTime);
		System.out.println(wordCount);
		}
	}

