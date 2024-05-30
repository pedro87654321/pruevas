package hero1;

import java.util.Scanner;

public class Spclase {

	public static void main (String[] args) {
		Scanner ING = new Scanner(System.in);
		
		Persona p1  = new Persona(null, 0);
		Persona p2  = new Persona(null, 0);
		Persona p3  = new Persona(null, 0);
		Sphero Sp = new Sphero(null, 0);
		Sphero Sp2 = new Sphero(null, 0);
        Villano vll = new Villano(null,0);
        Villano vll2 = new Villano(null,0);
		int a=0;
		
		p2.setName("carlos");
		p2.setEdad(38);
		Sp2.setHname("linterna verde");
		Sp2.setPoder("anillo magico");
		p3.setName("brayan");
		p3.setEdad(45);
		vll2.setVname("thanos");
		vll2.setPoder("las gemas del poder");
		
		System.out.println("ingrese nombre");
	    p1.setName(ING.nextLine());
	    System.out.println("ingrese edad");
	    p1.setEdad(ING.nextInt());
	    
	    System.out.println("oprima (1) heroe (2) villano");
	    a=ING.nextInt();
	     if(a<1 || a>2) {
			System.out.println("valor incorrecto");
		    System.out.println("opima (1) heroe (2) villano");
		    a=ING.nextInt();
		    }
	    if(a==1) {
		System.out.println("ingrese nombre de heroe");
		Sp.setHname(ING.nextLine());
		Sp.setHname(ING.nextLine());
		System.out.println("que poder tiene");
		Sp.setPoder(ING.nextLine());
	    }
	    if(a==2) {
			System.out.println("ingrese nombre de villano ");
			vll.setVname(ING.nextLine());
			vll.setVname(ING.nextLine());
			System.out.println("que poderes tiene");
			vll.setPoder(ING.nextLine());
		
		    }
	   
	    if(a>0 || a<2) {
	    	String p=null;
	    	switch(a) {
	    	case 1:p="HEROE";break;
	    	case 2:p="VILLANO";break;
	    	}
	    System.out.println();
		System.out.println("tu eres:"+p);
		System.out.println("nombre: "+p1.getName());
		System.out.println("edad: "+p1.getEdad());
		if(a==1)
		{
		System.out.println("identidad secreta: "+Sp.getHname());
		System.out.println("super poder: "+Sp.getPoder());
		}
		if(a==2)
		{
		System.out.println("identidad secreta: "+vll.getVname());
		System.out.println("super poder: "+vll.getPoder());
		}
		System.out.println();
		System.out.println("HEROE:");
		System.out.println("nombre: "+p2.getName());
		System.out.println("edad: "+p2.getEdad());
		System.out.println("identidad secreta: "+Sp2.getHname());
		System.out.println("super poder: "+Sp2.getPoder());
		System.out.println();
		System.out.println("VILLANO:");
		System.out.println("nombre: "+p3.getName());
		System.out.println("edad: "+p3.getEdad());
		System.out.println("identidad secreta: "+vll2.getVname());
		System.out.println("super poder: "+vll2.getPoder());
		
	    }
	    
	}

}
