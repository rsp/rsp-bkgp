/**
 *
 *  @author Pocztarski Rafał S13658
 *
 */

package Zad1;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String fname = System.getProperty("user.home") + "/tab.txt";            
		ArrayList<Integer> al = new ArrayList<Integer>();
		try (Scanner s = new Scanner(new File(fname))) {
			while (s.hasNext())	al.add(s.nextInt());
		} catch (Exception e) {
			System.out.println("***");
			System.exit(0);
		}
		int s = al.size();
		Integer[] t = al.toArray(new Integer[s]);
		for (int i = 0; i < s; i++)
			System.out.print(t[i] + (i < s-1 ? " " : "\n"));
		int m = Integer.MIN_VALUE;
		ArrayList<Integer> mi = new ArrayList<Integer>();
		for (int i = 0; i < s; i++) {
			if (i == 0 || t[i] > m) {
				mi = new ArrayList<Integer>();
				m = t[i];
			}
			if (t[i] == m) mi.add(i);
		}
		System.out.println(m);
		s = mi.size();
		for (int i = 0; i < s; i++)
			System.out.print(mi.get(i) + (i < s-1 ? " " : "\n"));
	}
}
