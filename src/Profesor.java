import java.util.Scanner;

public class Profesor {
	
	Menú menu;

	public static void main(String[] args) {
		
		
	}
	
	
	String ID;
	String nombre;
	String apellido;
	String apellido2;
	String email;
	String telefono;
	String numeroDocumento = "p";
	String numeroID[] = new String[] {"0","1","2","3","4"};
	
	 public Profesor(String ID, String nombre, String apellido,String apellido2, String email, String telefono, String numeroDocumento) {
	        this.setIdProfesor(generarIdProfesor());
	        this.setNombre(nombre);
	        this.setPrimerApellido(apellido);
	        this.setSegundoApellido(apellido2);
	        this.setTelefono(telefono);
	        this.setEmail(email);
	        this.setNumeroDocumento(numeroDocumento);
	    	this.ID = ID;
	    	this.nombre = nombre;
	    	this.apellido = apellido;
	    	this.apellido2 = apellido2;
	    	this.email = email;
	    	this.telefono = telefono;
	    	this.numeroDocumento = numeroDocumento;
	        
	  
	    }
	 

	
	private void setIdProfesor(Object generarIdProfesor) {
		// TODO Auto-generated method stub
		
	}


	void setSegundoApellido(String apellido2) {
		this.apellido2 = apellido2;
		
	}


	private void setDiasAsuntosPropios(int diasAsuntosPropios) {
		// TODO Auto-generated method stub
		
	}


	private void setSueldo(double sueldo) {
		// TODO Auto-generated method stub
		
	}


	private void setEsTutor(boolean esTutor) {
		// TODO Auto-generated method stub
		
	}


	private void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
		
	}


	void setEmail(String email) {
		this.email = email;
		
	}


	private void setTelefono(String telefono) {
		this.telefono = telefono;			
	}


	void setPrimerApellido(String apellido) {
		this.apellido = apellido;
		
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}


	private Object generarIdProfesor() {
		// TODO Auto-generated method stub
		return null;
	}


	public String añadirProfesor() {
		System.out.println("Introduzca el nombre del profesor (MAX 30 caracteres):");
		Scanner nom = new Scanner(System.in);
		this.nombre = nom.next();
		System.out.println("Nombre: " + nombre);
		System.out.println("Introduzca el primer apellido del profesor (MAX 40 caracteres): ");
		Scanner ape = new Scanner(System.in);
		this.apellido = ape.next();
		System.out.println("Apellido: " + apellido);
		System.out.println("Introduzca el segundo apellido del profesor (opcional):");
		Scanner ape2 = new Scanner(System.in);	
		this.apellido = ape.next();
		System.out.println("Segundo apellido: " + apellido);
		Scanner em = new Scanner(System.in);
		System.out.println("Introduzca el email del profesor (cadena@profesor.es):");
		this.email = em.next();
		System.out.println("Email: " + email);
		System.out.println("Introduzca el teléfono del profesor ([6,7 o 9] y 8 números):");
		this.email = em.next();
		System.out.println("Telefono: " + telefono);
		return nombre;
	}
	
	
		void profesor1() {
		System.out.println("--------------------------------------------");
		System.out.println("INFO PROFESOR:");
		System.out.println("ID: " + ID);
		System.out.println("Nombre: " + nombre1);
		System.out.println("--------------------------------------------");
	}
	
	public String setNombreProfesor() {
		nombre = "pepe";
		return nombre;
	}


	
	public String getIdProfesor() {
		return ID;
	}
	
	public void setIdProfesor(String idProfesor) {
		this.ID = ID;
	}
	
	public String getNombre() {
		return nombre;
	}


	public String getTlfProfesor() {
		return telefono;
		
	}


	public String getEmail() {
		return email;
		
	}


	public String getApellido() {
		return apellido;
		
	}



	public Object getId(String ID) {
		// TODO Auto-generated method stub
		return ID;
	}
	
	
	

}
