import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Thread3 extends Thread{
	private Hashtable <Character,Integer> wordCount;
	
	Thread3(Hashtable<Character,Integer> wordCount){
		this.wordCount = wordCount;
	}
	
	public void run() {
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
			for(String line; (line = br.readLine()) != null;) {
				for(int i = 0; i < line.length(); i++) {
					char token = line.charAt(i);
					if(token >= 172 && token <= 255) {
						if((wordCount.containsKey(token))) {
							wordCount.put(token, wordCount.get(token) + 1);
						}else {
							wordCount.put(token, 1);
						}
					}
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
