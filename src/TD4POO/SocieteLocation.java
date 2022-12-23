package TD4POO;

import java.util.*;

public class SocieteLocation {
	ArrayList<Loueur> loueurs;
	ArrayList<Vehicule> vehicules;
	
	ArrayList<String> recherche(String rech){
		ArrayList<String> result= new ArrayList<String>();
		
		for(Vehicule v : vehicules) {
			String crit= v.getCritereRecherche();
			if(crit.contains(rech))
				result.add(v.getReference());
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
