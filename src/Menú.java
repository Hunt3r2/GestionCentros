import java.util.Scanner;

public class Menú {
	
	Profesor profesores;
	Alumno Alumnos;
	Asignatura Asignaturas;
	
	
	Profesor[] vectorProfesor;
	Alumno[] vectorAlumno;
	Asignatura[] vectorAsignatura;
	boolean clasellena = false;
	static int contadorAlumnos = 1;
	static int contadorProfesores = 1;
	static int contadorAsignaturas = 1;

	
	public Menú() {
			profesores = new Profesor(null, null, null, null, null, null, null, 0, 0);
			this.vectorProfesor = new Profesor[2];
			Alumnos = new Alumno(null, null, null, null, null, null, null, null, null);
			this.vectorAlumno = new Alumno[4];
			Asignaturas = new Asignatura(null, null, null, null, null, 0);
			this.vectorAsignatura = new Asignatura[4];
			
		}
	
	Profesor nuevoProfesor = new Profesor(null, null, null, null, null, null, null, 0, 0);		
	Alumno nuevoAlumno = new Alumno(null, null, null, null, null, null, null, null, null);

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
				menu.opcionAsignatura();
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
		
	
		private void opcionAsignatura() {
		boolean volver = false;
		
		do {
			System.out.println("--------------------------------------------");
			System.out.println("ASIGNATURAS:");
			System.out.println("--------------------------------------------");
			System.out.println("1. Añadir asignatura.");
			System.out.println("2. Consultar asignaturas.");
			System.out.println("3. Asignar profesor a asignatura.");
			System.out.println("4. Matricular alumno en asignatura.");
			System.out.println("5. Poner nota alumno en asignatura.");
			System.out.println("6. Borrar asignatura.");
			System.out.println("7. Desmatricular alumno de asignatura.");
			System.out.println("8. Volver.");
			System.out.println("--------------------------------------------");
			System.out.println("OPCIÓN:");
			Scanner opcionA = new Scanner(System.in);
			int opcionAsignatura = opcionA.nextInt();
			
			switch(opcionAsignatura) {
			case 1:
				añadirAsignatura();
				break;
			case 2:
				consultarAsignaturas();
				break;
			case 3:
				asignarProfesorAsignatura();
				break;
			case 4:
				matricularAlumno();
				break;
			case 5:
				agregarNota();
				break;
			case 6:
				borrarAsignatura();
				break;
			case 7:
				break;
			case 8:
				volver = true;
				break;
			}
		}while(!volver);
		
	}


		private void consultarAsignaturas() {
			boolean hayAsignaturas = false;
			
			for (int i = 0; i < vectorAsignatura.length; i++) {
		        if (vectorAsignatura[i] != null) {
		            System.out.println(vectorAsignatura[i].getId() + ". " + vectorAsignatura[i].getNombre());
		            hayAsignaturas = true;
		        }
			}
			
			if (!hayAsignaturas) {
	            System.out.println("No hay asignaturas disponibles.");
	            return;
	        }
		        
		        System.out.println("Escoger asignatura (0: Volver al menú anterior):");
				System.out.println("OPCION:");
				
				Scanner asig = new Scanner(System.in);
				int elegirAsig = asig.nextInt();
				
				switch(elegirAsig) {
				case 0:
					return;
		        default:
		            if (elegirAsig > 0 && elegirAsig <= vectorAsignatura.length && vectorAsignatura[elegirAsig - 1] != null) {
		                System.out.println("--------------------------------------------");
		                System.out.println("Detalles de la asignatura seleccionada:");
		                System.out.println("--------------------------------------------");
		                System.out.println("Nombre: " + vectorAsignatura[elegirAsig - 1].getNombre());
		                System.out.println("Codigo: " + vectorAsignatura[elegirAsig - 1].getId());
		                Profesor profesorAsignado = vectorAsignatura[elegirAsig - 1].getProfesorAsignado();
		                if (profesorAsignado != null) {
		                System.out.println("Profesor: " + vectorAsignatura[elegirAsig - 1].getProfesorAsignado().getId());
		                System.out.println("Alumnos: " );
		                vectorAsignatura[elegirAsig - 1].getAlumnosMatriculados();
		                if (vectorAsignatura[elegirAsig - 1].getNotasAlumnos() != null) {
		                	System.out.println("Nota: " + vectorAsignatura[elegirAsig - 1].getNotasAlumnos());
		                }else {
		                	System.out.println("Sin nota registrada.");
		                }
		                }else {
		                    System.out.println("Profesor no asignado");
		                }
		            } else {
		                System.out.println("Opción no válida");
		            }
		            break;
		    }
		    
			
		}


		private void añadirAsignatura() {
			int huecoVectorAsignatura = espacioVectorAsignatura();
			Asignatura nuevaAsignatura = new Asignatura(null, null, null, null, null, 0);
			
			System.out.println("Introduzca el nombre de la asignatura (MAX 70 caracteres):");
			Scanner nom = new Scanner(System.in);
			nuevaAsignatura.setNombre(nom.next());
			nuevaAsignatura.setId("ASIG000" + contadorAsignaturas);
			this.vectorAsignatura[huecoVectorAsignatura] = nuevaAsignatura;
			contadorAsignaturas++;
			return;
			
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
	        boolean hayAlumnos = false;

			System.out.println("--------------------------------------------");
			System.out.println("Listado de alumnos:");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < vectorAlumno.length; i++) {
		        if (vectorAlumno[i] != null) {
		            System.out.println(vectorAlumno[i].getId() + ". " + vectorAlumno[i].getNombre());
		            hayAlumnos = true;
		        }
		        if (!hayAlumnos) {
		            System.out.println("No hay alumnos disponibles.");
		            return;
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
	                System.out.println("Detalles del alumno seleccionado:");
	                System.out.println("--------------------------------------------");
	                System.out.println("ID: " + vectorAlumno[elegirAlum - 1].getId());
	                System.out.println("Nombre: " + vectorAlumno[elegirAlum - 1].getNombre());
	                System.out.println("Apellido: " + vectorAlumno[elegirAlum - 1].getApellido());
	                System.out.println("Email: " + vectorAlumno[elegirAlum - 1].getEmail());
	                System.out.println("Teléfono: " + vectorAlumno[elegirAlum - 1].getTlfAlumno());
	                System.out.println("Documento: " + vectorAlumno[elegirAlum - 1].getNumeroDocumento());
	                if (vectorAlumno[elegirAlum - 1].getCiclo() == null) {
	                	System.out.println("Ciclo no seleccionado");
	                }
	                else {
	                	System.out.println("Ciclo: " + vectorAlumno[elegirAlum - 1].getCiclo());
	                }
	                
	            } else {
	                System.out.println("Opción no válida");
	            }
	            break;
	    }
	}

		public void consultarProfesor() {
			boolean volver = false;
			do {
	        boolean hayProfesores = false;

			System.out.println("--------------------------------------------");
			System.out.println("Listado de profesores:");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < vectorProfesor.length; i++) {
		        if (vectorProfesor[i] != null) {
		            System.out.println(vectorProfesor[i].getId() + ". " + vectorProfesor[i].getNombreCompleto());
	                hayProfesores = true;

		        }
		        
		        if (!hayProfesores) {
		            System.out.println("No hay profesores disponibles.");
		            return;
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
	                System.out.println("ID: " + vectorProfesor[elegirProf - 1].getId());
	                System.out.println("Nombre: " + vectorProfesor[elegirProf - 1].getNombre());
	                System.out.println("Apellido: " + vectorProfesor[elegirProf - 1].getApellido());
	                System.out.println("Email: " + vectorProfesor[elegirProf - 1].getEmail());
	                System.out.println("Teléfono: " + vectorProfesor[elegirProf - 1].getTlfProfesor());
	                System.out.println("Documento: " + vectorProfesor[elegirProf - 1].getNumeroDocumento());
	                System.out.println("Es tutor: ");
	                if (vectorProfesor[elegirProf - 1].esTutor == true) {
	                	System.out.println("si");
	                }
	                else {
	                	System.out.println("no");
	                }
	                System.out.println("Sueldo: " + vectorProfesor[elegirProf - 1].getSueldo());
	                System.out.println("Dias de Asuntos Propios: " + vectorProfesor[elegirProf - 1].getDiasAsusntos());
	            } else {
	                System.out.println("Opción no válida");
	            }
	            break;
	    }
			}while(!volver);
	}
			
		
		public void pedirDatosProfesor() {
			boolean volver = false;
			do {
				int huecoVectorProfesores = espacioVector();
				Profesor nuevoProfesor = new Profesor(null, null, null, null, null, null, null, 0, 0);

					
					System.out.println("Introduzca el nombre del profesor (MAX 30 caracteres):");
					Scanner nom = new Scanner(System.in);
					nuevoProfesor.setNombre(nom.next());
					System.out.println("Nombre: " + nuevoProfesor.nombre);
					System.out.println("Introduzca el primer apellido del profesor (MAX 40 caracteres): ");
					Scanner ape = new Scanner(System.in);
					nuevoProfesor.setPrimerApellido(ape.next());
					System.out.println("Apellido: " + nuevoProfesor.apellido);
					System.out.println("Introduzca el segundo apellido del profesor (opcional):");
					Scanner ape2 = new Scanner(System.in);	
					nuevoProfesor.setSegundoApellido(ape2.next());
					System.out.println("Segundo apellido: " + nuevoProfesor.apellido2);
					Scanner em = new Scanner(System.in);
					System.out.println("Introduzca el email del profesor (cadena@profesor.es):");
					nuevoProfesor.setEmail(em.next());
					System.out.println("Email: " + nuevoProfesor.email);
					Scanner dni = new Scanner(System.in);
					System.out.println("Introduzca el documento del profesor (DNI o NIE):");
					nuevoProfesor.setNumeroDocumento(dni.next());
					Scanner tlf = new Scanner(System.in);
					System.out.println("Introduzca el teléfono del profesor ([6,7 o 9] y 8 números):");
					nuevoProfesor.telefono = tlf.next();
					System.out.println("Telefono: " + nuevoProfesor.telefono);
					Scanner tutor = new Scanner(System.in);
					System.out.println("Introduzca si el profesor es tutor (0: no; 1: sí):");
					int esTutor = tutor.nextInt();
					switch(esTutor) {
					case 0:
						nuevoProfesor.setEsTutor(false);
						System.out.println("Es tutor?: no");
						break;
					case 1:
						nuevoProfesor.setEsTutor(true);
						System.out.println("Es tutor?: si");
						break;
					}
					Scanner sueldo = new Scanner(System.in);
					System.out.println("Introduzca el sueldo del profesor (>0):");
					nuevoProfesor.setSueldo(sueldo.nextInt());
					Scanner dias = new Scanner(System.in);
					System.out.println("Introduzca los días de asuntos propios del profesor (>=0):");
					nuevoProfesor.setDiasAsuntosPropios(dias.nextInt());
					nuevoProfesor.setNombre(nuevoProfesor.nombre);
					nuevoProfesor.setPrimerApellido(nuevoProfesor.apellido);			    
					nuevoProfesor.setId("PROF000" + (contadorProfesores));
					this.vectorProfesor[huecoVectorProfesores] = nuevoProfesor;
					contadorProfesores++;
					return;	
				
			}while(!volver);
		}
			
				
		
		public void añadirAlumno() {
			boolean volver = false;
			do {
			espacioVector();
			Alumnos.getNombre();
			Alumnos.getApellido();
			Alumnos.getEmail();
			Alumnos.getTlfAlumno();
			int huecoVectorAlumno = espacioVectorAlumno();

			if(huecoVectorAlumno<vectorAlumno.length) {
				Alumno nuevoAlumno = new Alumno(null, null, null, null, null, null, null, null, null);
			
				
			System.out.println("Introduzca el nombre del alumno (MAX 30 caracteres):");
			Scanner nom = new Scanner(System.in);
			nuevoAlumno.setNombre(nom.next());
			System.out.println("Nombre: " + nuevoAlumno.nombre);
			System.out.println("Introduzca el primer apellido del alumno (MAX 40 caracteres): ");
			Scanner ape = new Scanner(System.in);
			nuevoAlumno.setPrimerApellido(ape.next());
			System.out.println("Apellido: " + nuevoAlumno.apellido);
			System.out.println("Introduzca el segundo apellido del alumno (opcional):");
			Scanner ape2 = new Scanner(System.in);
			nuevoAlumno.setSegundoApellido(ape.next());
			System.out.println("Segundo apellido: " + nuevoAlumno.apellido);
			Scanner em = new Scanner(System.in);
			System.out.println("Introduzca el email del alumno (cadena@alumno.es):");
			nuevoAlumno.setEmail(em.next());
			System.out.println("Email: " + nuevoAlumno.email);
			Scanner dni = new Scanner(System.in);
			System.out.println("Introduzca el documento del alumno (DNI o NIE):");
			nuevoAlumno.setNumeroDocumento(dni.next());
			Scanner tlf = new Scanner(System.in);
			System.out.println("Introduzca el teléfono del alumno ([6,7 o 9] y 8 números):");
			nuevoAlumno.setTelefono(tlf.next());
			System.out.println("Telefono: " + nuevoAlumno.email);
			Scanner ciclo = new Scanner(System.in);
			System.out.println("Desea añadir el ciclo del alumno? (0: no; 1: si): ");
			int ciclo1 = ciclo.nextInt();
			switch(ciclo1) {
			case 1:
				Scanner ciclonom = new Scanner(System.in);
				System.out.println("Introduzca el nombre del ciclo al que pertenece: ");
				nuevoAlumno.setCiclo(ciclonom.next());
				System.out.println("Ciclo: " + nuevoAlumno.ciclo);
				
			case 0:
				volver = true;
			}
		    nuevoAlumno.setId("ALUM000" + (contadorAlumnos));
		    contadorAlumnos++;
			this.vectorAlumno[huecoVectorAlumno] = nuevoAlumno;
			
			}
			}while(!volver);
		}
		
		private String generarIdAlum() {
	        return String.format("ALUM%04d", contadorAlumnos++);
	    }
		
		private String generarIdProfesor() {
		    return String.format("PROF%04d", contadorProfesores);
		}
		
		

		
		private boolean idProfesorExistente(String ID) {
	        for (Profesor profesor : vectorProfesor) {
	            if (profesor != null && profesor.getId().equals(ID)) {
	                return true;
	            }
	        }
	        return false;
	    }
		
		private boolean idAlumnoExistente(String ID) {
	        for (Alumno alumnos : vectorAlumno) {
	            if (alumnos != null && alumnos.getId().equals(ID)) {
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
		
		private int espacioVectorAlumno() {
			int huecoVector = 0;
			for (int i = 0;i<vectorAlumno.length;i++) {
				if(vectorAlumno[i]== null) {
					huecoVector = i;
					break;
				}
			}
			return huecoVector;
		}
		
		private int espacioVectorAsignatura() {
			int huecoVector = 0;
			for (int i = 0;i<vectorAsignatura.length;i++) {
				if(vectorAsignatura[i] == null) {
					huecoVector = i;
					break;
				}
			}
			return huecoVector;
		}
		
		private void asignarProfesorAsignatura() {
		    consultarAsignaturas();
		    System.out.println("Seleccione el número de la asignatura a la que desea asignar un profesor:");
		    Scanner asig = new Scanner(System.in);
		    int numAsignatura = asig.nextInt();


		    if (numAsignatura > 0 && numAsignatura <= vectorAsignatura.length && vectorAsignatura[numAsignatura - 1] != null) {
		        for (int i = 0; i < vectorProfesor.length; i++) {
		            if (vectorProfesor[i] != null) {
		                System.out.println(vectorProfesor[i].getId() + ". " + vectorProfesor[i].getNombreCompleto());
		            }
		        }
		        int numProfesor;
		        Scanner prof = new Scanner(System.in);
		        do {
		            System.out.println("Seleccione el número del profesor que desea asignar a la asignatura (0 para cancelar):");
		            numProfesor = prof.nextInt();

		            if (numProfesor == 0) {
		                return;
		            }

		            if (numProfesor > 0 && numProfesor <= vectorProfesor.length && vectorProfesor[numProfesor - 1] != null) {
		                Profesor profesorSeleccionado = vectorProfesor[numProfesor - 1];
		                vectorAsignatura[numAsignatura - 1].setProfesorAsignado(profesorSeleccionado);
		                System.out.println("Profesor asignado correctamente a la asignatura.");
		                break;
		            } else {
		                System.out.println("Número de profesor no válido. Inténtelo de nuevo.");
		            }
		        } while (true);
		    } else {
		        System.out.println("Número de asignatura no válido.");
		    }
		}
		
		private void borrarAsignatura() {
		    System.out.println("--------------------------------------------");
		    System.out.println("Listado de asignaturas:");
		    System.out.println("--------------------------------------------");

		    for (int i = 0; i < vectorAsignatura.length; i++) {
		        if (vectorAsignatura[i] != null) {
		            System.out.println(i + 1 + ". " + vectorAsignatura[i].getNombre());
		        }
		    }

		    if (vectorAsignatura[0] == null) {
		        System.out.println("No hay asignaturas disponibles para borrar.");
		        return;
		    }

		    System.out.println("Seleccione el número de la asignatura que desea borrar (0 para volver):");
		    Scanner scanner = new Scanner(System.in);
		    int numAsignatura = scanner.nextInt();

		    if (numAsignatura == 0) {
		        return;
		    }

		    vectorAsignatura[numAsignatura - 1] = null;


		    System.out.println("Asignatura borrada correctamente.");
		}
		
		private void matricularAlumno() {
		    consultarAlumno();
		    System.out.println("Seleccione el número del alumno que desea matricular en una asignatura:");
		    int numAlumno = new Scanner(System.in).nextInt();

		    if (numAlumno > 0 && numAlumno <= vectorAlumno.length && vectorAlumno[numAlumno - 1] != null) {
		        consultarAsignaturas();
		        System.out.println("Seleccione el número de la asignatura en la que desea matricular al alumno:");
		        int numAsignatura = new Scanner(System.in).nextInt();

		        if (numAsignatura > 0 && numAsignatura <= vectorAsignatura.length && vectorAsignatura[numAsignatura - 1] != null) {
		            // Matricular al alumno en la asignatura
		            vectorAsignatura[numAsignatura - 1].matricularAlumno(vectorAlumno[numAlumno - 1]);
		            System.out.println("Alumno matriculado correctamente en la asignatura.");
		        } else {
		            System.out.println("Número de asignatura no válido.");
		        }
		    } else {
		        System.out.println("Número de alumno no válido.");
		    }
		}
		
		public void agregarNota() {
		    // Mostrar la lista de alumnos para seleccionar uno
		    System.out.println("Seleccione el número del alumno al que desea agregar la nota:");
		    for (int i = 0; i < vectorAlumno.length; i++) {
		        if (vectorAlumno[i] != null) {
		            System.out.println((i + 1) + ". " + vectorAlumno[i].getNombreCompleto());
		        }
		    }

		    int numAlumno = new Scanner(System.in).nextInt();

		    if (numAlumno > 0 && numAlumno <= vectorAlumno.length && vectorAlumno[numAlumno - 1] != null) {
		        // Seleccionar el alumno
		        Alumno alumnoSeleccionado = vectorAlumno[numAlumno - 1];

		        // Mostrar la lista de asignaturas para seleccionar una
		        System.out.println("Seleccione el número de la asignatura para agregar la nota:");
		        for (int i = 0; i < vectorAsignatura.length; i++) {
		            if (vectorAsignatura[i] != null) {
		                System.out.println((i + 1) + ". " + vectorAsignatura[i].getNombre());
		            }
		        }

		        int numAsignatura = new Scanner(System.in).nextInt();

		        if (numAsignatura > 0 && numAsignatura <= vectorAsignatura.length && vectorAsignatura[numAsignatura - 1] != null) {
		            // Solicitar la nota al usuario
		            System.out.println("Ingrese la nota (>=0 && <=10):");
		            double nota = new Scanner(System.in).nextDouble();

		            // Validar la nota
		            if (nota >= 0 && nota <= 10) {
		                // Agregar la nota al alumno en la asignatura seleccionada
		                alumnoSeleccionado.agregarNota(nota, numAsignatura - 1);
		                System.out.println("Nota agregada correctamente.");
		            } else {
		                System.out.println("La nota ingresada no es válida.");
		            }
		        } else {
		            System.out.println("Número de asignatura no válido.");
		        }
		    } else {
		        System.out.println("Número de alumno no válido.");
		    }
		}



		
		
		
		
		
		// para sacar los datos uso un bucle for con string format, tambien deberia hacer  
		
		
	

}
