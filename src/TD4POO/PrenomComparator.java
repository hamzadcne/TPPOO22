package TD4POO;

import java.util.Comparator;

public class PrenomComparator implements Comparator<Nom> {
	
	public int compare(Nom r1, Nom r2) {
		int prenomComp = r1.valPrenom().compareTo(r2.valPrenom());
		if (prenomComp != 0)
			return prenomComp;
		else
			return r1.valNom().compareTo(r2.valNom());
	}
}
