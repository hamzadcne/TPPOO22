package TD4POO;

public class Nom implements Comparable<Nom> {
	private String prenom, nom;

	String valNom() {
		return nom;
	}

	String valPrenom() {
		return prenom;
	}

	public Nom(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	@Override
	public int compareTo(Nom o) {
		// TODO: check null
		return this.prenom.compareTo(o.prenom);
	}

	@Override
	public String toString() {
		return prenom + " " + nom;
	}
}
