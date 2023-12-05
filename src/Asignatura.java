
public class Asignatura {
	
	
	String IDprof;
	String nombre;
	String codigo;
	String notasAlumno;
	private Profesor profesorAsignado;
	
	public static void main(String[] args) {
		

	}
	
	public Asignatura(String IDprof, String nombre, String codigo, String notasAlumno) {
		
	}

	public void setNombre(String next) {
		this.nombre = next;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setProfesorAsignado(Profesor profesor) {
        this.profesorAsignado = profesor;
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

}
