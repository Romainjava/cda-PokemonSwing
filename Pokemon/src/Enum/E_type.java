package Enum;

public enum E_type {
	Combat(1,"Combat"),
	Dragon(2,"Dragon"),
	Eau(3,"Eau"),
	Electrique(4,"Electrique"),
	Feu(5,"Feu"),
	Glace(6,"Glace"),
	Insecte(7,"Insecte"),
	Normal(8,"Normal"),
	Plante(9,"Plante"),
	Poison(10,"Poison"),
	Psy(11,"Psy"),
	Roche(12,"Roche"),
	Sol(13,"Sol"),
	Spectre(14,"Spectre"),
	Vol(15,"Vol");
	public final int id;
	public final String label;
	
	private E_type(int id, String label) {
		this.id = id;
		this.label = label;
	}
}
