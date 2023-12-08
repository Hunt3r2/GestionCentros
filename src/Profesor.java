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
	        this.setIdProfesor(generarIdProfesor());
	        this.setNombre(nombre);
	        this.setPrimerApellido(apellido);
	        this.setSegundoApellido(apellido2);
	        this.setTelefono(telefono);
	        this.setEmail(email);
	        this.setNumeroDocumento(numeroDocumento);
	        this.setSueldo(sueldo);
	        this.setDiasAsuntosPropios(diasAsuntosPropios);
	    	this.ID = ID;
	    	this.nombre = nombre;
	    	this.apellido = apellido;
	    	this.apellido2 = apellido2;
	    	this.email = email;
	    	this.telefono = telefono;
	    	this.numeroDocumento = numeroDocumento;
	    	this.sueldo = sueldo;
	    	this.diasAsuntosPropios = diasAsuntosPropios;
	        this.ID = generarIdProfesor();
	  
	    }
	 

	
	private void setIdProfesor() {
		this.ID = generarIdProfesor();
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


	private void setTelefono(String telefono) {
		this.telefono = telefono;			
	}


	void setPrimerApellido(String apellido) {
		this.apellido = apellido;
		
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}


	public static String generarIdProfesor() {
        String nuevoId = String.format("PROF%04d", contadorProfesor++);
        return nuevoId;
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



	public String getId() {
		return ID;
	}



	public int getDiasAsusntos() {
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
