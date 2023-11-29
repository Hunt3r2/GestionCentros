import java.util.Scanner;

public class Profesor {
	
	Menú menu;

	public static void main(String[] args) {
		
		
	}
	
	
	String ID ;
	String nombre;
	String apellido;
	String email;
	String tlf;
	String ni;
	String numeroID[] = new String[] {"0","1","2","3","4"};

	
	public String añadirProfesor() {
		Scanner sc2 = new Scanner(System.in);
		this.nombre = sc2.next();
		System.out.println("Nombre: " + nombre);
		System.out.println("Introduzca el primer apellido del profesor (MAX 40 caracteres): ");
		Scanner ape = new Scanner(System.in);
		this.apellido = ape.next();
		System.out.println("Apellido: " + apellido);
		return nombre;
	}
	
	
	public String IDañadir() {
		for (int i = 0;i < 2; i++) {
			ID = "000" + numeroID[i];
		}
		return ID;
	}

	void profesor1() {
		System.out.println("--------------------------------------------");
		System.out.println("INFO PROFESOR:");
		System.out.println("ID: " + ID);
		System.out.println("Nombre: " + nombre1);
		System.out.println("--------------------------------------------");
	}

	public String getNombre1() {
		return nombre;
	}
	
	public String setNombreProfesor() {
		nombre = "pepe";
		return nombre;
	}


	public void getNombreAlumno() {
		// TODO Auto-generated method stub
		
	}
	

}
