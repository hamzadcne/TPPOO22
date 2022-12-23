package TD4POO;

import java.util.*;

public class TestcmpTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Nom> l = new ArrayList<Nom>();
		l.add(new Nom("Jacque", "Brel"));
		l.add(new Nom("Jackie", "Stewart"));
		l.add(new Nom("Jackie", "Chan"));
		Collections.sort(l);
		System.out.println("Comparable: " + l);

		PrenomComparator prenomCompartor = new PrenomComparator();
		Collections.sort(l, prenomCompartor);
		System.out.println("Comparator: " + l);
	}

}
