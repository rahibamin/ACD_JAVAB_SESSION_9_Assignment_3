package Session9.Assignments3;

import java.util.ArrayList;
import java.util.Collections;

public class tvTester {
	public static void main(String[] args) {
		ArrayList<HDTV> tv = new ArrayList<HDTV>();
		
		tv.add(new HDTV("Sony", 65));
		tv.add(new HDTV("LG", 50));
		tv.add(new HDTV("Samsung", 55));
		
		System.out.println("TV list:");
		System.out.println(tv.toString());
		
		System.out.println();
		Collections.sort(tv);
		System.out.println("Sort TV by Size");
		
		System.out.println(tv.toString());
	}
}
