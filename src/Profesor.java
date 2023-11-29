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
	
	 public Profesor(String nombre, String primerApellido, String telefono, String email, String numeroDocumento, boolean esTutor, double sueldo, int diasAsuntosPropios) {
	        this.setIdProfesor(generarIdProfesor());
	        this.setNombre(nombre);
	        this.setPrimerApellido(primerApellido);
	        this.setTelefono(telefono);
	        this.setEmail(email);
	        this.setNumeroDocumento(numeroDocumento);
	        this.setEsTutor(esTutor);
	        this.setSueldo(sueldo);
	        this.setDiasAsuntosPropios(diasAsuntosPropios);
	        this.setSegundoApellido(""); 
	    }

	
	private void setIdProfesor(Object generarIdProfesor) {
		// TODO Auto-generated method stub
		
	}


	private void setSegundoApellido(String string) {
		// TODO Auto-generated method stub
		
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


	private Object generarIdProfesor() {
		// TODO Auto-generated method stub
		return null;
	}


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
		return tlf;
		
	}


	public String getEmail() {
		return email;
		
	}


	public String getApellido() {
		return apellido;
		
	}
	

}
