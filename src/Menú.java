import java.util.Scanner;

public class Menú {
	
	Profesor profesores;
	Alumno Alumnos;
	
	
	Profesor[] vectorProfesor;
	Alumno[] vectorAlumno;
	boolean clasellena = false;
	int contadorAlumnos;
	int contadorProfesores;
	
	public Menú() {
			profesores = new Profesor(null, null, null, null, null, null, null);
			this.vectorProfesor = new Profesor[4];
			Alumnos = new Alumno(null, null, null, null, null, null, null, null);
			this.vectorAlumno = new Alumno[2];
			
		}
	
	Profesor nuevoProfesor = new Profesor(null, null, null, null, null, null, null);		
	Alumno nuevoAlumno = new Alumno(null, null, null, null, null, null, null, null);

	public static void main(String[] args) {
		Menú menu;
		menu = new Menú();
		boolean salir = false;
	do {	
		
		System.out.println("Bienvenido al software de gestión de centros educativos.");
		System.out.println("--------------------------------------------");
		System.out.println("Por favor, escoja una de las opciones válidas:");
		System.out.println("--------------------------------------------");
		System.out.println("1. Menú de profesores.");
		System.out.println("2. Menú de asignaturas.");
		System.out.println("3. Menú de alumnos.");
		System.out.println("4. Salir del gestor.");
		System.out.println("--------------------------------------------");
		System.out.println("OPCION:");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				menu.opcionProfesor();
				break;
			case 2:
				break;
			case 3:
				menu.opcionAlumno();
				break;
			case 4:
                System.out.println("Gracias por usar nuestro software.");
        		System.out.println("CERRANDO...");
        		salir = true;
                break;
            default:
                System.out.println("Opción no válida");
        }
	} while(!salir);
		
	}
		
	
		public void opcionProfesor() {
			boolean volver = false;
			
		do {
			System.out.println("--------------------------------------------");
			System.out.println("PROFESORES:");
			System.out.println("--------------------------------------------");
			System.out.println("1. Añadir profesor.");
			System.out.println("2. Consultar datos profesor.");
			System.out.println("3. Volver.");
			System.out.println("--------------------------------------------");
			System.out.println("OPCION:");
			Scanner sc = new Scanner(System.in);
			int opcion1 = sc.nextInt();
			
			switch(opcion1) {
			case 1:
				pedirDatosProfesor();
				break;
			case 2:
				consultarProfesor();
				break;
			case 3:
				volver = true;
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(!volver);
		}
			
			public void opcionAlumno() {
				boolean volver = false;
				do {
				System.out.println("--------------------------------------------");
				System.out.println("ALUMNOS:");
				System.out.println("--------------------------------------------");
				System.out.println("1. Añadir alumno.");
				System.out.println("2. Consultar alumnos.");
				System.out.println("3. Volver.");
				System.out.println("--------------------------------------------");
				System.out.println("OPCION:");
				Scanner sc = new Scanner(System.in);
				int opcion1 = sc.nextInt();
				
				switch(opcion1) {
				case 1:
					añadirAlumno();
					break;
				case 2:
					consultarAlumno();
					break;
				case 3:
					volver = true;
					break;
				}
			
				}while(!volver);
			

		
		
		
	}
		
		private void consultarAlumno() {
			System.out.println("--------------------------------------------");
			System.out.println("Listado de alumnos:");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < vectorAlumno.length; i++) {
		        if (vectorAlumno[i] != null) {
		            System.out.println((generarIdAlum()) + ". " + vectorAlumno[i].getNombre());
		        }
		    }
			System.out.println("Escoger alumno (0: Volver al menú anterior):");
			System.out.println("OPCION:");
			
			Scanner sc4 = new Scanner(System.in);
			int elegirAlum = sc4.nextInt();
			
			switch(elegirAlum) {
			case 0:
				opcionAlumno();
	        default:
	            if (elegirAlum > 0 && elegirAlum <= vectorAlumno.length && vectorAlumno[elegirAlum - 1] != null) {
	                System.out.println("--------------------------------------------");
	                System.out.println("Detalles del profesor seleccionado:");
	                System.out.println("--------------------------------------------");
	                System.out.println("Nombre: " + vectorAlumno[elegirAlum - 1].getNombre());
	                System.out.println("Apellido: " + vectorAlumno[elegirAlum - 1].getApellido());
	                System.out.println("Email: " + vectorAlumno[elegirAlum - 1].getEmail());
	                System.out.println("Teléfono: " + vectorAlumno[elegirAlum - 1].getTlfAlumno());
	            } else {
	                System.out.println("Opción no válida");
	            }
	            break;
	    }
	}

		public void consultarProfesor() {
			System.out.println("--------------------------------------------");
			System.out.println("Listado de profesores:");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < vectorProfesor.length; i++) {
		        if (vectorProfesor[i] != null) {
		            System.out.println((generarIdProf()) + ". " + vectorProfesor[i].getNombre());
		        }
		    }
			System.out.println("Escoger profesor (0: Volver al menú anterior):");
			System.out.println("OPCION:");
			
			Scanner sc3 = new Scanner(System.in);
			int elegirProf = sc3.nextInt();
			
			switch(elegirProf) {
			case 0:
				Menú menu = new Menú();
				menu.opcionProfesor();
	        default:
	            if (elegirProf > 0 && elegirProf <= vectorProfesor.length && vectorProfesor[elegirProf - 1] != null) {
	                System.out.println("--------------------------------------------");
	                System.out.println("Detalles del profesor seleccionado:");
	                System.out.println("--------------------------------------------");
	                System.out.println("Nombre: " + vectorProfesor[elegirProf - 1].getNombre());
	                System.out.println("Apellido: " + vectorProfesor[elegirProf - 1].getApellido());
	                System.out.println("Email: " + vectorProfesor[elegirProf - 1].getEmail());
	                System.out.println("Teléfono: " + vectorProfesor[elegirProf - 1].getTlfProfesor());
	            } else {
	                System.out.println("Opción no válida");
	            }
	            break;
	    }
	}
		
		public void pedirDatosProfesor() {
				profesores.getNombre();
				profesores.getApellido();
				profesores.getEmail();
				profesores.getTlfProfesor();
				int huecoVectorProfesores = espacioVector();
				
				if(huecoVectorProfesores<vectorProfesor.length) {
					
					Profesor nuevoProfesor = new Profesor(null, null, null, null, null, null, null);
					String nuevoId;
					int intentos = 0;
			        do {
			            nuevoId = generarIdProf();
			            System.out.println("Intento " + (intentos + 1) + ": Nuevo ID generado: " + nuevoId);
			            
			            if (++intentos > 10) {
			               
			                System.out.println("¡Error! Bucle infinito detectado. Saliendo.");
			                return;
			            }
			        } while (idProfesorExistente(nuevoId));
					
					System.out.println("Introduzca el nombre del profesor (MAX 30 caracteres):");
					Scanner nom = new Scanner(System.in);
					nuevoProfesor.nombre = nom.next();
					System.out.println("Nombre: " + nuevoProfesor.nombre);
					System.out.println("Introduzca el primer apellido del profesor (MAX 40 caracteres): ");
					Scanner ape = new Scanner(System.in);
					nuevoProfesor.apellido = ape.next();
					System.out.println("Apellido: " + nuevoProfesor.apellido);
					System.out.println("Introduzca el segundo apellido del profesor (opcional):");
					Scanner ape2 = new Scanner(System.in);	
					nuevoProfesor.apellido2 = ape2.next();
					System.out.println("Segundo apellido: " + nuevoProfesor.apellido2);
					Scanner em = new Scanner(System.in);
					System.out.println("Introduzca el email del profesor (cadena@profesor.es):");
					nuevoProfesor.email = em.next();
					System.out.println("Email: " + nuevoProfesor.email);
					Scanner tlf = new Scanner(System.in);
					System.out.println("Introduzca el teléfono del profesor ([6,7 o 9] y 8 números):");
					nuevoProfesor.telefono = tlf.next();
					System.out.println("Telefono: " + nuevoProfesor.telefono);
					nuevoProfesor.setNombre(nuevoProfesor.nombre);
					nuevoProfesor.setPrimerApellido(nuevoProfesor.apellido);
					this.vectorProfesor[huecoVectorProfesores] = nuevoProfesor;
					return;
					
				}
				else {
					System.out.println("La clase está llena");
				}
		}
		
		public void añadirAlumno() {
			Alumnos.getNombre();
			Alumnos.getApellido();
			Alumnos.getEmail();
			Alumnos.getTlfAlumno();
			int huecoVectorAlumno = espacioVector();
			
			if(huecoVectorAlumno<vectorAlumno.length) {
				Alumno nuevoAlumno = new Alumno(null, null, null, null, null, null, null, null);
			
				
			System.out.println("Introduzca el nombre del alumno (MAX 30 caracteres):");
			Scanner nom = new Scanner(System.in);
			nuevoAlumno.nombre = nom.next();
			System.out.println("Nombre: " + nuevoAlumno.nombre);
			System.out.println("Introduzca el primer apellido del alumno (MAX 40 caracteres): ");
			Scanner ape = new Scanner(System.in);
			nuevoAlumno.apellido = ape.next();
			System.out.println("Apellido: " + nuevoAlumno.apellido);
			System.out.println("Introduzca el segundo apellido del alumno (opcional):");
			Scanner ape2 = new Scanner(System.in);	
			nuevoAlumno.apellido = ape.next();
			System.out.println("Segundo apellido: " + nuevoAlumno.apellido);
			Scanner em = new Scanner(System.in);
			System.out.println("Introduzca el email del alumno (cadena@alumno.es):");
			nuevoAlumno.email = em.next();
			System.out.println("Email: " + nuevoAlumno.email);
			System.out.println("Introduzca el teléfono del alumno ([6,7 o 9] y 8 números):");
			nuevoAlumno.email = em.next();
			System.out.println("Telefono: " + nuevoAlumno.email);
			this.vectorAlumno[huecoVectorAlumno] = nuevoAlumno;
			}
		}
		
		private String generarIdProf() {
	        return String.format("PROF%04d", contadorProfesores++);
	    }
		
		private String generarIdAlum() {
	        return String.format("ALUM%04d", contadorAlumnos++);
	    }
		
		private boolean idProfesorExistente(String ID) {
	        for (Profesor profesor : vectorProfesor) {
	            if (profesor != null && profesor.getId(ID).equals(ID)) {
	                return true;
	            }
	        }
	        return false;
	    }
		
		private boolean idAlumnoExistente(String ID) {
	        for (Alumno alumnos : vectorAlumno) {
	            if (alumnos != null && alumnos.getId(ID).equals(ID)) {
	                return true;
	            }
	        }
	        return false;
	    }
		
		private int espacioVector() {
			int huecoVector = 0;
			for (int i = 0;i<vectorProfesor.length;i++) {
				if(vectorProfesor[i]== null) {
					huecoVector = i;
					break;
				}
			}
			return huecoVector;
		}
		
		
		// para sacar los datos uso un bucle for con string format, tambien deberia hacer  
		
		
	

}
