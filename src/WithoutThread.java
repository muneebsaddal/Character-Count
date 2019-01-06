import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class WithoutThread{
	public void count() {
		long startTime = System.nanoTime();
		Hashtable <Character,Integer> wordCount = new Hashtable <Character, Integer>();
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
			for(String line; (line = br.readLine()) != null;) {
				for(int i = 0; i < line.length(); i++) {
					char token = line.charAt(i);
					if((wordCount.containsKey(token))) {
						wordCount.put(token, wordCount.get(token) + 1);
					}else {
						wordCount.put(token, 1);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		System.out.println("\tElapsed nanoseconds: " + executionTime);
		System.out.println(wordCount);
	}
}
