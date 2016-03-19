/**
 *
 *  @author Pocztarski Rafał S13658
 *
 */

package Zad2;

import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class CountWords {
	
	ArrayList<String> r = new ArrayList<>();
	
	CountWords(String f) {
		HashMap<String,Integer> m = new HashMap<>();
		try (Scanner s = new Scanner(new File(f))) {
			s.useDelimiter("[\\p{P}\\s]+");
			while (s.hasNext())	{
				String w = s.next();
				m.put(w, (m.containsKey(w)?m.get(w)+1:1));
			}
		} catch (Exception e) {
			System.out.println("***");
			System.exit(0);
		}
		for (String k: m.keySet())
		    r.add(k + " " + m.get(k));
	}

	ArrayList<String> getResult() {
		return r;
	}

}  
