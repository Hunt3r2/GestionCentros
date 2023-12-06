import java.util.Scanner;

public class Alumno {

	public static void main(String[] args) {
		
		
	}
	
	String ID ;
	String nombre;
	String apellido;
	String apellido2;
	String email;
	String telefono;
	String numeroDocumento;
	String ciclo;
	String numeroID[] = new String[] {"0","1","2","3","4"};
	
	 public Alumno(String nombre, String primerApellido, String telefono, String email, String numeroDocumento, String ID, String apellido2, String apellido, String ciclo) {
	        this.setIdAlumno(generarIdAlumno());
	        this.setNombre(nombre);
	        this.setPrimerApellido(primerApellido);
	        this.setTelefono(telefono);
	        this.setEmail(email);
	        this.setNumeroDocumento(numeroDocumento);
	        this.setSegundoApellido(""); 
	        this.setCiclo(ciclo);
	        this.ID = ID;
	    	this.nombre = nombre;
	    	this.apellido = apellido;
	    	this.apellido2 = apellido2;
	    	this.email = email;
	    	this.telefono = telefono;
	    	this.numeroDocumento = numeroDocumento;
	    	this.ciclo = ciclo;
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

	void setSegundoApellido(String next) {
		this.apellido2 = next;
		
	}

	private Object generarIdAlumno() {
		// TODO Auto-generated method stub
		return null;
	}

	void setNumeroDocumento(String next) {
		this.numeroDocumento = next;
		
	}

	void setEmail(String next) {
		this.email = next;
		
	}

	void setTelefono(String next) {
		this.telefono = next;
		
	}

	void setPrimerApellido(String next) {
		this.apellido = next;
		
	}

	void setNombre(String next) {
		this.nombre = next;
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	public String getTlfAlumno() {
		return telefono;		
	}

	public Object getId(String ID) {
		// TODO Auto-generated method stub
		return ID;
	}

	public void setCiclo(String next) {
		this.ciclo = next;
		
	}

	public String getCiclo() {
		return ciclo;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

}
