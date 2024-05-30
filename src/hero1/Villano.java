package hero1;

public class Villano extends Persona{

	String Vname;
    String poder;

	public Villano(String name, int edad) {
		super(name, edad);
	}

	public String getVname() {
		return Vname;
	}
	public void setVname(String vname) {
		Vname = vname;
	}
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}

	
}
