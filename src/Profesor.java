import java.util.Scanner;

public class Profesor {
	
	public static void main(String[] args) {
		
		
	}
	
	
	String ID;
	String nombre;
	String apellido;
	String apellido2;
	String email;
	String telefono;
	String numeroDocumento = "p";
	Boolean esTutor;
	String tutor;
	int sueldo = 0;
	int diasAsuntosPropios;
	private static int contadorProfesor = 1;
	String numeroID[] = new String[] {"0","1","2","3","4"};
	
	 public Profesor(String ID, String nombre, String apellido,String apellido2, String email, String telefono, String numeroDocumento, int diasAsuntosPropios, int sueldo) {
	        this.setNombre(nombre);
	        this.setPrimerApellido(apellido);
	        this.setSegundoApellido(apellido2);
	        this.setTelefono(telefono);
	        this.setEmail(email);
	        this.setNumeroDocumento(numeroDocumento);
	        this.setSueldo(sueldo);
	        this.setDiasAsuntosPropios(diasAsuntosPropios);
	    	this.nombre = nombre;
	    	this.apellido = apellido;
	    	this.apellido2 = apellido2;
	    	this.email = email;
	    	this.telefono = telefono;
	    	this.numeroDocumento = numeroDocumento;
	    	this.sueldo = sueldo;
	    	this.diasAsuntosPropios = diasAsuntosPropios;
	        this.ID = ID;
	  
	    }
	 



	void setSegundoApellido(String apellido2) {
		this.apellido2 = apellido2;
		
	}


	void setDiasAsuntosPropios(int nextInt) {
		this.diasAsuntosPropios = nextInt;
		
	}


	void setSueldo(int sueldo) {
		this.sueldo = sueldo;
		
	}


	void setEsTutor(boolean esTutor) {
		this.esTutor = esTutor;
		
	}


	void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
		
	}


	void setEmail(String email) {
		this.email = email;
		
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;			
	}


	void setPrimerApellido(String apellido) {
		this.apellido = apellido;
		
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
		
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
	
	public String getApellido2() {
		return apellido2;
	}



	public String getId() {
		return ID;
	}



	public int getDiasAsuntos() {
		return diasAsuntosPropios;
	}



	public int getSueldo() {
		return sueldo;
	}



	public String getEsTutor() {
		return tutor;
	}



	public String getNumeroDocumento() {
		return numeroDocumento;
	}



	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}



	public void setId(String ID) {
        this.ID = ID;
    }



	
	
	

}
