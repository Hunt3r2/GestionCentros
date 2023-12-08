
public class Asignatura {
	
	
	String IDprof;
	String nombre;
	String codigo;
	String notasAlumno;
	private String id;
	private Profesor profesorAsignado;
	int contadorAsignaturas = 1;
	
	public static void main(String[] args) {
		

	}
	
	public Asignatura(String IDprof, String nombre, String codigo, String notasAlumno, Profesor profesorAsignado, int contadorAsignaturas) {
		this.setNombre(nombre);
		this.setProfesorAsignado(profesorAsignado);
		this.nombre = nombre;
	    this.id = generarIdAsignatura(contadorAsignaturas++);

	}

	public String generarIdAsignatura(int contadorAsignaturas) {
	    return String.format("ASIG%04d", contadorAsignaturas + 1);
	}

	public void setNombre(String next) {
		this.nombre = next;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }
	public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNotasAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	private void borrarAsignatura() {
		if (asignaturaEliminada && contadorAsignaturas > 0) {
	        contadorAsignaturas--;
	    }
	}

}
