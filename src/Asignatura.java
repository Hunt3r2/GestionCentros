
public class Asignatura {
	
	
	String IDprof;
	String nombre;
	String codigo;
	double[] notasAlumno;
	String id;
	private Profesor profesorAsignado;
	private static int contadorAsignaturas;
	private Alumno[] alumnosMatriculados;
    private int contadorAlumnosMatriculados;
	
	public static void main(String[] args) {
		

	}
	
	public Asignatura(String IDprof, String nombre, String codigo, String notasAlumno, Profesor profesorAsignado, int contadorAsignaturas) {
		this.setNombre(nombre);
		this.setProfesorAsignado(profesorAsignado);
		this.nombre = nombre;
	    this.id = generarIdAsignatura(contadorAsignaturas++);
	    this.alumnosMatriculados = new Alumno[4]; 
        this.contadorAlumnosMatriculados = 0;

	}

	public String generarIdAsignatura(int contadorAsignaturas) {
		contadorAsignaturas++;
	    return String.format("ASIG%04d", contadorAsignaturas);
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
	public void matricularAlumno(Alumno alumno) {
        if (contadorAlumnosMatriculados < alumnosMatriculados.length) {
            alumnosMatriculados[contadorAlumnosMatriculados++] = alumno;
        } else {
            System.out.println("No hay espacio para más alumnos en la asignatura.");
        }
    }

	public void getAlumnosMatriculados() {
	    if (contadorAlumnosMatriculados > 0) {
	        for (int i = 0; i < contadorAlumnosMatriculados; i++) {
	            System.out.println("- " + alumnosMatriculados[i].getId());
	        }
	    } else {
	        System.out.println("No hay alumnos matriculados en esta asignatura.");
	    }
	}
	
	public void obtenerNotas() {
        for (Alumno alumno : alumnosMatriculados) {
            if (alumno != null) {
                System.out.print(alumno.getNombreCompleto() + ": ");
                notasAlumno = alumno.getNotas();
                for (Double nota : notasAlumno) {
                    System.out.print(nota + " ");
                }
                System.out.println();
            }
        }
    }

}
