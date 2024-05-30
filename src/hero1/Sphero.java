package hero1;

public class Sphero extends Persona {
	
	String hname;
    String poder;
	public Sphero(String name, int edad) {
		super(name, edad);
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}		
}