
public class MaxGeneric {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Le max de T est "+ Max(null));
		Double[] liste1 = new Double[] { 12.0, 25.0, 65.0, 88.0 };
		System.out.println("Le max de T est "+ Max(liste1));
		
		String[] liste2 = new String[] { "ab", "AB"};
		System.out.println("Le max de T est "+ Max(liste2));

	}
	
	static <T extends Comparable<T>> T Max(T[] tab) {
		if (tab == null || tab.length == 0) {
			return null;
		}
		T max = tab[0];
		for (T d : tab) {
			if (d.compareTo(max)>0)
				max = d;
		}
		return max;
	}

}
