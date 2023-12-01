import java.util.Scanner;

public class Alumno {

	public static void main(String[] args) {
		
		
	}
	
	String ID ;
	String nombre;
	String apellido;
	String apellido2;
	String email;
	String tlf;
	String ni;
	String numeroID[] = new String[] {"0","1","2","3","4"};
	
	 public Alumno(String nombre, String primerApellido, String telefono, String email, String numeroDocumento, boolean esTutor, double sueldo, int diasAsuntosPropios) {
	        this.setIdAlumno(generarIdAlumno());
	        this.setNombre(nombre);
	        this.setPrimerApellido(primerApellido);
	        this.setTelefono(telefono);
	        this.setEmail(email);
	        this.setNumeroDocumento(numeroDocumento);
	        this.setSegundoApellido(""); 
	    }
	 
	 private void setIdAlumno(Object generarIdAlumno) {
		// TODO Auto-generated method stub
		
	}

	public String añadirAlumno() {
			System.out.println("Introduzca el nombre del alumno (MAX 30 caracteres):");
			Scanner nom = new Scanner(System.in);
			this.nombre = nom.next();
			System.out.println("Nombre: " + nombre);
			System.out.println("Introduzca el primer apellido del alumno (MAX 40 caracteres): ");
			Scanner ape = new Scanner(System.in);
			this.apellido = ape.next();
			System.out.println("Apellido: " + apellido);
			System.out.println("Introduzca el segundo apellido del alumno (opcional):");
			Scanner ape2 = new Scanner(System.in);	
			this.apellido = ape.next();
			System.out.println("Segundo apellido: " + apellido);
			Scanner em = new Scanner(System.in);
			System.out.println("Introduzca el email del alumno (cadena@alumno.es):");
			this.email = em.next();
			System.out.println("Email: " + email);
			System.out.println("Introduzca el teléfono del alumno ([6,7 o 9] y 8 números):");
			this.email = em.next();
			System.out.println("Telefono: " + email);
			
			return nombre;
		}

	private void setSegundoApellido(String string) {
		// TODO Auto-generated method stub
		
	}

	private Object generarIdAlumno() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setNumeroDocumento(String numeroDocumento) {
		// TODO Auto-generated method stub
		
	}

	private void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	private void setTelefono(String telefono) {
		// TODO Auto-generated method stub
		
	}

	private void setPrimerApellido(String primerApellido) {
		// TODO Auto-generated method stub
		
	}

	private void setNombre(String nombre2) {
		// TODO Auto-generated method stub
		
	}

}
