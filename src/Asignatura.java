
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

	public double[] getNotasAlumnos() {
		return notasAlumno;
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
        for (int i = 0; i < alumnosMatriculados.length; i++) {
            if (alumnosMatriculados[i] == null) {
                alumnosMatriculados[i] = alumno;
                // Agrega la asignatura a las matriculadas por el alumno
                alumno.matricularEnAsignatura(this);
                break;
            }
        }
    }

	public void getAlumnosMatriculados() {
	    if (contadorAlumnosMatriculados > 0) {
	        System.out.println("Alumnos matriculados en la asignatura:");
	        for (int i = 0; i < contadorAlumnosMatriculados; i++) {
	            Alumno alumno = alumnosMatriculados[i];
	            if (alumno != null) {
	                System.out.println(alumno.getId() + ". " + alumno.getNombreCompleto());
	            }
	        }
	    } else {
	        System.out.println("No hay alumnos matriculados en esta asignatura.");
	    }
	}

	    
	
	public void desmatricularAlumno(Alumno alumno) {
	    for (int i = 0; i < contadorAlumnosMatriculados; i++) {
	        if (alumnosMatriculados[i] != null && alumnosMatriculados[i].equals(alumno)) {
	            // Desmatricular al alumno de la asignatura
	            alumnosMatriculados[i] = null;

	            // Desmatricular la asignatura del alumno
	            alumno.desmatricularDeAsignatura(this);

	            System.out.println("Alumno desmatriculado correctamente de la asignatura.");
	            return;
	        }
	    }
	    System.out.println("El alumno no está matriculado en esta asignatura.");
	}

	
	public void consultarAlumnosMatriculados() {
        System.out.println("Alumnos matriculados en la asignatura:");
        for (int i = 0; i < alumnosMatriculados.length; i++) {
            if (alumnosMatriculados[i] != null) {
                System.out.println(alumnosMatriculados[i].getId() + ". " + alumnosMatriculados[i].getNombreCompleto());
            }
        }
    }

	

}
