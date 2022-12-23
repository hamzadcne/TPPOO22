package TD4POO;

import java.util.*;

public class Exo1 {
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
		Collections.addAll(liste, "1", "3", "3", "1", "4", "5", "4");
		System.out.println(liste);
		HashSet<String> hash = new HashSet<String>(liste);
		System.out.println(hash);
		liste = new ArrayList<String>(hash);
		System.out.println(liste);
	}
}
