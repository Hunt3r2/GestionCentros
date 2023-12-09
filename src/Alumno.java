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
	private static int contadorAlumno = 1;
	double[] notas;
	String numeroID[] = new String[] {"0","1","2","3","4"};
	
	 public Alumno(String nombre, String primerApellido, String telefono, String email, String numeroDocumento, String ID, String apellido2, String apellido, String ciclo) {
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
	    	this.notas = new double[4];
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

	public String getId() {
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

	public void setId(String ID) {
        this.ID = ID;
		
	}

	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}



	public double[] getNotas() {
		return notas;
	}



	public void setNotas() {
		this.notas = notas;
	}



	public void agregarNota(double nota, int indiceAsignatura) {
        // Asegurarse de que el índice esté dentro del rango del array de notas
        if (indiceAsignatura >= 0 && indiceAsignatura < notas.length) {
            // Asegurarse de que la nota está dentro del rango permitido
            if (nota >= 0 && nota <= 10) {
                // Asignar la nota al índice correspondiente
                notas[indiceAsignatura] = nota;
            } else {
                System.out.println("La nota ingresada no es válida. Debe estar entre 0 y 10.");
            }
        } else {
            System.out.println("Índice de asignatura no válido.");
        }
    }
	

}
