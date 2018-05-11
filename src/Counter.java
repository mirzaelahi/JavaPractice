/*
 * Author: Mirza Elahi
 * Class: Counter
 * Book Page: 65
 */
public class Counter {
	
	private String pid="";
	private int count = 0;
	
	/*
	 * Constructor
	 */
	public Counter( String id ) {
		pid = id;
	}
	
	/*
	 * increment counter
	 */
	public void increment() {
		this.count++;
	}
	
	public int tally() {
		return this.count;
	}
	
	public String toString() {
		return pid + " : " + Integer.toString(this.count);
	}
	
	public static void main( String[] argv ) {
		Counter a = new Counter("hello");
		a.increment();
		a.increment();
		
		System.out.println(a.toString());
	}
	

}
